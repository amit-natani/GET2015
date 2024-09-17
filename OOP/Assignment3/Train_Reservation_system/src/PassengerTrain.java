
public class PassengerTrain extends Train {

	private int availableSeats;

	 /** parameterized Constructor
	  * @param trainNo - Number of Train
	  *	@param trainName - Name of Train
	  * @param source - Source Station
	  * @param destination - DeatinationStation
	  * @param fare - fare of one ticket in that train for 1 ton
	  * @param time - departure time of that train
	  * @param duration - traveling time of that train
	  *	@param availableSeats = currently Available seats in particular Passenger train
	  *  */
	public PassengerTrain(String trainNo, String trainName, String source,
			String destination, String fare, String time, String duration, String availableSeats) {
		super(trainNo, trainName, source, destination, fare, time, duration);	
		this.availableSeats = Integer.parseInt(availableSeats);
	}
	
	/** Method to set available seats on a Passenger train 
	 *@param availableWeight : new available seats on Passenger train 
	 */
	public void setAvailableSeats(int availableSeats)
	{
		this.availableSeats = availableSeats;
	}
	
	/** Method to get available seats of a Passenger train 
	 *@param availableWeight : currently available seats on Passenger train 
	 */
	public int getAvailableSeats()
	{
		return this.availableSeats;
	}

}
