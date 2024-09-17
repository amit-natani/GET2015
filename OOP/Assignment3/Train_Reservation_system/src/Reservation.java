
public class Reservation {

	/** This method check availability of Passenger train
	 * @param trainNo : Train Number
	 * @param noOfSeats : Number of seats user wants to book
	 * @return -1( if the train is not found in the list)
	 *  1( if available seats is less than the no of seats user wants to book )
	 *  2( if seats are available in train )
	 */
	public int checkAvailabilityPassengerTrain(int trainNo, int noOfSeats)
	{
		/*Initialize count with -1*/
		int count = -1;
		
		/* listLength will contain the size of list of passenger train */ 
		int listLength = TrainInfo.passengerTrainList.size();
		for(int i = 0; i < listLength; i++)
		{	 
			/* Checking if the train No that user has input is available or not */
			if(TrainInfo.passengerTrainList.get(i).getTrainNo() == trainNo)
			{
				count = i;
				break;
			}
		}
		
		/* if count is equal to -1 then return -1 that means the train that user wants is not found in the list */
		if(count == -1)
			return -1;
		/* if available seats is less than the no of seats user wants to book then return 1 */
		else if(TrainInfo.passengerTrainList.get(count).getAvailableSeats() < noOfSeats)
			return 1;
		/* If Train is available with proper No of seats */
		else
			return 2;
	}
	
	/** This method check availability of Goods train
	 * @param trainNo : Train Number
	 * @param noOfSeats : amount of weight user wants to book
	 * @return -1( if the train is not found in the list)
	 *  1( if available weight is less than the goods weight user wants to transfer)
	 *  2( if space is available in train for goods)
	 */
	public int checkAvailabilityGoodsTrain(int trainNo, double weight)
	{
		int count = -1;
		int listLength = TrainInfo.goodsTrainList.size();
		for(int i = 0; i < listLength; i++)
		{
			if(TrainInfo.goodsTrainList.get(i).getTrainNo() == trainNo)
			{
				count = i;
				break;
			}
		}
		/* if train that user wants is not found in the list then return -1*/
		if(count == -1)
			return -1;
		/* if available weight is less than the goods weight user wants to transfer then return 1 */
		else if(TrainInfo.goodsTrainList.get(count).getAvailableWeight() < weight)
			return 1;
		/* If Train is available with proper space for goods */
		else
			return 2;
	} 
}
