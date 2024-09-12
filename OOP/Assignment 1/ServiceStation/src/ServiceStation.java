
/**
 * 
 */

/**
 * @author Amit
 *
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ServiceStation
{
	/** List Of Mechanics */
	private List<Mechanic> mechanicsList = new ArrayList<Mechanic>();	
	/** List of cars*/
	private List<Cars> carList = new ArrayList<Cars>();						
	
	private HashMap<String, String> allotmentList = new HashMap<String, String>();		// CarNumber, Mechanic
	private HashMap<String, Integer> carsServiced = new HashMap<String, Integer>(); 	// summary for processing of total number of cars
	
	private int totalIncome = 0;

	/** This method reads the list of mechanics from the file
	 * using BufferedReader class is used to read data from
	 * the file. for each line of file an object of Mechanic class is created
	 * and the details of mechanics is added to the list of mechanics
	 */
	public void readMechanics(){
		BufferedReader bufferedReaderObj;
		try{
			bufferedReaderObj = new BufferedReader(new FileReader(Constants.MECHANICFILE));
			String line;
			/* Reading line by line details of mechanics */
			while ((line = bufferedReaderObj.readLine()) != null){
			String[] mechDetails = line.split(",");							
																		
			if (mechDetails.length == 4) 	
				/* Adding details of mechanic to Mechanic object and add that object to mechniac list */
				mechanicsList.add(new Mechanic(mechDetails[0].trim(), mechDetails[1].trim(), mechDetails[2].trim(), mechDetails[3].trim()));

			}
		}
		catch (Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	/** This method reads the list of cars from the file
	 * using BufferedReader class is used to read data from
	 * the file. For each line of file an object of Cars class is created
	 * and the details of cars is added to the list of cars
	 */
	public void readCars(){
		BufferedReader bufferedReaderObj;
		try{
			bufferedReaderObj = new BufferedReader(new FileReader(Constants.CARFILE));
			String sCurrentLine;
			
			/* Reading line by line details of cars */
			while ((sCurrentLine = bufferedReaderObj.readLine()) != null){
			String[] carDetails = sCurrentLine.split(",");			
			if (carDetails.length == 2)
				/* Adding details of car to car object and add that object to car list */
				carList.add(new Cars(carDetails[0].trim(), carDetails[1].trim()));
			}
		}
		catch (Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	/** This method assigns cars to appropriate mechanic 
	 * i.e if mechanic is available and the specialization of mechanic is equal to specialization of car
	 * then the car is assigned to the mechanic, otherwise the car is discarded. 
	 */
	public void assignCars(){ 					
		try
		{	/* Traversing each car using foreach loop */
			for (Cars car : carList){
				/* Traversing each mechanic using foreach loop */
				for (Mechanic mech : mechanicsList){
					
					if (mech.isAvailable() && mech.speciality.equals(car.type)){
						allotmentList.put(car.carId, mech.mechId);
						mech.flag = false;	// setting availability of mechanic to false
						
						/* Computing total income */
						totalIncome += Integer.parseInt(mech.charge);
						
						if (carsServiced.containsKey(car.type))
							carsServiced.replace(car.type, carsServiced.get(car.type), carsServiced.get(car.type) + 1);
						else
							carsServiced.put(car.type, 1);
						break;
					}
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	/** This method returns total income of Service Station on a particular Day
	 *@return totalIncome : Income on a particular Day
	 */
	public int getIncome(){
		return totalIncome;
	}
	
	/** This method returns Mapping of CarType with no of cars of that type serviced 
	 * @return carServiced : HashMap of CarType with no of cars of that type serviced
	 */
	public HashMap<String, Integer> getCarsServiced(){
		return carsServiced;
	}
}
