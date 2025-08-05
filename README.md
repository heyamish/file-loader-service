# What is File Loader Service?

This is a Spring Boot application that monitors a folder for `.txt` files containing Call Detail Records (CDRs), parses each line into structured data, stores the data in a PostgreSQL table, and logs each file's processing status into a control table.


# Features

- Monitors a specified folder every minute
- Loads contents of `.txt` files line-by-line
- Inserts into `call_detail_records` table in PostgreSQL
- Logs upload details in a `cdr_logs` control table
- Deletes file after successful processing


# Project Structure

file-loader-service/
├── src/
├── cdr-files/ ← Folder monitored for input files
│ └── sample_cdr.txt ← Example input file
├── README.md
└── pom.xml


# Database Tables

call_detail_records: Stores parsed data from each line of CDR file
cdr_logs: Tracks metadata of file processing like start time, end time, successes and failures


# How to Setup?

- Clone the Repository: git clone https://github.com/yourusername/file-loader-service.git
cd file-loader-service

- Set Up PostgreSQL:
  - Create a database named: ussd
  - Update application.properties with your database credentials

- Prepare Input Folder:
  - Create a folder named cdr-files inside the root project directory
  - Add .txt files with 33 pipe-separated fields (|) per line

 Run the Application:
- Using terminal: ./mvnw spring-boot:run
- Or run FileLoaderServiceApplication.java from your IDE


# Configuration

Edit your `application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/ussd
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
cdr.folder.path=./cdr-files
