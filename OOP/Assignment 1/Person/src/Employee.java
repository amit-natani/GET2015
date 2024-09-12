
/**
 * @author Amit
 *
 */
public class Employee extends Person {
	
	/* Instance Variable Declaration */
	private int employeeId;
	private String department;
	
	/** parameterized constructor to create objects of Employee class 
	 * @param uid : UID of Employee
	 * @param name : Name of Employee
	 * @param employeeId : Employee ID
	 * @param deaprtment : department of employee 
	 * 
	 */
	public Employee(int uid, String name, int employeeId, String department) 
	{
		super(uid, name);
		this.employeeId = employeeId;
		this.department = department;
	}
	
	/** this method returns employeeId
	 * @return employeeId  */ 
	public int getEmployeeId()
	{
		return employeeId;
	}
	
	/** this method set employeeId of particular employee
	 * @param employeeId : Employee ID */
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	
	/** this method returns the department of particular employee
	 * @return department : Department of Employee */
	public String getDepartment()
	{
		return department;
	}
	
	/** this method set employeeId of particular employee
	 * @param department :  Department of Employee*/
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	/** This method returns details of employee in string representation
	 * @return String representation of  Employee Details*/
	public String toString()
	{
		return super.toString()+", EmployeeId: "+employeeId+", Department: "+department;
	}

}
