/**
 * 
 */

/**
 * @author Amit
 *
 */

public class Mechanic {
	
	String name;
	String mechId;
	String speciality;
	String charge;
	boolean flag = true;
		
	/** Parameterized constructor 
	 * @param name : Name of Mechanic
	 * @param mechId : ID of Mechanic
	 * @param speciality : Speciality of mechanic
	 * @param charge : Mechanic Charge to service a car
	 */
	public Mechanic(String name, String mechId, String speciality, String charge){	
		this.name = name;
		this.mechId = mechId;
		this.speciality = speciality;
		this.charge = charge;
	}
	
	/** method for checking the availability of mechanic
	 * @return flag : true if the mechanic is available, false otherwise 
	  */
	boolean isAvailable(){
		return flag;
	}
	
}
