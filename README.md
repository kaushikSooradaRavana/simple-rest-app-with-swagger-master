# Simple REST Sample Application using Swagger

A simple Spring Boot based sample application that uses Swagger for API documentation

## Build the application

Build the project with Maven:

```
mvn clean package
```

## Run the application

Run the application locally:

```
mvn spring-boot:run
```

Access Swagger UI locally: http://localhost:8180/simple-rest-app-with-swagger/v1/swagger-ui.html

Acces the Swagger documentation locally: http://localhost:8180/simple-rest-app-with-swagger/v1/docs/api

Deploy the application to Cloud Foundry:

```
cf push
```

Access Swagger UI remotely: https://simple-rest-app-with-swagger-v1.apps.dev.api.mbusa.oneweb.mercedes-benz.cinteo.de/simple-rest-app-with-swagger/v1/swagger-ui.html

Access the Swagger documentation remotely: https://simple-rest-app-with-swagger-v1.apps.dev.api.mbusa.oneweb.mercedes-benz.cinteo.de/simple-rest-app-with-swagger/v1/docs/api 
