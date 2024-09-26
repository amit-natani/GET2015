package com.metacube.jdbc.helper;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.metacube.jdbc.util.ConnectionUtil;

/**
 * @author Amit
 */

public class Helper {

	
	/** Method to issue a book to an existing member
	 * 
	 * @return true if resultSet is generated, false otherwise
	 */
	public static boolean issueBook(String bookName, String memberName) {
		
		if(nullAndEmptyTest(bookName) || nullAndEmptyTest(memberName)) {
			return true;
		}
		
		/* flag indicates whether the book has been issued or not */
		boolean flag = true;
		
		/* Initialization */
		Connection con = null;
		Statement stmt = null;
		try
		{
			/* Instantiation */
			ConnectionUtil conUtil = new ConnectionUtil();
			con = conUtil.getConnection();
			stmt = con.createStatement();
			
			/* query will store the database query in string format */
			String query = "INSERT INTO Book_Issue(issue_date,accession_No, member_id, due_Date) VALUES(now(),(select accession_no  from books where status=1 and title_id =( select title_id from title where title_name= '"+bookName+"') limit 0,1), (select member_id from members where member_name = '"+memberName+"'),'2015-11-06');";
			
			/* executing query and result will be stored in flag */
			flag = stmt.execute(query);
			String nextQuery ="update books set status=0 where  title_id =( select title_id from title where title_name= '"+bookName+"') limit 1;";
			stmt.executeUpdate(nextQuery);
			return flag;
		} catch(SQLException e) {
			return flag;
		}
	}
	
	/** This method checks whether the given string is null or not
	 * or the lenght of given string is zero or not
	 * @param input : input string
	 * @return true if string is null or empty, false otherwise
	 */
	private static boolean nullAndEmptyTest(String input) {
		if(input == null || input.trim().length() == 0) 
			return true;
		else
			return false;
	}
}
