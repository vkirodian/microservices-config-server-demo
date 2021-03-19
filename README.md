# microservices-config-server-demo

This is a simple Spring Boot Cloud Configuration Server.

## Installation

Once you have checked out this repository, go to the base directory and build it using maven

```bash
maven clean install
```

## Running the application

Once the project is successfully built, you can run the following command:

```bash
java -jar .\target\microservices-config-server-demo-1
```

The application would run at the configured port and act as a configuration server for all your micro-services.

Currently the bootstrap.properties is configured to run at http://localhost:8888.

Properties are picked from Git URL : https://github.com/vkirodian/configuration-repository.git

Depending on properties file the configs can we access like : http://localhost:8888/spring-boot-example/default.