# Covered parts 
## About 'AMQP' et 'brokers'

<img width="1638" alt="Sans titre1" src="https://user-images.githubusercontent.com/84160502/208466244-00d01f4d-dee9-4252-adb6-796f1f6e6969.png">

## Adding 'rabbitMq' 
### About 'rabbitMq'

![image](https://user-images.githubusercontent.com/84160502/208467515-597e054f-8031-4b1d-9396-ccdc87ab7aee.png)

### Implimentation 

<i>
1. Add the necessary dependencies to your project. You will need to include the spring-boot-starter-amqp dependency in your project, which will bring in the required libraries for using RabbitMQ with Spring Boot. </br>
2. Configure the connection to the RabbitMQ server. You can do this by adding the necessary configuration properties to your application.properties file </br>
3. Create a message listener container. The message listener container is responsible for consuming messages from a queue and invoking your message listener to process the message. </br>
4. Create a message publisher. To publish messages to a queue, you can use the RabbitTemplate class, which provides methods for sending messages to a queue.
</i>

![image](https://user-images.githubusercontent.com/84160502/208467323-bb79bc4d-0fd2-410f-b8a5-f64899169706.png)

<i> These are the basic steps for implementing RabbitMQ in a Spring Boot project. For more information, you can refer to the documentation for the Spring AMQP project: https://docs.spring.io/spring-amqp/docs/current/reference/html/.</i>
