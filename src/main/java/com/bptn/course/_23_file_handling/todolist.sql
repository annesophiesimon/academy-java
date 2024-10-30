-- Create database 
CREATE DATABASE todolist;

CREATE DATABASE todolist
WITH 
ENCODING='UTF8';

-- delete database  

DROP DATABASE todolist;

DROP DATABASE IF EXISTS todolist;


CREATE TABLE "tasks" (
	"taskId" SERIAL PRIMARY KEY,
	"taskName" VARCHAR(100) NOT NULL,
	"dueDate" DATE NOT NULL,
	"priority" INTEGER NOT NULL,
	"categoryId" INTEGER REFERENCES "taskCategories"("categoryId")
);

--ALTER TABLE table_name
-- RENAME COLUMN old_column_name TO new_column_name;

--ALTER TABLE "taskCategories"
--RENAME COLUMN "categorieId" to "categoryId";

CREATE TABLE "taskCategories" (
"categorieId" SERIAL PRIMARY KEY,
"categoryName" VARCHAR(50) NOT NULL
);

CREATE TABLE "users" (
	"userId" SERIAL PRIMARY KEY,
	"username" VARCHAR(50) NOT NULL,
	"email" VARCHAR(100) NOT NULL UNIQUE,
	"createdAt" TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE "userTasks"(
	"taskId" INT REFERENCES "tasks"("taskId") ON DELETE CASCADE,
	"userId" INT REFERENCES "users"("userId") ON DELETE CASCADE,
	"assignedDate" DATE DEFAULT CURRENT_DATE
);

-- alter command to change type
--ALTER TABLE "tasks"
-- ALTER COLUMN "priority" TYPE VARCHAR(10);

--ALTER TABLE "tasks"
--ADD COLUMN "createdAt" TIMESTAMP DEFAULT CURRENT_TIMESTAMP;


ALTER TABLE "tasks"
RENAME COLUMN "taskName" TO "taskDescription";


CREATE INDEX "indexDueDate" ON "tasks" ("dueDate");

CREATE INDEX "indexUserTasks" ON "userTasks" ("userId", "taskId");


INSERT INTO "taskCategories" ("categoryName") VALUES
('Work'),
('Personal'),
('Urgent'),
('Shopping'),
('Fitness'),
('Hobbies'),
('Education'),
('Miscellaneous');

INSERT INTO "users" ("username", "email") VALUES
('alice', 'alice@example.com'),
('bob', 'bob@example.com'),
('charlie', 'charlie@example.com'),
('david', 'david@example.com'),
('eve', 'eve@example.com'),
('frank', 'frank@example.com'),
('grace', 'grace@example.com'),
('heidi', 'heidi@example.com');

INSERT INTO "tasks" ("taskDescription", "dueDate", "priority",
"categoryId") VALUES
('Complete project proposal', '2024-11-01', 1, 1),
('Grocery shopping', '2024-10-30', 2, 4),
('Morning workout', '2024-10-29', 3, 5),
('Read a book', '2024-11-05', 2, 6),
('Finish homework', '2024-11-02', 1, 7),
('Schedule doctor appointment', '2024-11-10', 3, 2),
('Plan vacation', '2024-12-01', 1, 8),
('Pay bills', '2024-11-15', 2, 2),
('Organize workspace', '2024-10-31', 3, 1),
('Prepare for presentation', '2024-11-03', 1, 1),
('Buy birthday gift', '2024-11-20', 2, 4),
('Cook dinner', '2024-10-28', 3, 6),
('Visit family', '2024-11-12', 1, 2),
('Complete online course', '2024-11-18', 2, 7),
('Attend networking event', '2024-11-08', 1, 1),
('Finish cleaning house', '2024-10-29', 3, 5),
('Submit expense report', '2024-11-05', 1, 1),
('Prepare for interview', '2024-11-11', 2, 3),
('Join book club', '2024-11-15', 3, 6);

INSERT INTO "userTasks" ("taskId", "userId", "assignedDate")
VALUES
(1, 1, '2024-10-25'), -- Alice assigned to Complete project proposal
(2, 1, '2024-10-26'), -- Alice assigned to Grocery shopping
(3, 1, '2024-10-27'), -- Alice assigned to Morning workout
(1, 2, '2024-10-24'), -- Bob assigned to Complete project proposal
(4, 2, '2024-10-23'), -- Bob assigned to Finish homework
(5, 2, '2024-10-22'), -- Bob assigned to Schedule doctor appointment
(2, 3, '2024-10-23'), -- Charlie assigned to Grocery shopping
(6, 3, '2024-10-20'), -- Charlie assigned to Pay bills
(3, 4, '2024-10-21'), -- David assigned to Morning workout
(7, 4, '2024-10-19'), -- David assigned to Plan vacation
(5, 5, '2024-10-24'), -- Eve assigned to Schedule doctor appointment
(8, 5, '2024-10-25'), -- Eve assigned to Complete online course
(4, 6, '2024-10-23'), -- Frank assigned to Finish homework
(9, 6, '2024-10-26'); -- Frank assigned to Prepare for presentation

SELECT "taskId","taskDescription", "priority" FROM "tasks";

SELECT "taskId","taskDescription", "priority" FROM "tasks"
WHERE "dueDate" = CURRENT_DATE;

CREATE VIEW "highPriorityTasks" AS 
SELECT "taskDescription", "priority", "dueDate" FROM "tasks"
WHERE "priority"='1';

SELECT * FROM "highPriorityTasks";

UPDATE "tasks"
SET priority = CASE 
    WHEN priority = '1' THEN 'high'
    WHEN priority = '2' THEN 'medium'
    WHEN priority = '3' THEN 'low'
END
WHERE priority IN ('1', '2', '3');

CREATE OR REPLACE VIEW "highPriorityTasks" AS 
SELECT "taskDescription", "priority", "dueDate" 
FROM "tasks"
WHERE "priority" = 'high';

CREATE PROCEDURE "deleteOldTasks()" 
LANGUAGE plpgsql AS 
$$
BEGIN 
	DELETE FROM "tasks" WHERE "dueDate" < CURRENT_DATE - INTERVAL '30 days';
END
$$

CALL "deleteOldTasks"();
SELECT * FROM "tasks";
END 


ALTER SEQUENCE "tasks_taskId_seq" RESTART WITH 1;

-- create function 

CREATE FUNCTION "countingHighPriorityTasks"()
RETURNS INT AS 
$$
BEGIN 
	RETURN (SELECT COUNT(*) FROM "tasks" WHERE "priority"='high');
END
$$
LANGUAGE plpgsql;

SELECT "countingHighPriorityTasks"();


CREATE FUNCTION "getAllTasksForUser"("_userId" INT)
RETURNS TABLE("taskDescription" VARCHAR, "dueDate" DATE) AS
$$
BEGIN
	RETURN QUERY SELECT "t"."taskDescription","t"."dueDate" FROM "tasks" "t"
	JOIN "userTasks" "ut" ON "t"."taskId" = "ut"."taskId"
	WHERE "ut"."userId"="_userId";
END
$$
LANGUAGE plpgsql;

-- CREATE OR REPLACE if we want to update but we cannot change return type 

SELECT "getAllTasksForUser"(1);

-- Drop a function 

DROP FUNCTION "getAllTasksForUser"(integer);

-- transactions example 

-- SET TRANSACTION ISOLATION LEVEL READ COMMITTED;

BEGIN;
CREATE TABLE "moreCategories"(
	"categoryId" SERIAL PRIMARY KEY,
	"categoryName" VARCHAR(50) NOT NULL
); 

INSERT INTO "moreCategories" ("categoryName")
VALUES ('work'), ('Personal'), ('Urgent');

SAVEPOINT saveAfterInsert;




