# Patient Records API

A RESTful API for managing hospital patient records, built with Java, Spring Boot, and MySQL.

## Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL

## Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /patients | Get all patients |
| GET | /patients/{id} | Get patient by ID |
| GET | /patients/search?name= | Search patients by name |
| POST | /patients | Add a new patient |
| PUT | /patients/{id} | Update a patient |
| DELETE | /patients/{id} | Delete a patient |

## Running Locally

1. Make sure MySQL is running and create a database called `patient_records`
2. Update `src/main/resources/application.properties` with your MySQL username and password
3. Run the app:

```bash
./mvnw spring-boot:run
```

The API will be available at `http://localhost:8080`.

## Example Request

```bash
curl -X POST http://localhost:8080/patients \
  -H "Content-Type: application/json" \
  -d '{"name":"Clark Kent","age":35,"diagnosis":"Tummy Ache"}'
```