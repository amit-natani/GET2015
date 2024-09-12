
/**
 * @author Amit
 *
 */
public class MainServiceStation {

	public static void main(String[] args) {
		
		/* Exception Handling */
		try
		{
			/* Initialization */
			ServiceStation serviceStationObj = new ServiceStation();
			
			/* Method invocation for getting details */
			serviceStationObj.readMechanics();	// method invoked to read Mechanic details from file
			serviceStationObj.readCars();		// method invoked to read Car details from file
			serviceStationObj.assignCars();		// method invoked to assign car to appropriate mechanic
			
			/* Printing Desired Details */
			
			System.out.println("the total income for the day is : " + serviceStationObj.getIncome() + "\n");
			System.out.println("the number of cars serviced today are : \n" + serviceStationObj.getCarsServiced());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}