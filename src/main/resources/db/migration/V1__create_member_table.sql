CREATE TABLE members (
     id SERIAL PRIMARY KEY,
     name VARCHAR(255) NOT NULL,
     address VARCHAR(255),
     handphone VARCHAR(20),
     gender VARCHAR(10)
);
