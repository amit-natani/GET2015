-- ASsignment-3

USE LibrarySecond;

/* Question 1 : Query to display total number of students, total number of faculty
and total number of others in library information system in a single row.
*/
SELECT count( if( category="F",member_name, NULL )) AS "Number of Faculty" ,
count( if( category="S",member_name,NULL )) AS "Number of Students",
count( if( category="O",member_name,NULL )) AS "Others"
FROM
members ;

/* Question 2: Query to display the information of those titles that have been issued more than 2 times */
SELECT t.title_name AS TitleName,
count(bi.accession_no) AS "Issue Times"
FROM book_issue bi, title t, books bk 
WHERE
bk.accession_no = bi.accession_no AND 
t.title_id = bk.title_id
GROUP BY t.title_Name HAVING count(t.title_Name) > 2;

/* Question 3: Query to display information on books issued to members of category other than "F"
*/
SELECT m.member_name AS Name,
m.category AS Category,
b.member_id AS ID,
t.title_name AS Title,
bs.accession_no AS "Accession Number",
b.issue_date AS "Date of Issue",
b.due_date AS "Due Date"
FROM  book_issue b, members m, title t , books bs 
WHERE 
m.member_id=b.member_id AND
bs.accession_no=b.accession_no AND
t.title_id = bs.title_id AND
m.category NOT IN("F");

/* Question 4: Query to display information on those authors for which
at leASt one book hAS been purchASed */
SELECT DISTINCT a.author_id AS ID,
concat(a.author_Name) AS "Author Name"
FROM author a,books b, Title_Author ta
WHERE 
ta.title_id= b.title_id AND
a.author_id= ta.author_id;
