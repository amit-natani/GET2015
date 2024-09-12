
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
	final String MECHANICFILE = "E:\\Mechanics.txt";
	final String CARFILE = "E:\\Cars.txt";

	private List<Mechanic> mechanicsList = new ArrayList<Mechanic>();						// List of Mechanics
	private List<Cars> carList = new ArrayList<Cars>();										// List of cars
	
	private HashMap<String, String> allotmentList = new HashMap<String, String>();			// CarNumber,Mechanic
	private HashMap<String, Integer> carsServiced = new HashMap<String, Integer>(); 	// summary for processing of total number of cars
	
	private int totalIncome = 0;

	public void readMechanics(){
		BufferedReader br;
		try{
			br = new BufferedReader(new FileReader(MECHANICFILE));
			String line;
			while ((line = br.readLine()) != null){
			String[] mechDetails = line.split(",");							// Reading up details line by line
			// setting up mechanic object and storing it in mechanic list
			if (mechDetails.length == 4) 									// if details are less or line is whitespace
				mechanicsList.add(new Mechanic(mechDetails[0].trim(), mechDetails[1].trim(), mechDetails[2].trim(), mechDetails[3].trim()));

			}
		}
		catch (Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	public void readCars(){
		BufferedReader br;
		try{
			br = new BufferedReader(new FileReader(CARFILE));
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null){
			String[] carDetails = sCurrentLine.split(",");									// Reading up details line by line																			// setting up car object and storing it in Cars list
			if (carDetails.length == 2) 													// if in case details are less or line is whitespace
				carList.add(new Cars(carDetails[0].trim(), carDetails[1].trim()));
			}
		}
		catch (Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public void assignCars(){ 					// method to assign cars to mechanics base don the specialization of the mechanic
		try
		{
			for (Cars car : carList){
				for (Mechanic mech : mechanicsList){
					if (mech.isAvailable() && mech.speciality.equals(car.type)){
						allotmentList.put(car.carId, mech.mechId);
						mech.flag = false;
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

	public int getIncome(){
		return totalIncome;
	}

	public HashMap<String, Integer> getCarsServiced(){
		return carsServiced;
	}
}
