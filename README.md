# Baseball Data

## Description

This application provides a REST API for baseball data.
The data is stored in a CSV file and is loaded into memory when the application starts.

## Prerequisites

* Java JDK 17 or higher (Preferred: [AdoptOpenJDK HotSpot](https://adoptopenjdk.net/))

## Installation

1. Clone the repository
1. Create a build using [Maven](https://maven.apache.org/) by running `mvn clean install`

## Usage

1. Run the application using `java -jar target/baseball-data-1.0.0.jar`
1. The application will be available at `http://localhost:8080`
1. The API documentation will be available at `http://localhost:8080/swagger-ui`

## API

* `GET /api/players` - Returns a list of all players, supports pagination with `pageNumber` and `pageSize` query
  parameters
* `GET /api/players/{id}` - Returns a single player with the given ID