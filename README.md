
# Local Food Exchange Platform

## Project Overview

The Local Food Exchange Platform aims to bridge the gap between local farmers, markets, and individuals looking to purchase fresh local produce in smaller quantities. Additionally, it facilitates connections with distributors for the delivery of these products, ensuring a seamless flow from farm to table. The platform is built using Spring Boot, which provides a robust framework for building stand-alone, production-grade Spring-based Applications.

## Getting Started

### Prerequisites
- Java 17
- Maven
- MySQL

### Database Configuration

In `src/main/resources/application.properties`, configure the database connection properties:

```properties
spring.datasource.url=jdbc:mysql://localhost:3308/localfoodexchange
spring.datasource.username=admin
spring.datasource.password=admin
spring.jpa.hibernate.ddl-auto=update
```

Replace `admin` and `admin` with your MySQL username and password respectively.

## Features

- **User Management**: 
    - Create new users.
    - Retrieve user details.

- **Product Management**:
    - Add new products.
    - Retrieve product details.

- **Order and Delivery Management** (Future Implementation)

## API Endpoints

- **User**
  - Create User: `POST /localfood/users/create`
  - Get User: `GET /localfood/users/{id}`

- **Product**
  - Create Product: `POST /localfood/products/create`
  - Get Product: `GET /localfood/products/{id}`

## Entity Relationship Diagram

Include a diagram showing the relationships between the User, Product, and any other entities you plan to introduce as your project evolves.

## Future Work


## Contributing


## License
