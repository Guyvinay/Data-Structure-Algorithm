CREATE TABLE customers (
    customer_id SERIAL PRIMARY KEY,
    customer_name VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    phone VARCHAR(20),
    city VARCHAR(50),
    country VARCHAR(50),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

---

### **2. categories**

```sql
CREATE TABLE categories (
    category_id SERIAL PRIMARY KEY,
    category_name VARCHAR(100) NOT NULL,
    description TEXT
);

```

---

### **3. products**

```sql

CREATE TABLE products (
    product_id SERIAL PRIMARY KEY,
    product_name VARCHAR(150) NOT NULL,
    category_id INT REFERENCES categories(category_id),
    price NUMERIC(10, 2) NOT NULL,
    supplier_id INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

```

---

### **4. suppliers**

```sql

CREATE TABLE suppliers (
    supplier_id SERIAL PRIMARY KEY,
    supplier_name VARCHAR(150) NOT NULL,
    contact_email VARCHAR(150),
    phone VARCHAR(20)
);

```

---

### **5. inventory**

```sql

CREATE TABLE inventory (
    product_id INT PRIMARY KEY REFERENCES products(product_id),
    quantity INT NOT NULL CHECK (quantity >= 0),
    last_updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

```

---

### **6. orders**

```sql

CREATE TABLE orders (
    order_id SERIAL PRIMARY KEY,
    customer_id INT REFERENCES customers(customer_id),
    order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(20) CHECK (status IN ('Pending', 'Shipped', 'Delivered', 'Cancelled')),
    total_amount NUMERIC(12, 2)
);

```

---

### **7. order_items**

```sql

CREATE TABLE order_items (
    order_item_id SERIAL PRIMARY KEY,
    order_id INT REFERENCES orders(order_id),
    product_id INT REFERENCES products(product_id),
    quantity INT NOT NULL CHECK (quantity > 0),
    price NUMERIC(10, 2) NOT NULL
);

```

---

### **8. payments**

```sql

CREATE TABLE payments (
    payment_id SERIAL PRIMARY KEY,
    order_id INT REFERENCES orders(order_id),
    payment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    amount NUMERIC(12, 2) NOT NULL,
    payment_method VARCHAR(20) CHECK (payment_method IN ('Credit Card', 'Debit Card', 'PayPal', 'UPI')),
    status VARCHAR(20) CHECK (status IN ('Pending', 'Completed', 'Failed'))
);

```

---

### **9. reviews**

```sql

CREATE TABLE reviews (
    review_id SERIAL PRIMARY KEY,
    product_id INT REFERENCES products(product_id),
    customer_id INT REFERENCES customers(customer_id),
    rating INT CHECK (rating BETWEEN 1 AND 5),
    comment TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

```

---

### **Indexes for Performance**

```sql

CREATE INDEX idx_orders_customer_id ON orders(customer_id);
CREATE INDEX idx_order_items_product_id ON order_items(product_id);
CREATE INDEX idx_products_category_id ON products(category_id);
CREATE INDEX idx_payments_order_id ON payments(order_id);

```

---

## **Sample Data (for testing)**

```sql

INSERT INTO customers (customer_name, email, city, country)
VALUES
('John Doe', 'john@example.com', 'New York', 'USA'),
('Jane Smith', 'jane@example.com', 'London', 'UK'),
('Amit Kumar', 'amit@example.com', 'Delhi', 'India');

INSERT INTO categories (category_name) VALUES
('Electronics'), ('Clothing'), ('Books');

INSERT INTO products (product_name, category_id, price, supplier_id)
VALUES
('Smartphone', 1, 699.99, 1),
('Laptop', 1, 1200.00, 2),
('T-Shirt', 2, 19.99, 3);

INSERT INTO suppliers (supplier_name, contact_email)
VALUES
('Tech Corp', 'sales@techcorp.com'),
('Gadgets Ltd', 'info@gadgets.com'),
('Cloth House', 'contact@clothhouse.com');

INSERT INTO inventory (product_id, quantity)
VALUES
(1, 50),
(2, 30),
(3, 100);

INSERT INTO orders (customer_id, status, total_amount)
VALUES
(1, 'Delivered', 1399.99),
(2, 'Pending', 699.99);

INSERT INTO order_items (order_id, product_id, quantity, price)
VALUES
(1, 1, 1, 699.99),
(1, 2, 1, 700.00),
(2, 1, 1, 699.99);

INSERT INTO payments (order_id, amount, payment_method, status)
VALUES
(1, 1399.99, 'Credit Card', 'Completed'),
(2, 699.99, 'UPI', 'Pending');

```

select *
from orders o
join order_items oi on o.order_id = oi.order_id
group by o.order_id;

SELECT
 *
FROM orders o
JOIN customers c ON o.customer_id = c.customer_id;

SELECT
 *
FROM products p
LEFT JOIN categories c ON p.category_id = c.category_id;

SELECT
 *
FROM categories c
LEFT JOIN products p  ON p.category_id = c.category_id;

SELECT
    p.product_id,
    p.product_name,
    c.category_name,
    p.price
FROM products p
JOIN categories c ON p.category_id = c.category_id;
