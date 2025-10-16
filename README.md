**BookMyShow Application**

**A simple ticket booking application that allows users to signup and book seats for a particular show in a theatre. The system ensures seat availability, preventing two users from booking the same seat at the same time. Built using Spring Boot, Java 17, MySQL, and Spring Data JPA.**

**Technologies Used**
Java 17,
Spring Boot (Web, Data JPA, DevTools)
MySQL (Database)
Spring Data JPA (ORM, entity mapping: One-to-Many, Many-to-One)
Lombok (DTOs & models)
Maven (Build tool)

**Features-**
User Signup,
Users can register with email and password,
Seat Booking,
Users can book one or more seats for a show,
Prevents double booking of the same seat,
DTOs & REST APIs,
Clean, professional APIs using DTOs for input/output,
CommandLineRunner for testing,
Auto-tests signup and booking flow on app startup,
Logging,
Detailed logging for client-ready demonstration,

**Project Structure**
**src/main/java/com/bookmyshow/
│
├── controllers/       # REST controllers (UserController, BookingController)
├── DTOS/              # Data Transfer Objects (BookingRequestDTO, BookingResponseDTO, SignUpRequestDTO, SignUpResponseDTO)
├── enums/             # Enums (ResponseStatus)
├── models/            # JPA entities (User, Booking, Show, etc.)
├── services/          # Business logic (UserService, BookingService)
└── BookmyshowApplication.java  # Main Spring Boot application with CommandLineRunner**

**Getting Started**
**Prerequisites**
Java 17
Maven
MySQL database

**Setup
**
**1. Clone the repository**
git clone https://github.com/yourusername/bookmyshow.git
cd bookmyshow**
**2. Configure database**
Update application.properties with your MySQL credentials

spring.datasource.url=jdbc:mysql://localhost:3306/bookmyshow
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update

**3.Build & Run**
mvn clean install
mvn spring-boot:run

**Notes-
Uses Lombok @Data for DTOs and models. Make sure your IDE has Lombok installed.
Seats cannot be double-booked, thanks to service-level checks.
Designed to be client-ready and demo-friendly.**




