/**
 * This class is responsible to create and manipulate data of Employees
 */
import java.util.Comparator;

/**
 * @author Amit
 */

public class Employee implements Comparable<Employee> {

	/* Data Members */
	private Integer employeeId;
	private String employeeName;
	private String employeeAddress;
	
	/** No Argument Constructor */
	public Employee() {
		
	}
	
	/** Parameterized Constructor
	 * 
	 * @param employeeId : Id of Employee
	 * @param employeeName : Name of Employee
	 * @param employeeAddress : Address of Employee
	 */
	public Employee(Integer employeeId, String employeeName,
			String employeeAddress) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}
	
	/** Method to get Employee ID of particular Employee
	 * 
	 * @return employeeId
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}
	
	/** Method to set Employee Id of particular employee
	 * 
	 * @param employeeId
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	/** Method to get Name of particular Employee
	 * 
	 * @return employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	
	/** Method to set Name of particular employee
	 * 
	 * @param employeeName
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	/** Method to get Address of particular Employee
	 * 
	 * @return employeeAddress
	 */
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	
	/** Method to set Address of particular employee
	 * 
	 * @param employeeAddress
	 */
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
	/** hashCode method of Employee class
	 * @return result : hashCode of particular Object
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((employeeId == null) ? 0 : employeeId.hashCode());
		return result;
	}
	
	/** equals method of Employee class. 
	 * this method checks that whether two objects are equal or not.
	 * equality is checked on the basis of employee Id. 
	 * if two objects have same Employee Id then they are treated as equal.
	 * 
	 * @param obj : Object of Employee Class
	 * 
	 * @return true if both objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		return true;
	}
	
	/** This nested class NameComparator that implements Comparator interface
	 * compares objects or Employee class according to their names 
	 */
	static class NameComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getEmployeeName().compareTo(e2.getEmployeeName());
		}
		
	}

	/** Method to compare two objects of Employee class 
	 * according to their EmployeeId
	 */
	@Override
	public int compareTo(Employee employeeObj) {
		if(employeeObj == null)
			return -1;
		return this.getEmployeeId().compareTo(employeeObj.getEmployeeId());
	}
}
