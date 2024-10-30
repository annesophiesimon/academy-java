CREATE TABLE "user"(
	"userId" INT NOT NULL GENERATED ALWAYS AS IDENTITY,
	"firstName" VARCHAR(100) NOT NULL,
	"lastName" VARCHAR(100) NOT NULL,
	"username" VARCHAR(100) NULL,
	"phone" VARCHAR(100) NOT NULL,
	"emailId" VARCHAR(100) NOT NULL,
	"password" VARCHAR(100) NOT NULL,
	"emailVerified" boolean NOT NULL DEFAULT FALSE,
	createOn TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT "User_pkey" PRIMARY KEY ("userId"),
    CONSTRAINT "User_emailId_key" UNIQUE ("emailId"),
    CONSTRAINT "User_username_key" UNIQUE ("username")
);

INSERT INTO "user"(
	"firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified")
VALUES('Jessie', 'Doe', 'jessidoe', '+1-555-1234', 'jessiedoe@example.com','password123', true);

SELECT * FROM "user";

INSERT INTO "user" (
    "firstName", 
    "lastName", 
    "username", 
    "phone", 
    "emailId", 
    "password", 
    "emailVerified",
    "createdOn"
) VALUES 
    ('Amy', 'Lee', 'amylee', '+1-555-9012', 'amylee@example.com', 'password789', true, NOW()),
    ('Tom', 'Jones', 'tomjones', '+1-555-3456', 'tomjones@example.com', 'passwordabc', false, NOW()),
    ('Diana', 'Hill', 'dianahill', '+1-632-3456', 'dianahill@example.com', 'password123', false, NOW());
    
 SELECT * FROM "user" WHERE "emailVerified"=true;
 
 INSERT INTO "user" (
    "firstName", 
    "lastName", 
    "username", 
    "phone", 
    "emailId", 
    "password", 
    "emailVerified",
    "createdOn"
) VALUES 
    ('Kevin', 'Drew', 'kevindrew', '+1-555-1234', 'kevindrew@example.com', 'passwordxyz', true, NOW()),
    ('Marie', 'Lou', 'marielou', '+1-555-5678', 'marielou@example.com', 'password321', false, NOW()),
    ('Chris', 'Evans', 'chrisevans', '+1-555-8765', 'chrisevans@example.com', 'passworddef', true, NOW()),
    ('Emily', 'Clark', 'emilyclark', '+1-555-4321', 'emilyclark@example.com', 'passwordghi', false, NOW());

 
 UPDATE "user" SET "username"='randyjones' WHERE "username"='tomjones';
 
 SELECT * FROM "user" WHERE "username" = 'tomjones';
 
DELETE FROM "user" WHERE "username" = 'randyjones';

SELECT * FROM "user";
--- PROFILE TABLE 

CREATE TABLE "profile"(
	"profileId" INT NOT NULL GENERATED ALWAYS AS IDENTITY,
	"userId" INT NOT NULL,
	"headline" VARCHAR(150) NOT NULL,
	"picture" VARCHAR(150) NOT NULL,
	"bio" VARCHAR(200),
	"city" VARCHAR(100),
	"country" VARCHAR(100),
	CONSTRAINT "Profile_pkey" PRIMARY KEY ("profileId"),
    CONSTRAINT "Profile_userId_fkey" FOREIGN KEY ("userId") REFERENCES "user" ("userId")
);

INSERT INTO "profile" (
"userId", "headline", "picture", "bio", "city", "country"
) VALUES(
2, 'Wondergirl Amy!', 'https://static.vecteezy.com/system/resources/previews/005/162/430/original/cartoon-happy-superhero-girl-posing-free-vector.jpg', 'My name is Amy and I am a super hero.', 'Toronto', 'Canada');

INSERT INTO "profile"
VALUES 
    (DEFAULT, 2, 'Software Developer', 'profile1.jpg', 'Passionate about coding and technology.', 'Toronto', 'Canada'),
    (DEFAULT, 4, 'Graphic Designer', 'profile2.jpg', 'Creative thinker with a love for design.', 'Vancouver', 'Canada');
    
 SELECT * FROM "profile" WHERE "country" = 'Canada';
 
 UPDATE "profile" SET "bio"='I am Amy and I probably shouldn''t tell anyone I''m a super hero' WHERE "userId" = 2;
 
 SELECT * FROM "profile" WHERE "userId" =2;
-- Join the "User" and "Profile" tables to get all the details for ALL users (including the ones without a profile). Hint: Use an outer join.

 SELECT 
    "u"."userId", 
    "u"."firstName", 
    "u"."lastName", 
    "u"."username", 
    "u"."phone", 
    "u"."emailId", 
    "p"."profileId", 
    "p"."headline", 
    "p"."picture", 
    "p"."bio", 
    "p"."city", 
    "p"."country"
FROM 
    "user" AS "u"
LEFT JOIN 
    "profile" AS "p"
ON 
    "u"."userId" = "p"."userId";
  
    -- Join the "User" and "Profile" tables to get the details of the users who have a profile.

SELECT 
    "u"."userId", 
    "u"."firstName", 
    "u"."lastName", 
    "u"."username", 
    "u"."phone", 
    "u"."emailId", 
    "p"."profileId", 
    "p"."headline", 
    "p"."picture", 
    "p"."bio", 
    "p"."city", 
    "p"."country"

	FROM "user" AS "u"
	INNER JOIN "profile" AS "p"

	ON "u"."userId" = "p"."userId";

