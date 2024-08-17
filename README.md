# UberApp

UberApp is a Spring Boot-based application that simulates the functionality of a ride-hailing service similar to Uber. This project is a comprehensive backend system that includes user management, ride booking, real-time tracking, and more.

## Table of Contents
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [API Documentation](#api-documentation)
- [Contributing](#contributing)

## Features
- **User Management**: Secure user registration, authentication, and profile management.
- **Ride Booking**: Book rides with real-time location tracking.
- **Driver Management**: Manage drivers, their availability, and assign rides.
- **Real-time Updates**: Track ride status in real-time.
- **Payment Integration**: Placeholder for future payment gateway integration.
- **Logging and Auditing**: Comprehensive logging and auditing for all operations.
- **API Documentation**: Integrated OpenAPI with Swagger UI for easy API testing and documentation.

## Installation

### Prerequisites
- Java 17+
- Maven 3.6+
- MySQL or any preferred relational database
- Git

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/adsingh2602/UberApp.git
   cd UberApp
   ```

2. Configure the database:
   - Update the `application.properties` file in `src/main/resources/` with your database details.

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

5. Access the application:
   - Swagger UI: `http://localhost:8080/swagger-ui/`
   - API Root: `http://localhost:8080/api/v1/`

## Usage
Once the application is running, you can use the Swagger UI to explore and test the APIs. The application supports various endpoints for managing users, drivers, and rides.

### Example API Endpoints
- **User Registration**: `POST /api/v1/users/register`
- **Book a Ride**: `POST /api/v1/rides/book`
- **Get Ride Status**: `GET /api/v1/rides/{rideId}`

For a full list of available endpoints, refer to the [API Documentation](#api-documentation).

## API Documentation
This project includes OpenAPI documentation that can be accessed via Swagger UI. It provides detailed information on each endpoint, request/response formats, and error codes.

- **Swagger UI**: `http://localhost:8080/swagger-ui/`

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your feature or bug fix.

### Steps to Contribute
1. Fork the project
2. Create your feature branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/YourFeature`)
5. Open a pull request
