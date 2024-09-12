
/**
 * @author Amit
 *
 */
public class Person {
	private int uid;
	private String name;
	
	/* parameterized constructor */
	public Person(int uid, String name)
	{
		this.uid = uid;
		this.name = name;
	}
	/* method to get UID from a person object */
	public int getUid()
	{
		return uid;
	}
	
	/* method to set UID in a person object */
	public void setUid(int uid)
	{
		this.uid = uid;
	}
	
	/* method to get Name from a person object */
	public String getName()
	{
		return name;
	}
	
	/* method to set Name in a person object */
	public void setName(String name)
	{
		this.name =name;
	}
	 /* method to return details of a person in string representation */
	public String toString()
	{
		return "Name: "+name+", uid: "+uid;
	}

}
