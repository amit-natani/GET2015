-- Assignment-2

USE LibrarySecond;

/* Question -1 : Query to display subject_wise information on numebr of books purchased.
The information should include subject_Name, subject_id, number of books purchased.
*/
SELECT subject_name, s.subject_Id, count(t.title_id) AS "Number Of books purchased" 
FROM Subjects s, Title t 
WHERE t.subject_id = s.subject_Id GROUP BY(subject_id);

/* Question -2 : Query to display those rows from the book_issue table where a book can be returned after two months.
That is the difference in due_date and issue_Date is greater than two months
*/
SELECT m.member_name,m.member_Id,t.title_Name,t.title_Id,b.accession_No,b.issue_Date,b.due_Date , ROUND(DATEDIFF(due_Date,issue_Date)/30) AS "Issue for Months"  
FROM Members m,Book_Issue b,Title t, Books bk
WHERE (m.member_id = b.member_id && t.title_id = bk.title_id && bk.accession_No = b.accession_No) &&( DATEDIFF(b.due_Date,b.issue_Date )) > 60 ;

/* Question -3 : Query to select the lsit of books having price greater than the minimum price of books purchased so far
*/
SELECT accession_No,title_Id, purchase_Date, price, status 
FROM Books WHERE price > (SELECT MIN(price) FROM Books);
