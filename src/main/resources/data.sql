--CREATE TABLE PERSON
--(
--    ID INTEGER NOT NULL,
--    NAME VARCHAR(255) NOT NULL,
--    LOCATION VARCHAR(225),
--    BIRTH_DATE TIMESTAMP,
--    PRIMARY KEY(ID)
--);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (51,'Hardik', 'Mundra', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (52,'Mom', 'Morbi', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (53,'Papa', 'Morbi', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (54,'Sneha', 'Pune', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (55,'ReenaBhabhi', 'Mundra', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (56,'Nirav', 'Pune', sysdate());

INSERT INTO PASSPORT (ID, PASSPORT_NUMBER) VALUES (10001, 'Nirav214');
INSERT INTO PASSPORT (ID, PASSPORT_NUMBER) VALUES (10002, 'Hardik74310');
INSERT INTO PASSPORT (ID, PASSPORT_NUMBER) VALUES (10003, 'Papa1111');


INSERT INTO STUDENT (ID, NAME, PASSPORT_ID) VALUES (1001, 'Nirav', 10001);
INSERT INTO STUDENT (ID, NAME, PASSPORT_ID) VALUES (1002, 'Hardik', 10002);
INSERT INTO STUDENT (ID, NAME, PASSPORT_ID) VALUES (1003, 'Papa', 10003);

INSERT INTO COURSE (ID, NAME) VALUES (10001, 'Java');
INSERT INTO COURSE (ID, NAME) VALUES (10002, 'Spring');

INSERT INTO REVIEW (ID, RATING, COMMENT, COURSE_ID) VALUES (1001, '5', 'Good content', 10001);
INSERT INTO REVIEW (ID, RATING, COMMENT, COURSE_ID) VALUES (1002, '3', 'Average content', 10001);
INSERT INTO REVIEW (ID, RATING, COMMENT, COURSE_ID) VALUES (1003, '5', 'Best content', 10001);
INSERT INTO REVIEW (ID, RATING, COMMENT, COURSE_ID) VALUES (1004, '4', 'Better content', 10002);
INSERT INTO REVIEW (ID, RATING, COMMENT, COURSE_ID) VALUES (1005, '3', 'Okok content', 10002);


