# Baseball Data

## Description

This application provides a REST API for baseball data.
The data is stored in a CSV file and is loaded into memory (using H2 database) when the application starts.

## Prerequisites

* Java JDK 17 or higher (Preferred: [AdoptOpenJDK HotSpot](https://adoptopenjdk.net/))

## Installation

1. Clone the repository
1. Create a build using [Maven](https://maven.apache.org/) by running `mvn clean install` (Maven installation
   required)

**NOTE: You can also run `./mvnw clean install` on MacOS and Linux (or `mvnw.cmd` on Windows)
to avoid installing Maven.**

## Usage

1. Run the application using `java -jar target/BaseballData-0.0.1-SNAPSHOT.jar`
1. The application will be available at http://localhost:8080
1. The API documentation will be available at http://localhost:8080/swagger-ui.html

## API

* `GET /api/players` - Returns a list of all players, supports pagination with `pageNumber` and `pageSize` query
  parameters. The default page size is 10 (with page number 0).
* `GET /api/players/{id}` - Returns a single player with the given ID

## Further improvements

* Add tests to cover the entire application.
* Add configuration service, to be injected into the controllers and services, to allow for better configuration
  management.
* Consider using a different data store, such as a database, to allow for better scalability and performance.
* Add DTOs for the API, to allow for better separation between the API and the service layer.
* Add support for filtering and sorting. For example, allowing the user to filter and sort by name in order to allow
  these features in a UI.
* Add authentication for the endpoints, Also CORS support.
* Allow smarter data fetching. For example, allow reload on file change, or fetch from a remote service.
* Dockerize the application, to allow for a more portable and stable deployment.