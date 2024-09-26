package com.metacube.jdbc.helper;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.metacube.jdbc.util.ConnectionUtil;

/**
 * @author Amit
 */

public class Helper {
	
	/** This method deletes the books which has not been issued since last 1 year */
	public static int deleteBooks() {
		
		/* Initialization */
		Connection con = null;
		Statement stmt = null;
		try {
			
			/* Instantiation */
			ConnectionUtil conUtil = new ConnectionUtil();
			con = conUtil.getConnection();
			stmt = con.createStatement();
			
			/* query contains the database query in string format */
			String query = "DELETE FROM Books WHERE accession_no IN (SELECT accession_no FROM(SELECT DISTINCT b.accession_no FROM Book_issue bi,Books b WHERE (DATEDIFF(now(),b.purchase_Date)>=365 AND b.accession_no NOT IN (SELECT accession_no FROM Book_issue)) OR b.accession_no IN(SELECT br.accession_no FROM book_return br, books b3 WHERE(DATEDIFF(now(),IF(br.return_date = NULL, purchase_date, br.return_date)) >= 365) AND br.accession_no IN (SELECT accession_no FROM Books WHERE status = 1))) AS a);";
			
			/* numberOfBooksDeleted will contain total number of books deleted */
			int numberOfBooksDeleted = stmt.executeUpdate(query);
			return numberOfBooksDeleted;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
}
