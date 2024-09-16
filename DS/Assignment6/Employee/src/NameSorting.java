/**
 * This class extends Employee class and sort the object of Employee class
 * according to their names,(In Ascending order of names)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Amit
 */

public class NameSorting extends Employee{

	public static void main(String[] args) {

		/* employeeList will store employee objects */
		List<Employee> employeeList = new ArrayList<Employee>();
		
		/* Adding employee objects to list */
		employeeList.add(new Employee(102, "Sanjay", "Adarsh Nagar"));
		employeeList.add(new Employee(104, "Anurag", "Pratap Nagar"));
		employeeList.add(new Employee(101, "Amita", "Malviya Nagar"));
		employeeList.add(new Employee(105, "Gaurav", "Sitapura"));
		employeeList.add(new Employee(103, "Amit", "Jhotwara"));
		
		/* Sorting the objects ont he basis of employeenName */
		Collections.sort(employeeList, new NameComparator());
		
		/* Displaying Employees in sorted order of name */
		System.out.println("Sorted Employee List based on Employee Name: ");
		for(Employee e: employeeList) {
			System.out.println(e.getEmployeeId()+"\t"+e.getEmployeeName()+"\t"+e.getEmployeeAddress());
		}
	}

}
