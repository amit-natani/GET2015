
/**
 * @author Amit
 *
 */
public class Person {
	private int uid;
	private String name;
	
	/** parameterized constructor
	 * @param uid: UID of person
	 * @param name : Name of Person 
	 */
	public Person(int uid, String name)
	{
		this.uid = uid;
		this.name = name;
	}
	/** method to get UID from a person object
	 * @return uid: UID of Person 
	 */
	public int getUid()
	{
		return uid;
	}
	
	/** method to set UID in a person object
	 * @param uid : UID of Person
	 */
	public void setUid(int uid)
	{
		this.uid = uid;
	}
	
	/** method to get name from a person object
	 * @return name: Name of Person */
	public String getName()
	{
		return name;
	}
	
	/** method to set name in a person object
	 * @param name : Name of Person
	 */
	public void setName(String name)
	{
		this.name =name;
	}
	 /** method to return details of a person in string representation
	  *@return String representation of Person details 
	   */
	public String toString()
	{
		return "Name: "+name+", uid: "+uid;
	}

}
