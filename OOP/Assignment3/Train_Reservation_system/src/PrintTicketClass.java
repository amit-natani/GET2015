import java.util.List;

/** This class is responsible to print the details of trains */
public class PrintTicketClass {
	
	/** This method prints the ticket of user. 
	 * The ticket will have User Name, Train No, No of booked Seats, Paid Amount and Time of train
	 * Internally this method calls printBasicUser() method to print basic details of User and 
	 * itself prints only booked seats 
	 * @param userList : List of objects of user class, generally contains one object
	 */
	public void printTicketPassenger(List<User> userList)
	{
		System.out.println("Your Ticket Details are: \n");
		System.out.println("User Name\tTrain No\tPaid Amount\tTime\tNo Of Seats");
		printBasicUser(userList, MainReservation.count);
		System.out.print(userList.get(MainReservation.count).getNoOfSeats()+"\t\t");
		System.out.println();
	}
	
	/** This method prints the ticket of user. 
	 * The ticket will have User Name, Train No, Alloted weight, Paid Amount and Time of train
	 * Internally this method calls printBasicUser() method to print basic details of User and 
	 * itself prints only alloted weight
	 * @param userList : List of objects of user class, generally contains one object
	 */
	public void printTicketGoods(List<User> userList)
	{
		System.out.println("Ticket Details are: \n");
		System.out.println("User Name\tTrain No\tPaid Amount\tTime\tWeight Alloted");
		printBasicUser(userList, MainReservation.count);
		System.out.print(userList.get(MainReservation.count).getWeight()+"\t\t");
		System.out.println();
	}
	
	/** This method prints the list of passenger train. 
	 * @param count : index of the train in the list, whose details are to be printed
	 */
	public void printPassengerTrain(int count)
	{
		System.out.print(TrainInfo.passengerTrainList.get(count).getTrainNo()+"\t\t");
		System.out.print(TrainInfo.passengerTrainList.get(count).getTrainName()+"\t");
		System.out.print(TrainInfo.passengerTrainList.get(count).getSource()+"\t");
		System.out.print(TrainInfo.passengerTrainList.get(count).getDestination()+"\t\t");
		System.out.print(TrainInfo.passengerTrainList.get(count).getFare()+"\t");
		System.out.print(TrainInfo.passengerTrainList.get(count).getTime()+"\t");
		System.out.print(TrainInfo.passengerTrainList.get(count).getDuration()+"\t\t");
		System.out.print(TrainInfo.passengerTrainList.get(count).getAvailableSeats());
		System.out.println();
	}
	
	/** This method prints the list of Goods train. 
	 * @param count : index of the train in the list, whose details are to be printed
	 */
	public void printGoodsTrain(int count)
	{
		System.out.print(TrainInfo.goodsTrainList.get(count).getTrainNo()+"\t\t");
		System.out.print(TrainInfo.goodsTrainList.get(count).getTrainName()+"\t");
		System.out.print(TrainInfo.goodsTrainList.get(count).getSource()+"\t");
		System.out.print(TrainInfo.goodsTrainList.get(count).getDestination()+"\t\t");
		System.out.print(TrainInfo.goodsTrainList.get(count).getFare()+"\t");
		System.out.print(TrainInfo.goodsTrainList.get(count).getTime()+"\t");
		System.out.print(TrainInfo.goodsTrainList.get(count).getDuration()+"\t\t");
		System.out.print(TrainInfo.goodsTrainList.get(count).getAvailableWeight());
		System.out.println();
	}
	
	/** This method prints the basic details of the User. 
	 * @param count : index of the User in the list, whose details are to be printed
	 */
	private void printBasicUser(List<User> userList, int count)
	{
		System.out.print(userList.get(count).getUserName()+"\t\t");
		System.out.print(userList.get(count).getTrainNo()+"\t\t");
		System.out.print(userList.get(count).getAmount()+"\t\t");
		System.out.print(userList.get(count).getTime()+"\t\t");
	}
}



