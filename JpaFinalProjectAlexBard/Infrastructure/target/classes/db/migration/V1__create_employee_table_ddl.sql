CREATE TABLE employee
(
    employee_id  INT AUTO_INCREMENT PRIMARY KEY,
    first_name   VARCHAR(50),
    last_name    VARCHAR(50),
    position     VARCHAR(50),
    shift_type   VARCHAR(20),
    rate         DECIMAL(10,2),
    status       VARCHAR(20),
    password     VARCHAR(100),
    phone_number VARCHAR(12)
);
