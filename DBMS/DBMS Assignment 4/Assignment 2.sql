/* Assignment 2 */

USE LIS;

/* Question 1 : Query to Create a View which can be used to display member name and
all issue details of the member using a simple SELECT command.
 */
 
CREATE VIEW member_Details
AS
SELECT 
    member_name, issue_date, due_date ,title_name 
FROM 
    members m,
    book_issue bi,
    books b, 
    title t 
WHERE 
    m.member_id = bi.member_id AND bi.accession_no = b.accession_no AND b.title_id = t.title_id;
    
SELECT 
    *
FROM
    member_Details;

/* Question 2 : Query to Create a View which contains three columns, member name,
member id and full description of category, i.e., Faculty, Students
and Others instead of F,S and O.
*/

CREATE VIEW category_Description 
AS
SELECT member_name,member_id, IF(category NOT IN ('s','f'),"OTHER",IF(category='f',"FACULTY","STUDENT")) AS category  
FROM members;
SELECT 
    *
FROM
    category_Description;
    
    
/* Question 3: Query to Create a View which contains the information – subject name,
title, member name, category, issue date, due date and return
date. If the books have not been returned, NULL should be
displayed instead of return date.
*/
CREATE VIEW full_Description
AS
SELECT s.subject_name,t.title_name,m.member_name,m.category,bi.issue_Date,bi.due_date,
IF(b.status = 0, NULL, br.return_Date) AS "Return_Date" 
FROM members m,books b, subjects s, book_return br, book_issue bi, title t 
WHERE m.member_id = bi.member_id 
AND bi.accession_no = b.accession_no AND b.title_id=t.title_id AND t.subject_id = s.subject_id AND m.member_id=br.member_id;
 
SELECT 
    *
FROM
    full_Description;
 