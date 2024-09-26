INSERT INTO Author(author_Id, author_Name) VALUES(101, "Amit");
INSERT INTO Author(author_Name) VALUES("Ankit");
INSERT INTO Author(author_Name) VALUES("Banwari");
INSERT INTO Author(author_Name) VALUES("Gaurav");
INSERT INTO Author(author_Name) VALUES("Rohit");
INSERT INTO Author(author_Name) VALUES("Ankur");

SELECT * FROM Author;

INSERT INTO Publishers(publisher_Id, publisher_Name) VALUES(201, "Katha Books");
INSERT INTO Publishers(publisher_Name) VALUES("Jaico Publishing House");
INSERT INTO Publishers(publisher_Name) VALUES("India Book House");
INSERT INTO Publishers(publisher_Name) VALUES("NeelKanth Publication");
INSERT INTO Publishers(publisher_Name) VALUES("Genius Publication");
INSERT INTO Publishers(publisher_Name) VALUES("Ashirwaad Publication");
INSERT INTO Publishers(publisher_Name) VALUES("College Book House");

SELECT * FROM Publishers;

INSERT INTO Subjects(subject_Id, subject_Name) VALUES(301, "Java");
INSERT INTO Subjects(subject_Name) VALUES("Data Structures");
INSERT INTO Subjects(subject_Name) VALUES("DBMS");
INSERT INTO Subjects(subject_Name) VALUES("C++");
INSERT INTO Subjects(subject_Name) VALUES("C");
INSERT INTO Subjects(subject_Name) VALUES("English");
INSERT INTO Subjects(subject_Name) VALUES("Mathematics");

SELECT * FROM Subjects;

ALTER TABLE Members ADD CHECK(category = 'M' OR category = 'F');

INSERT INTO Members(member_name, addressLine1, addressLine2, category) VALUES("Amit Natani", "Jhotwara", "Jodhpur", "M");
INSERT INTO Members(member_name, addressLine1, addressLine2, category) VALUES("Gaurav Saini", "Pratap Nagar", "Alwar", "M");
INSERT INTO Members(member_name, addressLine1, addressLine2, category) VALUES("Rohini Sharma", "Malviya Nagar", "Kota", "F");
INSERT INTO Members(member_name, addressLine1, addressLine2, category) VALUES("Ankur Gupta", "Sitapura", "Jaipur", "M");
INSERT INTO Members(member_name, addressLine1, addressLine2, category) VALUES("Ruhani Singh", "Vishali Nagar", "Tonk", "F");
INSERT INTO Members(member_name, addressLine1, addressLine2, category) VALUES("Mark Thomson", "Vidhyadhar Nagar", "Jaipur", "M");

SELECT * FROM Members;

INSERT INTO Title(title_Id, title_Name, subject_Id, publisher_Id) VALUES(1001, "C++ Complete Reference", 304, 202);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES("Standard Edition Java", 301, 201);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES("Basics Of C", 305, 206);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES("Learning Data Structure", 302, 204);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES("Learn English Perfect", 306, 203);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES("Formula Of Mathematics", 307, 205);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES("Database Concepts", 303, 207);

SELECT * FROM Title;

INSERT INTO Title_Author(title_Id, author_Id) values(1002, 101);
INSERT INTO Title_Author(title_Id, author_Id) values(1001, 102);
INSERT INTO Title_Author(title_Id, author_Id) values(1003, 104);
INSERT INTO Title_Author(title_Id, author_Id) values(1004, 101);
INSERT INTO Title_Author(title_Id, author_Id) values(1007, 102);
INSERT INTO Title_Author(title_Id, author_Id) values(1002, 105);
INSERT INTO Title_Author(title_Id, author_Id) values(1006, 103);
INSERT INTO Title_Author(title_Id, author_Id) values(1001, 103);
INSERT INTO Title_Author(title_Id, author_Id) values(1005, 104);
INSERT INTO Title_Author(title_Id, author_Id) values(1003, 102);

SELECT * FROM Title_Author;

INSERT INTO Books(accession_No, title_id, purchase_Date, price, status) VALUES(2001, 1001, "2014-09-23", 500.0, 0); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1002, "2014-01-17", 700.0, 1);
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1004, "2013-03-06", 400.0, 1); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1007, "2014-02-10", 350.0, 0); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1003, "2015-07-24", 280.0, 1); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1005, "2014-09-29", 370.0, 0); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1006, "2014-08-16", 250.0, 0); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1002, "2015-07-03", 700.0, 1); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1003, "2013-10-19", 280.0, 0); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1006, "2013-12-24", 250.0, 1); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1001, "2015-11-08", 500.0, 1); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1002, "2015-04-13", 700.0, 1);
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1003, "2015-02-12", 280.0, 0);

SELECT * FROM Books;

INSERT INTO Book_Issue(accession_No, member_id) VALUES(2001, 1);
INSERT INTO Book_Issue(accession_No, member_id) VALUES(2004, 2);
INSERT INTO Book_Issue(accession_No, member_id) VALUES(2006, 3);
INSERT INTO Book_Issue(accession_No, member_id) VALUES(2007, 4);
INSERT INTO Book_Issue(accession_No, member_id) VALUES(2009, 5);
INSERT INTO Book_Issue(accession_No, member_id) VALUES(2013, 6);

SELECT * FROM Book_Issue;

INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES("2015-09-06", 2001, 2, "2015-08-23");
INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES("2015-09-07", 2002, 1, "2015-08-24");
INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES("2015-09-04", 2003, 3, "2015-08-21");
INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES("2015-08-25", 2008, 4, "2015-08-10");
INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES("2015-08-31", 2005, 6, "2015-08-16");

SELECT * FROM Book_Return;

UPDATE Members SET addressLine2 = "Jaipur";

SELECT * FROM Members;

UPDATE Members SET addressLine1 = "EPIP Sitapura" WHERE category = "F";

SELECT * FROM Members;

Alter table Title DROP FOREIGN KEY First;

TRUNCATE TABLE Publishers;

SET @name = 'Katha Books';
SET @Id = 201;

INSERT INTO Publishers(publisher_Id, publisher_Name)
VALUES(@Id, @name);

SET @name = 'Jaico Publishing House';
INSERT INTO Publishers(publisher_Name)
VALUES(@name);

SET @name = 'India Book House';
INSERT INTO Publishers(publisher_Name)
VALUES(@name);

SET @name = 'NeelKanth Publication';
INSERT INTO Publishers(publisher_Name)
VALUES(@name);

SET @name = 'Genius Publication';
INSERT INTO Publishers(publisher_Name)
VALUES(@name);

SET @name = 'Ashirwaad Publication';
INSERT INTO Publishers(publisher_Name)
VALUES(@name);

SET @name = 'College Book House';
INSERT INTO Publishers(publisher_Name)
VALUES(@name);

DELETE FROM Title WHERE publisher_Id = 201;

SELECT * FROM Title;

SELECT * FROM Publishers;