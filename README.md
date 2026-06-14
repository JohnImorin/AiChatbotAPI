# AI Chatbot REST API

A RESTful AI-powered chatbot API built with Java, Spring Boot, Neon PostgreSQL, and Groq AI.

## Features

* Real AI-powered conversations
* Chat history persistence
* Full CRUD operations for conversations
* Neon PostgreSQL cloud database
* Clean architecture (Entity, Repository, Service, Controller)
* External AI API integration (Groq)
* Postman tested endpoints

## Tech Stack

Java 23 | Spring Boot 3 | PostgreSQL (Neon) | JPA/Hibernate | REST API | Groq AI

## Getting Started

```bash
git clone https://github.com/JohnImorin/Ai.git
cd Ai
```

Configure environment variables:

```env
DB_URL=your_neon_database_url
DB_USERNAME=your_database_username
DB_PASSWORD=your_database_password
GROQ_API_KEY=your_groq_api_key
```

Run:

```bash
mvn spring-boot:run
```

API runs on:

```text
http://localhost:8081
```

## Database

This project uses Neon PostgreSQL as a cloud-hosted database.

The application automatically creates the required tables on startup using:

```properties
spring.jpa.hibernate.ddl-auto=update
```

## API Endpoints

### Chat Endpoints

* `GET /api/chatbot` - Get all conversations
* `GET /api/chatbot/{id}` - Get conversation by ID
* `POST /api/chatbot` - Send message to AI and save response
* `DELETE /api/chatbot/{id}` - Delete conversation
* `DELETE /api/chatbot` - Delete all conversations

### Example Request

```json
{
  "userMessage": "What is Spring Boot?"
}
```

### Example Response

```json
{
  "id": "uuid",
  "userMessage": "What is Spring Boot?",
  "aiResponse": "Spring Boot is a Java framework used to build applications quickly...",
  "createdAt": "2026-06-15T10:30:00"
}
```

## Project Structure

```text
src
 ├── controller
 ├── service
 ├── repository
 ├── model
 └── resources
```

## What I Learned

* Building REST APIs with Spring Boot
* Working with JPA and Hibernate
* Connecting applications to Neon PostgreSQL
* Integrating external AI services
* Storing and managing chat history
* Service-layer business logic design
* Environment variable configuration for secure API key management

## Future Improvements

* JWT Authentication
* User Accounts
* Conversation Sessions
* Conversation Search
* Message Pagination
* React Frontend

## Author

John Fabrice Imorin | Computer Science Student | Junior Backend Developer

📧 [johnsteiner900@gmail.com](mailto:johnsteiner900@gmail.com)

🔗 LinkedIn:
https://linkedin.com/in/john-fabrice-imorin-526a4722b
