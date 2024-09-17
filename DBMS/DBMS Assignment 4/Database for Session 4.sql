CREATE DATABASE LIS;

USE LIS;

-- Author table
CREATE TABLE Author
(
    author_id INT PRIMARY KEY AUTO_INCREMENT,
    author_Name VARCHAR(50)
);

-- Publisher Table
CREATE TABLE Publishers
(
    publisher_Id INT PRIMARY KEY AUTO_INCREMENT,
    publisher_Name VARCHAR(50)
);

-- Subjects Table
CREATE TABLE Subjects
(
    subject_Id INT PRIMARY KEY AUTO_INCREMENT,
    subject_Name varchar(50)
);

-- Members Table
CREATE TABLE Members
(
    member_Id INT PRIMARY KEY AUTO_INCREMENT,
    member_Name VARCHAR(50),
    addressLine1 VARCHAR(50),
    addressLine2 VARCHAR(50),
    category CHAR(1)
);

-- Title Table
CREATE TABLE Title
(
    title_Id INT PRIMARY KEY AUTO_INCREMENT,
    title_Name VARCHAR(50),
    subject_Id INT,
    publisher_Id INT,
    FOREIGN KEY (subject_Id) REFERENCES Subjects(subject_Id),
    FOREIGN KEY (publisher_Id) REFERENCES Publishers(publisher_Id)  ON DELETE CASCADE
);

-- Title Author table
CREATE TABLE Title_Author
(
    title_Id INT,
    author_Id INT,
    PRIMARY KEY(title_Id, author_Id),
    FOREIGN KEY (title_Id) REFERENCES Title(title_Id) ON DELETE CASCADE,
    FOREIGN KEY (author_Id) REFERENCES Author(author_Id)
);

-- Books table
CREATE TABLE Books
(
    accession_No INT PRIMARY KEY AUTO_INCREMENT,
    title_Id INT,
    purchase_Date DATE,
    price REAL,
    status INT 
    CHECK (status IN('0','1')),
    FOREIGN KEY (title_Id) REFERENCES Title(title_Id) ON DELETE CASCADE
    
);

-- Books Issue Table
CREATE TABLE Book_Issue
(
    issue_Date DATE,
    accession_No INT,
    member_Id INT,
    due_Date DATE,
    PRIMARY KEY(issue_Date, accession_No, member_Id),
    FOREIGN KEY(accession_No) REFERENCES Books(accession_No),
    FOREIGN KEY(member_Id) REFERENCES Members(member_Id)
);

-- Book Return Table
CREATE TABLE Book_Return
(
    return_Date DATE,
    accession_No INT,
    member_Id INT,
    issue_Date DATE,
    PRIMARY KEY(return_Date, accession_No, member_Id),
    FOREIGN KEY(accession_No) REFERENCES Books(accession_No),
    FOREIGN KEY(member_Id) REFERENCES Members(member_Id)
);

-- Inserting value in author
INSERT INTO Author(author_Id, author_Name) values(101, "Anurag");
INSERT INTO Author(author_Name) values("Anand");
INSERT INTO Author(author_Name) values("Ankur");
INSERT INTO Author(author_Name) values("Gaurav");
INSERT INTO Author(author_Name) values("udit");
INSERT INTO Author(author_Name) values("jignesh");

SELECT * FROM Author;

-- Inserting into Publishers
INSERT INTO Publishers(publisher_Id, publisher_Name) values(1, "Shyam Books");
INSERT INTO Publishers(publisher_Name) values(" Cbc House");
INSERT INTO Publishers(publisher_Name) values("A M Publishers");
INSERT INTO Publishers(publisher_Name) values("Academia Research");
INSERT INTO Publishers(publisher_Name) values("Blue Apple Publications");
INSERT INTO Publishers(publisher_Name) values("Cloud Publications");
INSERT INTO Publishers(publisher_Name) values("College Book House");

SELECT * FROM PUBLISHERS;

-- Inserting into Subjects
INSERT INTO Subjects(subject_Id, subject_Name) VALUES(301, "Java");
INSERT INTO Subjects(subject_Name) VALUES("Data Structures");
INSERT INTO Subjects(subject_Name) VALUES("DBMS");
INSERT INTO Subjects(subject_Name) VALUES("C++");
INSERT INTO Subjects(subject_Name) VALUES("C");
INSERT INTO Subjects(subject_Name) VALUES("English");
INSERT INTO Subjects(subject_Name) VALUES("Mathematics");
SELECT * FROM Subjects;

ALTER TABLE Members ADD CHECK(category = 'M' OR category = 'F');

