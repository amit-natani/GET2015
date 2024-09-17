-- Assignment-1

USE librarySecond;

/* Question -1 : Query to display information on books issued for more than two months
The Information should include member_Name, member_Id, title_Name, accession_No, issue_Date,
due_Date, and Issued for how many months and be sorted on member_Name, and within member_Name on title_Name
*/
SELECT m.member_name,m.member_Id,t.title_Name,t.title_Id,b.accession_No,b.issue_Date,b.due_Date , ROUND(DATEDIFF(due_Date,issue_Date) /30) AS "Issued for months"  
FROM Members m,Book_Issue b,Title t, Books bk
WHERE (m.member_id = b.member_id && t.title_id = bk.title_id && bk.accession_No = b.accession_No) &&( DATEDIFF(b.due_Date,b.issue_Date )) > 60 
ORDER BY member_name ,title_Name;

/* Question -2 : Query to display those rows from members table having maximum length for member_Name
Information should contain member_Name and length of member_Name 
*/
SELECT member_name, length( member_name ) 
FROM Members 
WHERE length( member_name ) = ( SELECT max( length( member_name ) ) FROM Members );

/* Question -3 : Query to display count of numebr of books issued so far.
*/
SELECT COUNT(*) AS "Number Of Books Issued" 
FROM Book_Issue;

