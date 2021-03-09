# Hibernate Assignment Lesson 3

## Setup for MySQL

##### Use the following code to setup the DB
```
CREATE DATABASE pets;
create user 'springuser'@'%' identified by 'ThePassword'; -- Creates the user springuser
grant all on pets.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created database

CREATE TABLE pets.products (
id  int(11) PRIMARY KEY AUTO_INCREMENT, 
name VARCHAR(256), 
color VARCHAR(256), 
price DECIMAL(19,2),
);

INSERT INTO pets.products (name,color,price) VALUES ("Bird", "Chartreuse", 200.00), ("Hamster", "Brown", 30.00), ("Cayman", "Neon Pink", 500.00), ("Tarantula", "Red", 100.00);
```