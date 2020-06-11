# Microservice Sample Project in Spring Boot

### Special Implementations
- Discovery Server (port-8081) : Eureka / Netflix
- Config Server (port-8082) : Spring Cloud Config
- Profile Management (port-8083) : Business use case / a microservice

In here the main parent project used to share some common dependencies to child applications via 'pom' and 
modularize child applications/microservices.

Before start anything, create a mysql database (or run the docker-compose database service) as 'profile_management' 
and execute the query of, 
```
Create Table employee_profile(id int(11) NOT NULL AUTO_INCREMENT,name varchar(255),address varchar(255),PRIMARY KEY (`id`));
```
Parent and all the child applications can be considered as usual spring-boot applications.
To start the whole system go to each module via terminals and execute the `mvn spring-boot:run` command.
(order : discovery server, config server, profile-management)