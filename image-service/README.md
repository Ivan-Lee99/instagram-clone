# image-service

Image service for the Instagram clone system. This service is storing images and their metadata for users.

## Requirements

Running the application locally you need Java 1.8.
You also might need to give execution permissions to the mvn wrapper ./mvnw

## Running (with docker)

1. Build (fat) jar with `./mvnw clean package`
2. Create data volume for MongoDB: `docker volume create image-data-dev`
    * By default the app container requires a volume as well for raw image files, but it has already been set to [./data](./data)
3. Create `.env` -file out of [example.env](example.env) and fill in proper values
    * Most of the variables are already set in [docker-compose.yml](docker-compose.yml)
4. Run `docker-compose up`
5. gRPC server is running on port 3002

## Developing

When using IntelliJ open this folder as the project root to get java support right away.

After making changes to proto file, packaging (`./mvnw clean package`) should compile the protofiles.
To launch tests:
`./mvnw clean test`

Simply running locally:
`./mvnw clean compile exec:java`

## Configuration

The local configuration is located at [conf/config.json](conf/config.json). In case you run the image using Docker (and `docker-compose`), those configurations are overwritten by environment variables. See [docker-compose.yml](docker-compose.yml) as an example. The `IMAGE_DATA_DIR` variable is populated during build, and persisting the image files on host can be done by using volume. 


**Original Vert.x Starter documentation below**

----

This application was generated using [Vert.x Starter](http://start.vertx.io)

## Building

To launch your tests:
```
./mvnw clean test
```

To package your application:
```
./mvnw clean package
```

To run your application:
```
./mvnw clean compile exec:java
```

## Help

* [Vert.x Documentation](https://vertx.io/docs/)
* [Vert.x Stack Overflow](https://stackoverflow.com/questions/tagged/vert.x?sort=newest&pageSize=15)
* [Vert.x User Group](https://groups.google.com/forum/?fromgroups#!forum/vertx)
* [Vert.x Gitter](https://gitter.im/eclipse-vertx/vertx-users)


