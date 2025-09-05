# MicroServices_Basics
This repository is for the basics of microservices what is, how and why .

# Monolithic Architecture ?
A monolithic  architecture is a software design pattern, where all components of a system as integrated into a single, unified application.

## Challenges
* Tight Coupling
* Maintenance Complexity
* Deployment Risks
* Scalability Issues

# Microservices Architecture ?
* Microservice is not technology/language.
* It is not a framework.
* It is not aa API.
* It is an architectural design pattern.
* It is universal and anyone can use this architecture to develop applications.

* Micro services architecture is a design pattern where an application is composed of multiple small, independently deployable services that communicate over a network. 

# Advantages With Microservices
* Loose Coupling
* Burden Reduced on  server.
* Easy maintenance
* Quickly deliveries
* Scalability
* Technology diversity
* No single point of failure.

#  Challenges with Microservices ?
1) Bounded Context 
2) Repeated configurations 
3) Visibility 

## Bounded Context 
Bounded context means identifying how many microservices we need to develop for one application and deciding which functionality we need to ass in which microservices.

In several microservice architecture we might not get chance to work with all apis in the application.

<pre>
```================================
Microservices Architecture  
================================```
</pre>
There is no fixed architecture for microservices development. 

We can customize microservices architecture according to our project.

As part of Microservices architecture we are going to use below components (all the below component are not mandatory).

1) Service Registry (Eureka)
2) Admin Server
3) Zipkin Server
4) Config Server
5) Kafka Server
6) Redis Server
7) FeignClient
8) API Gateway

++++++++++++++++++++  
Services Registry  
++++++++++++++++++++  
Service Registry is used to maintain all apis information like name, status, url and health at once place.

==> It is also called as Service Discovery.
==> We can use Eureka Server as service registry.
==> Eureka server provided by "Spring Cloud" library.
==> It will provide user interface to get apis info.
+++++++++++++++++  
Admin Server  
+++++++++++++++++  
=>It is used to monitor and manage all the apis at one place.(like a actuator)
1) Health check
2) config props
3) url mappings
4) beans uploaded
5) changing log levels
6) thread dumps
7) heap dumps  
=>it provides beautiful user interface to access all apis actuator endpoints one place. 

++++++++++++++++++  
Zipkin Server  
++++++++++++++++++  
=> It is used for distributed tracing of our requests.
Ex:   
1) how much time taking to process one request
2) Which microservices taking more time to process
3) how many services involved in one requests processing.
4) It provides beautiful user interface to access apis execution details.

++++++++++++++  
Config Server  
++++++++++++++  
=> It is used to separate application code and application properties.
=> It is used to externalize config props of our application.
=> It makes our application loosely coupled with properties file or yml file.  

+++++++++++++  
FeignClient  
+++++++++++++  

=> It is used for interservice communication  
=> If one api communicate with another api iin the same application then it is called as Inter service communication.

++++++++++++++  
API Gateway  
+++++++++++++  

=> It acts as entry point for all backend apis.  
=> It acts mediator between frontend app and backend apis.  
=> In API Gateway we will write filters + Routings  
            Filter : We can perform pre-process & post-process  
            Routings : To forward request to particular backend-rule.  

==================================================  
Steps to develop Service Registry Application(Eureka Server)  
====================================================  

1) Create SpringBoot  application  with below dependency
 ------------EurekaServer(spring-cloud-starter-netflix-eureka-server)  

2) Configure @EnableEurekaServer annotation in boot start class

3) Configure below properties in application.yml file 
server :
port: 8761

Note :  
=> If Service-Registry project port is 8761 then Clients discover service-registry and will register automatically  with service-registry. 
=> If service-registry project running on any other port number then we have to register Clients with service-registry manually

===========================
ADMIN SERVER DEVELOPMENT
=============================

1) Create Boot application with "admin-server" dependency (select it while creating the project)

2) Configure @EnableAdminServer annotation at start class

3) Change Port Number (Optional)


