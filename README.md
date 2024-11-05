# Java Selenium Demo

## Overview
This project is a demo for using Selenium WebDriver in Java to automate web application testing. It uses TestNG for test management and Maven for dependency management.

## Project Structure
- `src/main/java`: Contains the main application code.
- `src/test/java`: Contains the test code.
- `pom.xml`: Maven configuration file.

## Dependencies
The project uses the following dependencies:
- Selenium Java: 4.17.0
- TestNG: 7.9.0
- AssertJ: 3.25.2
- WireMock: 3.3.1
- Rest-Assured: 5.4.0
- JUnit: 4.13.2

## Setup
1. Ensure you have Java 17 installed.
2. Clone the repository.
3. Navigate to the project directory.
4. Run `mvn clean install` to install the dependencies.

## Running Tests
To run the tests, use the following command:
```sh
mvn test