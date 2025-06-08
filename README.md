# Spring Boot Data REST Demo

A demo project showcasing the use of **Spring Boot Data REST** and **Spring Data JPA** to create a RESTful API for managing job postings. The application integrates with a MySQL database and demonstrates the use of repository-based automatic REST endpoint generation.

---

## Features

* **Automatic REST API Generation:**

  * Spring Boot Data REST automatically exposes repository methods as RESTful API endpoints.

* **Entity Management:**

  * Includes a `JobPost` entity with attributes such as:

    * `postId`: Unique identifier for the job posting.
    * `postProfile`: The job profile name.
    * `postDesc`: A description of the job.
    * `reqExperience`: Required experience for the role.
    * `postTechStack`: A list of required technologies for the role.

* **Database Integration:**

  * Configured to work with a MySQL database using Hibernate as the JPA provider.
  * Automatic schema updates with `spring.jpa.hibernate.ddl.auto=update`.

* **HATEOAS Support:**

  * Built-in support for navigation between related resources.

---

## Technologies Used

* Spring Boot
* Spring Boot Data REST
* Spring Data JPA
* Hibernate
* MySQL
* Lombok

---

## Getting Started

### Prerequisites

* **Java 17+**
* **MySQL**
* **Maven**

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/spring-data-rest-demo.git
   cd spring-data-rest-demo
   ```

2. Configure the database in `src/main/resources/application.properties`:

   ```properties
   spring.datasource.url=database_url
   spring.datasource.username=data_username
   spring.datasource.password=database_password
   spring.jpa.hibernate.ddl.auto=update
   ```

3. Build and run the application:

   ```bash
   mvn spring-boot:run
   ```

4. Access the API via the auto-generated endpoints, such as:

   * `GET /jobPosts`
   * `POST /jobPosts`
   * `PUT /jobPosts/{id}`
   * `DELETE /jobPosts/{id}`

---

## Example API Endpoints

### 1. Get All Job Posts

**Endpoint:** `GET /jobPosts`

**Response:**

```json
[
  {
    "postId": 1,
    "postProfile": "Java Developer",
    "postDesc": "Backend development role",
    "reqExperience": 3,
    "postTechStack": ["Java", "Spring Boot", "Hibernate"]
  }
]
```

### 2. Add a Job Post

**Endpoint:** `POST /jobPosts`

**Payload:**

```json
{
  "postId": 2,
  "postProfile": "Frontend Developer",
  "postDesc": "ReactJS expert",
  "reqExperience": 2,
  "postTechStack": ["React", "JavaScript", "CSS"]
}
```

---

## Contributing

Contributions are welcome! Please fork the repository, make your changes, and submit a pull request.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
