-- Write a query to SELECT the distinct product categories available.

SELECT DISTINCT category from "Products";

-- Write an SQL query to calculate the Total Sales for each product. The Total Sales represent the overall quantity of a product sold, which is obtained by summing up the quantities sold in all the Orders for that product. Select productId and calculate the total quantity sold (Total Sales) for each product. Finally, rename the total quantity sold column as Total Sales

SELECT "productId", SUM("quantity") AS "total sale" FROM "Orders"
GROUP BY "productId";

-- Whrite a query to select productId productName and total Sales OF THE 3 products whith the highest sale 

SELECT "o"."productId", "p"."productName", SUM("o"."quantity") AS "total sale" FROM "Orders" AS "o"
INNER JOIN "Products" AS "p"
ON "o"."productId" = "p"."productId"
GROUP BY "o"."productId", "p"."productName"
ORDER BY "total sale" DESC
LIMIT 3;

-- QUERY TO SELECT CUSTOMERS ID AND NAME OF THE CUSTOMER WHO MADE A PURCHASE JULY 4TH 2023

SELECT "c"."customerId", "c"."customerName" FROM "Customers" AS "c"
INNER JOIN "Orders" AS "o"
ON "c"."customerId" = "o"."customerId"
WHERE "o"."orderDate" = '2023-07-04';

-- Write a query to find the total revenue generated from all orders 
-- on '2023-07-04'
-- display total as Total Revenue 
-- multiply the price of each product by the qty sold in each order


-- WE NEED TO GET PRICE IN Products table
-- We need Orders for specific date 


SELECT SUM("o"."quantity") * "p"."price" AS "Total Revenue"  FROM "Orders"
INNER JOIN  "Products" AS "p"
ON "o"."productId" = "p"."productId"
WHERE "o"."orderDate" = '2023-07-04';




SELECT DISTINCT "c"."customerId", "c"."customerName" FROM "Customers" AS "c"
INNER JOIN "Orders" AS "o"
ON "o"."customerId" = "o"."customerId"
INNER JOIN "Products" AS "p"
ON "o"."productId" = "p"."productId"

WHERE "p"."category" = 'Electronics';



SELECT 
    "p"."productId", 
    "p"."productName"
FROM 
    "Products" AS "p"
INNER JOIN 
    "Orders" AS "o" 
ON 
    "p"."productId" = "o"."productId"
WHERE 
    "o"."orderDate" = '2023-07-03'

INTERSECT

SELECT 
    "p"."productId", 
    "p"."productName"
FROM 
    "Products" AS "p"
INNER JOIN 
    "Orders" AS "o" 
ON 
    "p"."productId" = "o"."productId"
WHERE 
    "o"."orderDate" = '2023-07-05';
    
SELECT "p"."productName" FROM 


