
/**
 * @author Amit
 *
 */
public class Employee extends Person {
	
	private int employeeId;
	private String department;
	
	/* paramterized constructor to create objects of Employee class */
	public Employee(int uid, String name, int employeeId, String department) 
	{
		super(uid, name);
		this.employeeId = employeeId;
		this.department = department;
	}
	
	/* this method returns employeeId */ 
	public int getEmployeeId()
	{
		return employeeId;
	}
	
	/* this method set employeeId of particular employee */
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	
	/* this method returns the department of particular employee */
	public String getDepartment()
	{
		return department;
	}
	
	public void setDepartment(String department)
	{
		this.department = department;
	}
	 /* This method returns details of employee in string representation */
	public String toString()
	{
		return super.toString()+", EmployeeId: "+employeeId+", Department: "+department;
	}

}
