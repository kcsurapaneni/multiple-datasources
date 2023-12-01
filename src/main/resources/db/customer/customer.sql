
-- customers table

CREATE TABLE customer (
   customer_id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(100) NOT NULL,
   email VARCHAR(255) UNIQUE NOT NULL,
   phone VARCHAR(15) NOT NULL
);


-- Sample records into the `customers` table

INSERT INTO customer
    (name, email, phone)
VALUES
    ('Krishna Chaitanya', 'kc.surapaneni@gmail.com', '+1-777-888-9999'),
    ('Hello world', 'hello.world@yahoo.com', '+1-111-222-3333'),
    ('Karthik', 'karthik@outlook.com', '+1-444-555-6666');
