package com.Controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helper.EmployeeCache;
import com.helper.RegistrationAuthentication;
import com.model.Employee;

/**
 * Servlet implementation class RegistrationForm
 */

@WebServlet("/RegistrationForm")
public class RegistrationForm extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationForm() {
        super();
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException 
	{
    	
    	/* Flag will indicate successful register or Edit */
		boolean flag = true;
		
		/* Type will store the type of operation (New Registration Or Edit) */
		String type = (String)req.getParameter("type");
		RequestDispatcher requestDispatcher;
		
		/* if type is register then Registration will be performed */
		if(type.equals("register")) 
		{
			flag = registerEmployee(req);
		}
		/* if type is edit then Edit will be performed */
		else 
		{
			flag = editEmployeeDetails(req);
		}
		
		/* After edit or registration if flag is true then transfer to ListController to show the list */
		if(flag)
		{
			requestDispatcher = req.getRequestDispatcher("ListController");
			requestDispatcher.forward(req, res);
		}
		
		/* In case of failure transfer to registration page */
		requestDispatcher = req.getRequestDispatcher("registration.jsp?id=0");
		requestDispatcher.forward(req, res);		
	}
	
    /** Private method to register Employee
     * 
     * @param req : HttpServletRequest Object
     * @return true if successfully registered, false otherwise
     */
	private boolean registerEmployee(HttpServletRequest req)
	{
		boolean flag = true;
		/* Checking for null values */
		flag = checkForNull(req);
		if(flag) 
		{
			/* Getting parameters from request */
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			int id =(Integer.parseInt(req.getParameter("Eid")));
			int age =(Integer.parseInt(req.getParameter("age")));
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			Date date = new Date();
			if(RegistrationAuthentication.check(id)) 
			{
				/* If id is unique then create Employee object and add to employeeCache*/
				Employee employee = new Employee(name, email, id, age, dateFormat.format(date));
				EmployeeCache employeeCache = EmployeeCache.getInstance();
				employeeCache.addEmployee(employee);

			}
			else 
			{
				/* If Id is already present then tis code will be executed */
				flag = false;
				req.setAttribute("msg","Id Already Present");
			}
		}
		
		return flag;
	}
	
	/** Private method to Edit Employee
     * 
     * @param req : HttpServletRequest Object
     * @return true if successfully edited, false otherwise
     */
	private boolean editEmployeeDetails(HttpServletRequest req)
	{
		boolean flag = true;
		/* Checking for null values */
		flag = checkForNull(req);
		if(flag) 
		{
			/* Getting parameters from request */
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			int id =(Integer.parseInt(req.getParameter("Eid")));
			int age =(Integer.parseInt(req.getParameter("age")));
			EmployeeCache employeeCache = EmployeeCache.getInstance();
			Employee employee = employeeCache.getEmployeeForId(id);
			String date = employee.getDateOfRegistration();
			employee = new Employee(name, email, id, age, date);
			
			/* Updating the Employee */
			employeeCache.updateEmployee(employee);
		}
		
		return flag;
	}
	
	/** MEthod to check for null values 
	 * 
	 * @param req HttpServletRequest Object
	 * @return true if not null, false otherwise
	 */
	private boolean checkForNull(HttpServletRequest req) {
		boolean flag = true;
		if(req.getParameter("name").equals("") || req.getParameter("email").equals("") || req.getParameter("Eid").equals("") || req.getParameter("age").equals("")) 
		{
			flag = false;
			req.setAttribute("msg", "Specify all Details");
		}
		return flag;
	}
}	
