-- restaurants table

CREATE TABLE restaurants (
    restaurant_id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    phone VARCHAR(15),
    cuisine_type VARCHAR(50)
);


-- Sample records into the `restaurants` table

INSERT INTO restaurants
    (restaurant_id, name, address, phone, cuisine_type)
VALUES
    (1, 'Spice House', '456 Elm St, Townsville', '+1-987-654-3210', 'Indian'),
    (2, 'Tasty Bites', '123 Main St, Cityville', '+1-123-456-7890', 'Italian'),
    (3, 'Sushi Express', '789 Oak St, Villagetown', '+1-555-123-4567', 'Japanese');


-- invoice table

CREATE TABLE invoices (
    invoice_id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    order_id INT UNSIGNED NOT NULL,
    invoice_amount DECIMAL(10, 2) NOT NULL,
    invoice_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


-- Sample records into the `invoices` table

INSERT INTO invoices
    (invoice_id, order_id, invoice_amount)
VALUES
    (1, 1, 150.12),
    (2, 2, 140.34);
