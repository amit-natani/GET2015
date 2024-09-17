
public class GoodsTrain extends Train {
	
	private double availableWeight;
	
	 /** parameterized Constructor
	  * @param trainNo - Number of Train
	  *	@param trainName - Name of Train
	  * @param source - Source Station
	  * @param destination - DeatinationStation
	  * @param fare - fare of one ticket in that train for 1 ton
	  * @param time - departure time of that train
	  * @param duration - traveling time of that train
	  *	@param availableWeight = currently Available weight in particular Goods train
	  *  */
	public GoodsTrain(String trainNo, String trainName, String source, String destination, String fare, String time, String duration, String availableWeight) {
		super(trainNo, trainName, source, destination, fare, time, duration);
		this.availableWeight = Double.parseDouble(availableWeight);
	}
	
	/** Method to set available weight on a Goods train 
	 *@param availableWeight : new available weight on Goods train 
	 */
	public void setAvailableWeight(double availableWeight)
	{
		this.availableWeight = availableWeight;
	}
	
	/**  Method to get available weight of a Goods train 
	 *@return availableWeight : Currently available weight on Goods train
	 */
	public double getAvailableWeight()
	{
		return this.availableWeight;
	}
}
