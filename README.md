# E-Commerce Platform

This is a full-stack E-Commerce application designed using Spring Boot microservices and React. It follows a modular architecture and incorporates best practices for scalable and maintainable enterprise systems.

## Technology Stack

### Backend (Microservices)
- Java 21 with Spring Boot 3.5
- Spring Data JPA (MySQL)
- Spring Cloud OpenFeign (inter-service communication)
- Spring Security (OAuth2 and JWT planned)
- RabbitMQ (for asynchronous messaging)
- Spring Cloud Gateway (API Gateway)
- Eureka (Service Discovery)
- Docker & Docker Compose (for containerization)

### Frontend
- React.js
- Axios (API communication)
- React Router (client-side routing)
- Tailwind CSS or Material UI (planned)
- JWT-based authentication (planned)

### Deployment (Planned)
- Docker Compose / Kubernetes
- CI/CD with GitHub Actions or Jenkins
- Cloud deployment (AWS / Railway / Render)

## Microservices Overview

| Service            | Responsibility                            | Status         |
|--------------------|--------------------------------------------|----------------|
| user-service       | Manages user data, registration, login     | In Progress    |
| order-service      | Handles order creation and management      | Planned        |
| product-service    | Manages product catalog and inventory      | Planned        |
| payment-service    | Simulates and processes payments           | Planned        |
| email-service      | Sends emails via message queue             | Planned        |
| gateway-service    | Routes and secures requests                | Planned        |
| config-service     | Centralized configuration management       | Planned        |
| eureka-server      | Service registry and discovery             | Planned        |

## Current Progress

- Modular Maven project setup
- Base structure for user-service with entity, repository, service, and controller
- Feign client integration started
- Planning for RabbitMQ-based event handling
- Preparing DTOs and layered architecture

## Getting Started

### Prerequisites

- Java 21
- Maven
- MySQL 8.x or higher
- Docker (optional)

### How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/chandu/ecommerce-platform.git
   cd ecommerce-platform
