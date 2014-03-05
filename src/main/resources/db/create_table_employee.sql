BEGIN TRANSACTION;

CREATE TABLE EMPLOYEES
  (
     id        INT PRIMARY KEY,
     firstname VARCHAR(30),
     lastname  VARCHAR(30),
     telephone VARCHAR(15),
     email     VARCHAR(30),
     created   TIMESTAMP DEFAULT NOW()
  );

ROLLBACK;