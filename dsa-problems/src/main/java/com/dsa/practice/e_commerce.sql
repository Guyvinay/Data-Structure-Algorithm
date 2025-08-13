create TABLE customers (
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
create TABLE categories (
    category_id SERIAL PRIMARY KEY,
    category_name VARCHAR(100) NOT NULL,
    description TEXT
);

```

---

### **3. products**

```sql

create TABLE products (
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

create TABLE suppliers (
    supplier_id SERIAL PRIMARY KEY,
    supplier_name VARCHAR(150) NOT NULL,
    contact_email VARCHAR(150),
    phone VARCHAR(20)
);

```

---

### **5. inventory**

```sql

create TABLE inventory (
    product_id INT PRIMARY KEY REFERENCES products(product_id),
    quantity INT NOT NULL CHECK (quantity >= 0),
    last_updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

```

---

### **6. orders**

```sql

create TABLE orders (
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

create TABLE order_items (
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

create TABLE payments (
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

create TABLE reviews (
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

create index idx_orders_customer_id on orders(customer_id);
create index idx_order_items_product_id on order_items(product_id);
create index idx_products_category_id on products(category_id);
create index idx_payments_order_id on payments(order_id);

```

---

## **Sample Data (for testing)**

```sql

insert into customers (customer_name, email, city, country)
values
('John Doe', 'john@example.com', 'New York', 'USA'),
('Jane Smith', 'jane@example.com', 'London', 'UK'),
('Amit Kumar', 'amit@example.com', 'Delhi', 'India');

insert into categories (category_name) values
('Electronics'), ('Clothing'), ('Books');

insert into products (product_name, category_id, price, supplier_id)
values
('Smartphone', 1, 699.99, 1),
('Laptop', 1, 1200.00, 2),
('T-Shirt', 2, 19.99, 3);

insert into suppliers (supplier_name, contact_email)
values
('Tech Corp', 'sales@techcorp.com'),
('Gadgets Ltd', 'info@gadgets.com'),
('Cloth House', 'contact@clothhouse.com');

insert into inventory (product_id, quantity)
values
(1, 50),
(2, 30),
(3, 100);

insert into orders (customer_id, status, total_amount)
values
(1, 'Delivered', 1399.99),
(2, 'Pending', 699.99);

insert into order_items (order_id, product_id, quantity, price)
values
(1, 1, 1, 699.99),
(1, 2, 1, 700.00),
(2, 1, 1, 699.99);

insert into payments (order_id, amount, payment_method, status)
values
(1, 1399.99, 'Credit Card', 'Completed'),
(2, 699.99, 'UPI', 'Pending');

```

select o.order_id, count(oi.order_item_id)
from orders o
join order_items oi on o.order_id = oi.order_id
group by o.order_id;

select
 *
from orders o
join customers c on o.customer_id = c.customer_id;

select
 *
from products p
left join categories c on p.category_id = c.category_id;

select
 *
from categories c
left join products p  on p.category_id = c.category_id;

select
    p.product_id,
    p.product_name,
    c.category_name,
    p.price
from products p
join categories c on p.category_id = c.category_id;


select * from
products p right join suppliers s
on p.supplier_id = s.supplier_id;

select c.customer_id, c.customer_name, c.email, o.order_id
from customers c
join orders o
on c.customer_id = o.customer_id
where o.status = 'Pending';

-- Create table: student
create TABLE student (
    roll_no INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(100),
    x_per NUMERIC(5, 2) NOT NULL CHECK (x_per >= 0 AND x_per <= 100),
    state VARCHAR(50) NOT NULL
);

-- Insert data
insert into student (roll_no, name, email, x_per, state) values
(1, 'ABC', 'abc@ms.com', 77.65, 'Karnataka'),
(2, 'BCD', 'bcd@ms.com', 33.00, 'Tamilnadu'),
(3, 'CDE', 'cde@ms.com', 77.24, 'Maharashtra'),
(4, 'def', 'def@ms.com', 74.69, 'West Bengal'),
(5, 'efg', 'efg@ms.com', 66.00, 'Kerala'),
(6, 'fgh', 'fgh@ms.com', 33.00, 'Delhi'),
(7, 'ghi', 'ghi@ms.com', 33.00, 'Punjab'),
(8, 'ijk', 'ijk@ms.com', 79.36, 'Haryana'),
(10, 'AED', NULL, 56.00, 'Karnataka');


select roll_no "Roll number", name "Name" from students;

select name, x_per (
    select avg(x_per) from student
) from student;

select roll_no "Roll number", name "Name" from students;

select roll_no "Roll number", name "Name" from students;

SELECT rollNo, x_per
FROM (
  SELECT rollNo, name,
	x_per, email
	FROM student
	WHERE x_per > 60.00
) T;

SELECT * from student
where x_per > (
 select max(x_per) marks
 from student where state = 'Karnataka'
);

SELECT state, AVG(x_per) from student group by state
having avg(x_per) > (
 select avg(x_per) from student where state = 'Karnataka'
);