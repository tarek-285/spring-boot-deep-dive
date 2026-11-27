# Spring Boot Deep Dive

A practical exploration of Spring Boot and the Java backend ecosystem, focusing on advanced concepts, framework internals, data access strategies, performance optimization, and production-ready engineering.

This repository serves as a hands-on technical reference for understanding Spring Boot's underlying mechanisms and implementing scalable backend patterns.

---

## Areas of Exploration

### 01. Spring Data JPA & Hibernate
- Entity relationships and mapping strategies
- Fetching strategies (`LAZY` vs. `EAGER`)
- Persistence context and entity lifecycle
- Transaction management
- `N+1` query problem and optimization
- Entity graphs and fetch joins
- Optimistic and pessimistic locking

### 02. Data Retrieval & Query Optimization
- Pagination and sorting
- Dynamic filtering and query composition
- Spring Data JPA Specifications
- Criteria API
- JPQL and native queries
- DTO and interface projections

### 03. Spring Boot Internals
- IoC container and dependency injection
- Bean lifecycle and scopes
- Auto-configuration mechanics
- Spring MVC request lifecycle
- Filters and interceptors
- AOP and dynamic proxy mechanisms
- Application events and asynchronous execution

### 04. REST API Engineering
- RESTful API design principles
- Request and response DTO patterns
- Input validation and global exception handling
- API versioning strategies
- Idempotency guarantees
- API documentation with OpenAPI / Swagger

### 05. Database Engineering
- SQL query execution plans and optimization
- Indexing strategies
- Transactions and isolation levels
- Database locking and deadlock prevention
- Connection pooling (HikariCP)
- Schema migrations (Flyway / Liquibase)

### 06. Security
- Spring Security filter chain architecture
- Authentication and authorization flows
- JWT and refresh token rotation strategies
- OAuth2 and OpenID Connect (OIDC)
- Role-based (RBAC) and permission-based access control

### 07. Testing & Production Readiness
- Unit and integration testing with JUnit 5 and Mockito
- Sliced and full-context testing (`@SpringBootTest`)
- Integration testing with Testcontainers
- Containerization with Docker and Docker Compose
- Observability: structured logging, metrics, and Spring Boot Actuator

### 08. Advanced Backend Concepts
- Distributed caching with Redis
- Event-driven architecture with Apache Kafka
- Asynchronous processing and thread pool tuning
- Microservices fundamentals
- Distributed systems patterns (resilience, rate limiting, distributed locks)

---

## Technology Stack

- **Language & Framework:** Java, Spring Boot
- **Data Access:** Spring Data JPA, Hibernate, PostgreSQL, MySQL
- **Security:** Spring Security, OAuth2 / JWT
- **Build & Testing:** Maven, JUnit 5, Mockito, Testcontainers
- **Infrastructure & Messaging:** Docker, Redis, Apache Kafka

---

## Repository Structure

```text
spring-boot-deep-dive/
├── phase-01-jpa-hibernate/
├── phase-02-data-retrieval/
│   ├── pagination/
│   ├── sorting/
│   ├── dynamic-filtering/
│   ├── specifications/
│   └── dto-projections/
├── phase-03-spring-boot-internals/
├── phase-04-rest-api-engineering/
├── phase-05-database-engineering/
├── phase-06-security/
├── phase-07-testing-production/
└── phase-08-advanced-backend/
```

