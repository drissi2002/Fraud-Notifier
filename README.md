# Covered parts 
## About 'AMQP' et 'brokers'

<img width="1638" alt="Sans titre1" src="https://user-images.githubusercontent.com/84160502/208466244-00d01f4d-dee9-4252-adb6-796f1f6e6969.png">

## Adding 'rabbitMq' 
### About 'rabbitMq'

<img width="775" alt="Sans titre" src="https://user-images.githubusercontent.com/84160502/208466458-94076518-3ed4-43ba-933d-376f7310a005.png">

### Implimentation 

<i>
1. Add the necessary dependencies to your project. You will need to include the spring-boot-starter-amqp dependency in your project, which will bring in the required libraries for using RabbitMQ with Spring Boot. </br>
2. Configure the connection to the RabbitMQ server. You can do this by adding the necessary configuration properties to your application.properties file </br>
3. Create a message listener container. The message listener container is responsible for consuming messages from a queue and invoking your message listener to process the message. </br>
4. Create a message publisher. To publish messages to a queue, you can use the RabbitTemplate class, which provides methods for sending messages to a queue.
</i>

<img width="786" alt="Sans titre2" src="https://user-images.githubusercontent.com/84160502/208466548-d907327e-442c-47b8-b7d8-d865e655eb65.png">

<i> These are the basic steps for implementing RabbitMQ in a Spring Boot project. For more information, you can refer to the documentation for the Spring AMQP project: https://docs.spring.io/spring-amqp/docs/current/reference/html/.</i>
