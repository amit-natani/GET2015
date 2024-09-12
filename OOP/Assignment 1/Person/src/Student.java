/**
 * @author Amit
 *
 */
public class Student extends Person {

	/* Instance Variable Declaration */
	private int studentId;
	private String[] courses;
	
	/** parameterized constructor to create objects of Student class 
	 * @param uid : UID of Student
	 * @param name : Name of Student
	 * @param studentId : Student ID
	 */
	public Student(int uid, String name, int studentId)
	{
		super(uid, name);
		this.studentId = studentId;

	}
	
	/** this method returns studentId
	 * @return studentId : ID of student */ 
	public int getStudentId()
	{
		return studentId;
	}
	
	/** this method set studentId of particular Student
	 * @param studentId : Student ID */
	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}
	
	/** this method returns String array of courses of particular Student
	 * @return courses : Courses of Student */
	public String[] getCourses()
	{
		return courses;
	}
	
	/** this method sets courses of particular Student
	 * @param courses : String array of courses of student */
	public void setCourses(String[] courses)
	{
		this.courses = courses;
	}
	/** This method returns details of Student in string representation
	 * @return String representation of Student Details*/
	public String toString()
	{
		return super.toString()+", StudentId: "+studentId;
	}
}
