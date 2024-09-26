CREATE DATABASE Library;

USE Library;

CREATE TABLE Author(
author_id INT PRIMARY KEY AUTO_INCREMENT,
author_Name VARCHAR(50)
);

CREATE TABLE Publishers(
publisher_Id INT PRIMARY KEY AUTO_INCREMENT,
publisher_Name VARCHAR(50)
);

CREATE TABLE Subjects(
subject_Id INT PRIMARY KEY AUTO_INCREMENT,
subject_Name varchar(50)
);

CREATE TABLE Members(
member_Id INT PRIMARY KEY AUTO_INCREMENT,
member_Name VARCHAR(50),
addressLine1 VARCHAR(50),
addressLine2 VARCHAR(50),
category CHAR(1)
);

CREATE TABLE Title(
title_Id INT PRIMARY KEY AUTO_INCREMENT,
title_Name VARCHAR(50),
subject_Id INT,
publisher_Id INT,
FOREIGN KEY (subject_Id) REFERENCES Subjects(subject_Id) ON DELETE CASCADE,
CONSTRAINT First
FOREIGN KEY (publisher_Id) REFERENCES Publishers(publisher_Id) ON DELETE CASCADE
);

CREATE TABLE Title_Author(
title_Id INT,
author_Id INT,
PRIMARY KEY(title_Id, author_Id),
FOREIGN KEY (title_Id) REFERENCES Title(title_Id) ON DELETE CASCADE,
FOREIGN KEY (author_Id) REFERENCES Author(author_Id) ON DELETE CASCADE
);

CREATE TABLE Books(
accession_No INT PRIMARY KEY AUTO_INCREMENT,
title_Id INT,
purchase_Date DATE,
price REAL,
status INT 
CHECK (status IN(0,1))
);

CREATE TABLE Book_Issue(
issue_Date DATE,
accession_No INT,
member_Id INT,
due_Date DATE,
PRIMARY KEY(issue_Date, accession_No, member_Id),
FOREIGN KEY(accession_No) REFERENCES Books(accession_No) ON DELETE CASCADE,
FOREIGN KEY(member_Id) REFERENCES Members(member_Id) ON DELETE CASCADE
);

CREATE TABLE Book_Return(
return_Date DATE,
accession_No INT,
member_Id INT,
issue_Date DATE,
PRIMARY KEY(return_Date, accession_No, member_Id),
FOREIGN KEY(accession_No) REFERENCES Books(accession_No) ON DELETE CASCADE,
FOREIGN KEY(member_Id) REFERENCES Members(member_Id) ON DELETE CASCADE
);


SHOW TABLES;

ALTER TABLE Book_Issue MODIFY COLUMN issue_Date TIMESTAMP NOT NULL DEFAULT NOW();
DELIMITER ;;
CREATE TRIGGER book_due_date AFTER INSERT ON Book_Issue FOR EACH ROW
BEGIN
    UPDATE Book_Issue SET due_Date = DATE_ADD(NOW(), INTERVAL 15 DAY) where issue_Date = NOW();
END;;
DELIMITER ;

DESCRIBE Book_Issue;

DROP TRIGGER book_due_date;
DROP TABLE Book_Issue;
DROP TABLE Book_Return;
DROP TABLE Members;

CREATE TABLE Members(
member_Id INT PRIMARY KEY AUTO_INCREMENT,
member_Name VARCHAR(50),
addressLine1 VARCHAR(50),
addressLine2 VARCHAR(50),
category CHAR(1)
);

CREATE TABLE Book_Issue(
issue_Date DATE,
accession_No INT,
member_Id INT,
due_Date DATE,
PRIMARY KEY(issue_Date, accession_No, member_Id),
FOREIGN KEY(accession_No) REFERENCES Books(accession_No),
FOREIGN KEY(member_Id) REFERENCES Members(member_Id)
);

CREATE TABLE Book_Return(
return_Date DATE,
accession_No INT,
member_Id INT,
issue_Date DATE,
PRIMARY KEY(return_Date, accession_No, member_Id),
FOREIGN KEY(accession_No) REFERENCES Books(accession_No),
FOREIGN KEY(member_Id) REFERENCES Members(member_Id)
);

ALTER TABLE Book_Issue MODIFY COLUMN issue_Date TIMESTAMP NOT NULL DEFAULT NOW();
DELIMITER ;;
CREATE TRIGGER book_due_date BEFORE INSERT ON Book_Issue FOR EACH ROW
BEGIN
    SET NEW.due_Date = DATE_ADD(NOW(), INTERVAL 15 DAY);
END;;
DELIMITER ;
