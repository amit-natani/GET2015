/* Assignment 1 */

USE LIS;

/* Queation 1 : Query to display name of those members
who belong to the category as to which member “Keshav Sharma” belongs.
*/

SELECT 
    member_name
FROM
    members
where
    category = (SELECT 
        category
    FROM
        members
    WHERE
        member_name = 'Keshav Sharma');
        
/* Question 2 : Query to display information on the books
that have not been returned till date. The information should
include book issue date, title, member name and due date.
*/

SELECT 
    m.member_name, br.due_date, br.issue_date, t.title_name
FROM
    members m,
    book_issue br,
    title t
WHERE
    m.member_id = br.member_id AND br.accession_no = (select 
        accession_no
    from
        book_issue
    where
        accession_no not in (SELECT 
            Accession_No
        from
            Book_return)) AND t.title_id = (SELECT 
        title_id
    FROM
        books
    WHERE
        br.accession_No = Books.accession_No);
        
/* Question 3: Query to display information on the books
that have been returned after their due dates. The information
should include book issue date, title, member name and due date.
*/

SELECT 
    br.issue_Date, t.title_name, m.member_name, due_date
FROM
    Book_Issue bi,
    Book_return br,
    Members m,
    Title t,
    Books b
WHERE
    (bi.member_Id = m.member_Id AND m.member_Id = br.member_Id AND br.accession_No = b.accession_No AND b.title_Id = t.title_Id AND br.accession_No = bi.accession_No AND bi.due_Date < br.return_Date);

/* Question 4 : Query to display information of those books
whose price is equal to the most expensive book purchase so far.
*/

SELECT 
    DISTINCT(t.title_Name), b.price
FROM
    Books b,
    Title t
WHERE
    b.title_Id = t.title_Id AND b.price = (SELECT 
        MAX(price)
    FROM
        Books);
        
/* Question 5 : Query to  display the second maximum price
of a book.
*/

SELECT 
    MAX(price) AS 'Second Maximum Price'
FROM
    books
WHERE
    price < (SELECT 
        max(price)
    FROM
        books);

