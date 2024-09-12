/**
 * @author Amit
 *
 */
public class Student extends Person {

	private int studentId;
	private String[] courses;
	
	/* paramterized constructor to create objects of Student class */
	public Student(int uid, String name, int studentId)
	{
		super(uid, name);
		this.studentId = studentId;

	}
	
	/* this method returns studentId */ 
	public int getStudentId()
	{
		return studentId;
	}
	
	/* this method set studentId of particular student */
	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}
	
	/* this method returns list Of Courses of particular student */
	public String[] getCourses()
	{
		return courses;
	}
	
	/* this method sets list Of Courses of particular student */
	public void setCourses(String[] courses)
	{
		this.courses = courses;
	}
	/* This method returns details of student in string representation */
	public String toString()
	{
		return super.toString()+", StudentId: "+studentId;
	}
}
