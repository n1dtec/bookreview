# Book Review API Documentation

This documentation provides an overview of the Book Review Application, including descriptions of each API endpoint, the choice of frameworks and technologies, and detailed steps for running and testing the project.

## Project Description

The Book Review Application is a RESTful API application designed to register and query book reviews.

## Technology Stack and Frameworks

* **Spring Boot**: I have chosen Spring Boot framework for its ease of use, productivity, and the vast ecosystem. It simplifies the development of stand-alone, production-grade Spring-based applications.
* **Spring Data JPA**: This library simplifies data access operations, reducing the amount of boilerplate code required and allowing more focus on the business logic.
* **H2 Database**: This is an in-memory database used for simplicity and ease of setup, making it ideal for proof of concept, early development and testing phases.
* **Mockito**: For writing unit and integration tests, I am using Mockito since due to its reliability and functionality for testing various aspects of the application.

## How to Run the Application

1. **Prerequisites**: Java JDK (version 17 or above) and Maven installed on your system.
2. **Clone the repository in your IDE of choice**:
```markdown
git clone https://github.com/yourusername/bookreview.git
cd bookreview
```
3. **Build the project**
```markdown
mvn clean install
```
4. **Run the application**
```markdown
mvn spring-boot:run
```
The application will start running on http://localhost:8080.

## API Endpoints

### Register Book Review Data

* **URL**: /bookreview
* **Method**: POST
* **Description**: Saves given book review data.
* **Request Body**:
```json
{
  "title":"book1",
  "author":"Jane Doe",
  "publisher":"New Pub",
  "review_text":"sample review text",
  "rating":4
}
```
* **Sample Response**: HTTP 201 Created on success.

### Query All Book Reviews

* **URL**: /bookreview/all
* **Method**: GET
* **Description**: Query all of the book reviews.
* **Response**:
```markdown
[
  {
    "id": 1,
    "title":"book1",
    "author":"Jane Doe",
    "publisher":"New Pub",
    "review_text":"sample review text",
    "rating":4
  },
  {
    "id": 2,
    "title":"book2",
    "author":"Jane Doe",
    "publisher":"New Pub",
    "review_text":"sample review text",
    "rating":3
  }
]
```
Returns all the book reviews in the database.

## How to Test the Application

Using Postman or Curl
1. **Register Book Review Data**:
* Use the following command for Windows PowerShell:
```markdown
curl -Method POST -uri 'http://localhost:8080/bookreview' -H @{ "content-type" = "application/json"} -Body '{"title": "book1", "author": "Jane Doe", "publisher": "New Pub", "review_text": "sample review text", "rating": 4}'
```
* Use the following command for other terminals:

```markdown
curl -X POST 'http://localhost:8080/bookreview' -H 'Content-Type: application/json' -d '{"title": "book1", "author": "Jane Doe", "publisher": "New Pub", "review_text": "sample review text", "rating": 4}'
```
2. **Query All Book Reviews**:
* Use the following command for Windows PowerShell:
```markdown
curl -Method GET -uri 'http://localhost:8080/bookreview/all'
```
* Use the following command for other terminals:
```markdown
curl -X GET 'http://localhost:8080/bookreview/all'
```

Using unit tests
* **Run the Tests using Maven**:
```markdown
mvn test
```
This command will execute all tests in the project, printing the results to the console.

