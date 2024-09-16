/**
 * This class sort the object of Employee class
 * according to their Id (In Natural Ordering of Employee Id)
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Amit
 */

public class NaturalOrderSorting {

	public static void main(String[] args) {

		/* employeeList will store employee objects */
		List<Employee> employeeList = new ArrayList<Employee>();
		
		/* Adding employee objects to list */
		employeeList.add(new Employee(102, "Sanjay", "Adarsh Nagar"));
		employeeList.add(new Employee(104, "Anurag", "Pratap Nagar"));
		employeeList.add(new Employee(101, "Ankur", "Malviya Nagar"));
		employeeList.add(new Employee(105, "Gaurav", "Sitapura"));
		employeeList.add(new Employee(103, "Amit", "Jhotwara"));
		
		/* Sorting the objects ont he basis of employeenId in natural Order */
		Collections.sort(employeeList);
		
		/* Displaying Employees in sorted order of employeeID */
		System.out.println("Sorted Employee List based on Natural Order of Employee Id: ");
		for(Employee e: employeeList) {
			System.out.println(e.getEmployeeId()+"\t"+e.getEmployeeName()+"\t"+e.getEmployeeAddress());
		}
	}

}
