# File Loader Service

This is a Spring Boot application that monitors a folder for `.txt` files containing Call Detail Records (CDRs), parses each line into structured data, stores the data in a PostgreSQL table, and logs each file's processing status into a control table.


# Features

- Monitors a specified folder every minute
- Loads contents of `.txt` files line-by-line
- Inserts into `call_detail_records` table in PostgreSQL
- Logs upload details in a `cdr_logs` control table
- Deletes file after successful processing


# Tech Stack

- Java 17
- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- Hibernate ORM


## 🧬 Folder Structure

