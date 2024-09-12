
public class Train {
	private int trainNo;
	private String trainName;
	private String source;
	private String destination;
	private double fare;
	private String time;
	private double duration;
	
	 /** parameterized Constructor
	  * @param trainNo - Number of Train
	  *	@param trainName - Name of Train
	  * @param source - Source Station
	  * @param destination - DeatinationStation
	  * @param fare - fare of one ticket in that train for 1 ton
	  * @param time - departure time of that train
	  * @param duration - traveling time of that train
	  *  */
	public Train(String trainNo, String trainName, String source, String destination, String fare, String time, String duration)
	{
		this.trainNo = Integer.parseInt(trainNo);
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.fare = Double.parseDouble(fare);
		this.time = time;
		this.duration = Double.parseDouble(duration);
	}
	
	/** Method to set Train number of a particular train 
	 *@param trainNo : new Train No that we want to assign to a particular train
	 */
	public void setTrainNo(int trainNo)
	{
		this.trainNo = trainNo;
	}
	
	/** Method to set name of a particular train 
	 *@param trainName : New name that we want to assign to a particular train
	 */
	public void setName(String trainName)
	{
		this.trainName = trainName;
	}
	
	/** Method to set source station of a particular train 
	 *@param source : New source station that we want to assign to a particular train
	 */
	public void setSource(String source)
	{
		this.source = source;
	}
	
	/** Method to set destination station of a particular train 
	 *@param destination : New destination station that we want to assign to a particular train
	 */
	public void setDestination(String destination)
	{
		this.destination = destination;
	}
	
	/** Method to set time of a particular train 
	 *@param time : New time that we want to assign to a particular train
	 */
	public void setTime(String time)
	{
		this.time = time;
	}
	
	/** Method to set fare of a particular train 
	 *@param fare : New fare that we want to assign to a particular train
	 */
	public void setFare(double fare)
	{
		this.fare = fare;
	}
	
	/** Method to set duration of a particular train 
	 *@param duration : New duration that we want to assign to a particular train
	 */
	public void setDuration(double duration)
	{
		this.duration = duration;
	}
	
	/** Method to get train number of a particular train 
	 *@return trainNo : train No
	 */
	public int getTrainNo()
	{
		return this.trainNo;
	}
	
	/** Method to get name of a particular train 
	 *@return trainName : Name of Train
	 */
	public String getTrainName()
	{
		return this.trainName;
	}
	
	/** Method to get Source Station of a particular train 
	 *@return source : Source Station of Train
	 */
	public String getSource()
	{
		return this.source;
	}
	
	/** Method to get Destination Station of a particular train 
	 *@return destination : Destination station of Train
	 */
	public String getDestination()
	{
		return this.destination;
	}
	
	/** Method to get time of a particular train 
	 *@return time : Time of Train
	 */
	public String getTime()
	{
		return this.time;
	}
	
	/** Method to get duration of a particular train 
	 *@return duration : Duration of Train
	 */
	public double getDuration()
	{
		return this.duration;
	}
	
	/** Method to get Fare of a particular train 
	 *@return fare : Fare of Train
	 */
	public double getFare()
	{
		return this.fare;
	}
}
