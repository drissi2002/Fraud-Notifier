package tn.demo.customer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.demo.clients.fraud.FraudCheckResponse;
import tn.demo.clients.fraud.FraudClient;
import tn.demo.customer.model.Customer;
import tn.demo.customer.model.CustomerRegistrationRequest;
import tn.demo.customer.repository.CustomerRepository;

@Service
@AllArgsConstructor
public class CustomerService{

    private final CustomerRepository customerRepository ;
    private final FraudClient fraudClient;

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
    }
}

