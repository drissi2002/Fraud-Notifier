package tn.demo.customer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.demo.amqp.RabbitMQMessageProducer;
import tn.demo.clients.fraud.FraudCheckResponse;
import tn.demo.clients.fraud.FraudClient;
import tn.demo.clients.notification.NotificationClient;
import tn.demo.clients.notification.NotificationRequest;
import tn.demo.customer.repository.CustomerRepository;
import tn.demo.customer.model.Customer;
import tn.demo.customer.model.CustomerRegistrationRequest;

@Service
@AllArgsConstructor
public class CustomerService{

    private final CustomerRepository customerRepository ;
    private final FraudClient fraudClient;
    //private final NotificationClient notificationClient;
    private final RabbitMQMessageProducer rabbitMQMessageProducer;


    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        // todo: check if email valid
        // todo: check if email not taken
        customerRepository.saveAndFlush(customer);
        // todo: check if fraudster with OpenFeign
        FraudCheckResponse fraudCheckResponse = fraudClient.isFraudster(customer.getId());
        if(fraudCheckResponse.isFraudster()){
            throw  new IllegalStateException("fraudster");
        }
        //todo: send notification
        NotificationRequest notificationRequest = new NotificationRequest(
                customer.getId(),
                customer.getEmail(),
                String.format("Hi %s, welcome with us ! ...",
                        customer.getFirstName())
        );

        //notificationClient.sendNotification(notificationRequest);
        rabbitMQMessageProducer.publish(
                notificationRequest,
                "internal.exchange",
                "internal.notification.routing-key"
        );
    }
}

