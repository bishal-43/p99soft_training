CREATE TABLE departments(
dept_id SERIAL PRIMARY KEY,
dept_name VARCHAR(50)
);

INSERT INTO departments(dept_name) VALUES ('HR'),('IT'),('FINANCE'),('SALES');

SELECT * FROM departments;

CREATE TABLE employees(
emp_id SERIAL PRIMARY KEY,
emp_name VARCHAR(100),
salary DECIMAL(10,2),
dept_id INT,
hire_date DATE,
FOREIGN KEY (dept_id) REFERENCES departments(dept_id) 

);

INSERT INTO employees(emp_name,salary,dept_id,hire_date) VALUES
('Rahul', 60000, 2, '2022-01-10'),
('Priya', 75000, 2, '2021-05-15'),
('Amit', 50000, 1, '2023-02-20'),
('Neha', 90000, 3, '2020-08-12'),
('Vikas', 65000, 4, '2022-11-01');

SELECT * FROM employees;


CREATE TABLE projects(
proj_id SERIAL PRIMARY KEY,
proj_name VARCHAR(100),
budget DECIMAL(12,2)
);

INSERT INTO projects(proj_name,budget) VALUES
('WEBSITE DEVELOPMENT', 200000),
('APP DEVELOPMENT', 350000),
('ERP SYSTEM',300000);

SELECT * FROM projects;


CREATE TABLE employee_projects(
emp_id INT,
proj_id INT,
role VARCHAR(20),
PRIMARY KEY(emp_id,proj_id),
FOREIGN KEY(emp_id) REFERENCES employees(emp_id),
FOREIGN KEY(proj_id) REFERENCES projects(proj_id)
);

INSERT INTO employee_projects(emp_id,proj_id,role) VALUES
(1,1,'Developer'),
(2,1,'Manager'),
(2,2,'Developer'),
(3,2,'Tester'),
(4,3,'Lead');

SELECT * FROM employee_projects;


CREATE TABLE attendance(
attendance_id SERIAL PRIMARY KEY,
emp_id INT,
attendance_date DATE,
status VARCHAR(20),
FOREIGN KEY(emp_id) REFERENCES employees(emp_id)

);

INSERT INTO attendance(emp_id,attendance_date,status) VALUES 
(1,'2024-01-01','Present'),
(1,'2024-01-02','Absent'),
(2,'2024-01-01','Present'),
(3,'2024-01-01','Present'),
(4,'2024-01-01','Absent');

SELECT * FROM attendance;

SELECT emp_name,dept_name 
FROM employees
INNER JOIN departments
ON employees.dept_id = departments.dept_id;


SELECT emp_name,proj_name
FROM employees
LEFT JOIN employee_projects
ON employees.emp_id = employee_projects.emp_id
LEFT JOIN projects
ON employee_projects.proj_id = projects.proj_id;


SELECT dept_name, AVG(employees.salary) as avg_salary
FROM employees
JOIN departments
ON employees.dept_id = departments.dept_id
GROUP BY departments.dept_name;

SELECT dept_name, AVG(employees.salary) as avg_salary
FROM employees
JOIN departments
ON employees.dept_id = departments.dept_id
GROUP BY departments.dept_name
HAVING AVG(employees.salary) > 65000;


SELECT * 
FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees);

SELECT emp_name,salary,RANK() OVER(ORDER BY salary DESC)
AS salary_rank FROM employees;

WITH high_salary AS
(SELECT emp_name,salary FROM employees WHERE salary>65000)
SELECT * FROM high_salary;


SELECT emp_name,salary,
CASE
WHEN salary >= 80000 THEN 'High'
WHEN salary BETWEEN 60000 AND 80000 THEN 'Medium'
ELSE 'Low'
END AS salary_category
FROM employees;


CREATE OR REPLACE PROCEDURE insert_employee(
p_name VARCHAR,
P_salary NUMERIC,
p_dept_id INT,
hire_date DATE
)
LANGUAGE plpgsql
AS $$
BEGIN

INSERT INTO employees(emp_name,salary,dept_id,hire_date)
VALUES (p_name,p_salary,p_dept_id,hire_date);

RAISE NOTICE 'Employee inserted successfully';
END;
$$;

CALL insert_employee('Rohan',70000,4,'2023-1-18');

CREATE OR REPLACE PROCEDURE delete_employee(p_emp_id INT)
LANGUAGE plpgsql






