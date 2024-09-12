/**
 * 
 */

/**
 * @author Amit
 *
 */
public class MainPerson {

	public static void main(String[] args) 
	{
		try
		{
			/* initialization of Employee Object */
			Employee employee1 = new Employee(12345432, "Ankit", 101, "Finance");
			Employee employee2 = new Employee(98765674, "Amit", 102, "Accounts");
			System.out.println(employee1.toString());	// Details of Employee 1
			System.out.println(employee2.toString());	// details of Employee 2
			
			
			/* Initialization of Student Object */
			Student student1 = new Student(23454567, "Avinash", 201);
			Student student2 = new Student(54356456, "Vishal", 202);
			System.out.println(student1.toString());	// Details of Student 1
			System.out.println(student2.toString());	// Details of Student 2
			student1.setName("Amit");
			System.out.println(student1.toString());	//  Details of student 1 after update name
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			return;
		}
	}

}
