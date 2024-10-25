

---

# Spring Boot Microservices Application

This project demonstrates a microservices architecture using Spring Boot with WebFlux for synchronous communication, Apache Kafka for messaging, Eureka for service discovery, Keycloak for user authentication, and monitoring with Prometheus and Grafana.

## Technologies
- **Spring Boot WebFlux**: Synchronous inter-service communication
- **Apache Kafka**: Messaging between services
- **Eureka Server**: Service discovery
- **Keycloak**: User management and authentication
- **Prometheus**: Metrics monitoring
- **Grafana**: Data visualization

---

To run **Prometheus** with Docker:

    docker run -p 9090:9090 -v "C:\Users\manoj\Desktop\ALT+255\On\ABC_Companies\prometheus\prometheus.yml:/etc/prometheus/prometheus.yml" prom/prometheus --config.file=/etc/prometheus/prometheus.yml

---
