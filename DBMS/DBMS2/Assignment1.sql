USE Library;

-- Query to find the columns of table members
SELECT * FROM Members;

-- Query to find the member id,member name,category of table members
SELECT member_Name, member_Id, category FROM Members;

-- Query to find the member id,member name,category of table members whose category = "f"
SELECT member_Name, member_Id, category FROM Members WHERE category = 'F';

-- Query to find distinct category of table members
SELECT DISTINCT category FROM Members;

-- Query to find the member id,member name of table members order by desc
SELECT member_id, member_Name, category FROM Members ORDER BY member_Name DESC;

-- Query to find the title name,publisher name, subject id of table
SELECT T.title_Id, T.title_Name,
P.publisher_Name, S.subject_Name
FROM Title AS T
INNER JOIN Publishers AS P ON T.publisher_Id = P.publisher_Id
INNER JOIN SUbjects AS S ON T.subject_Id = S.subject_Id;

-- Query to find the count of members of category
SELECT category, COUNT(*)
FROM Members
GROUP BY category;

-- Query to Insert a record in Members Table
INSERT INTO Members(member_Name, addressLine1, addressLine2, category) VALUES('Keshav Sharma', 'EPIP Sitapura','Jaipur', 'M');

-- Query to find name of members to which amit belongs
SELECT m1.member_name FROM members 
AS m1 JOIN members AS m2 
ON m1.category = m2.category 
WHERE m2.member_name ="Amit Natani";

-- Query to find the status of return book and if returned  then place blank
SELECT f.issue_Date, f.member_Id,f.accession_No,
if( e.status =0 , return_Date, null ) as Book_Returned from Books e,
Book_Return f, Members m WHERE 
((e. accession_No = f.accession_No )&&(f.member_Id=m.member_Id)) 
ORDER BY issue_date asc , member_Name asc;
