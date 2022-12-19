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

### Testing the Workload 

<i>all microservices are up except the notification one . so we try to send a request to see what is happening inside the broker </i>

![image](https://user-images.githubusercontent.com/84160502/208468463-36c23a10-fafa-4be8-a4a5-a3c1c6584d1e.png)

<i>the notification request was sending to notification microservice that is not available , so this request will be kept in the notification queue until notification microservice getting up </i>

![image](https://user-images.githubusercontent.com/84160502/208469156-d214a6a4-35c6-4617-b1cd-2ed8909e9fa9.png)

<i>request content</i>

![image](https://user-images.githubusercontent.com/84160502/208469345-b5362fbb-95a5-4b43-bf33-fcec5b656437.png)

<i>now the notification microservice is up , so the notification request in the queue will be treated , and the queue became empty</i>

![image](https://user-images.githubusercontent.com/84160502/208470041-c60b82ad-1909-454b-ba5a-7487a6655787.png)

<i>as you see we are dealing with asynchronous communication that permit us to increase the availibilty of services and the possibility of recovering data in case of unavailability</i>