-- Inserting Into Members
INSERT INTO Members(member_name, addressLine1, addressLine2, category) VALUES("Amit Natani", "Jhotwara", "Jodhpur", "S");
INSERT INTO Members(member_name, addressLine1, addressLine2, category) VALUES("Gaurav Saini", "Pratap Nagar", "Alwar", "S");
INSERT INTO Members(member_name, addressLine1, addressLine2, category) VALUES("Rohini Sharma", "Malviya Nagar", "Kota", "O");
INSERT INTO Members(member_name, addressLine1, addressLine2, category) VALUES("Ankur Gupta", "Sitapura", "Jaipur", "F");
INSERT INTO Members(member_name, addressLine1, addressLine2, category) VALUES("Ruhani Singh", "Vishali Nagar", "Tonk", "F");
INSERT INTO Members(member_name, addressLine1, addressLine2, category) VALUES("Mark Thomson", "Vidhyadhar Nagar", "Jaipur", "S");
INSERT INTO Members(member_name, addressLine1, addressLine2, category) VALUES("Keshav Sharma", "Vaishali Nagar", "Jaipur", "F");

SELECT * FROM Members;

-- Inserting into Title
INSERT INTO Title(title_Id, title_Name, subject_Id, publisher_Id) VALUES(1001, "C++ Complete Reference", 304, 2);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES("Standard Edition Java", 301, 1);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES("Basics Of C", 305, 6);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES("Learning Data Structure", 302, 4);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES("Learn English Perfect", 306, 3);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES("Formula Of Mathematics", 307, 5);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES("Database Concepts", 303, 7);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES("Java Complete Reference", 301, 2);

SELECT * FROM Title;

-- Inserting into Title Author

INSERT INTO Title_Author(title_Id, author_Id) values(1002, 101);
INSERT INTO Title_Author(title_Id, author_Id) values(1001, 102);
INSERT INTO Title_Author(title_Id, author_Id) values(1003, 104);
INSERT INTO Title_Author(title_Id, author_Id) values(1004, 101);
INSERT INTO Title_Author(title_Id, author_Id) values(1007, 102);
INSERT INTO Title_Author(title_Id, author_Id) values(1002, 105);
INSERT INTO Title_Author(title_Id, author_Id) values(1006, 106);
INSERT INTO Title_Author(title_Id, author_Id) values(1001, 103);
INSERT INTO Title_Author(title_Id, author_Id) values(1005, 104);
INSERT INTO Title_Author(title_Id, author_Id) values(1003, 102);
INSERT INTO Title_Author(title_Id, author_Id) values(1008, 103);

SELECT * FROM Title_Author;

-- Inserting into Books

INSERT INTO Books(accession_No, title_id, purchase_Date, price, status) VALUES(2001, 1001, "2014-09-23", 500.0, 1); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1002, "2014-01-17", 700.0, 1);
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1004, "2013-03-06", 400.0, 1); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1007, "2014-02-10", 350.0, 0); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1003, "2015-07-24", 280.0, 1); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1005, "2014-09-29", 370.0, 1); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1006, "2014-08-16", 250.0, 1); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1002, "2015-07-03", 700.0, 1); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1003, "2013-10-19", 280.0, 1); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1006, "2013-12-24", 250.0, 1); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1001, "2015-11-08", 500.0, 1); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1002, "2015-04-13", 700.0, 1);
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1003, "2015-02-12", 280.0, 1);
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1008, "2015-02-23", 320.0, 1);

SELECT * FROM Books;

-- Inserting Book Issue

INSERT INTO Book_Issue(issue_Date, accession_No, member_id, due_Date) VALUES('2015-08-23', 2001, 1,'2015-11-06');
INSERT INTO Book_Issue(issue_Date, accession_No, member_id, due_Date) VALUES('2015-08-12', 2004, 2,'2015-10-06');
INSERT INTO Book_Issue(issue_Date, accession_No, member_id, due_Date) VALUES('2015-09-12', 2006, 3,'2015-12-06');
INSERT INTO Book_Issue(issue_Date, accession_No, member_id, due_Date) VALUES('2015-09-14', 2007, 4,'2016-02-06');
INSERT INTO Book_Issue(issue_Date, accession_No, member_id, due_Date) VALUES('2015-09-13', 2009, 5,'2015-12-06');
INSERT INTO Book_Issue(issue_Date, accession_No, member_id, due_Date) VALUES('2015-08-31', 2001, 6,'2015-10-06');
INSERT INTO Book_Issue(issue_Date, accession_No, member_id, due_Date) VALUES('2015-04-27', 2001, 2,'2015-05-06');

SELECT * FROM Book_Issue;

-- Inserting Book Return
INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES('2015-09-06', 2001, 2, '2015-04-27');
INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES('2015-09-07', 2001, 1, '2015-08-23');
INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES('2015-09-04', 2007, 4, '2015-09-14');
INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES('2015-08-25', 2009, 5, '2015-09-13');
INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES('2015-08-31', 2001, 6, '2015-08-31');
INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES('2015-09-12', 2006, 3, '2015-12-06');

SELECT * FROM Book_Return;