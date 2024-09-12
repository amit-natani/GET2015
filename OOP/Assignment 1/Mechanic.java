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
		
	/* Parameterized constructor */
	public Mechanic(String name, String mechId, String speciality, String charge){	
		this.name = name;
		this.mechId = mechId;
		this.speciality = speciality;
		this.charge = charge;
	}
	
	/* method for checking the availability of mechanic */
	boolean isAvailable(){
		return flag;
	}
	
}
