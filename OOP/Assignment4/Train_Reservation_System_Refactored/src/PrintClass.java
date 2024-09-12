import java.util.List;

/** This class is responsible to print the details of trains */
public class PrintClass {
	
	/** This method prints the ticket of user. 
	 * The ticket will have User Name, Train No, No of booked Seats, Paid Amount and Time of train
	 * Internally this method calls printBasicuser() method to print basic details of User and 
	 * itself prints only booked seats 
	 * @param userList : List of objects of user class, generally contains one object
	 */
	public void printTicketPassenger(List<User> userList, int count)
	{
		System.out.println("Your Ticket Details are: \n");
		System.out.println("User Name\tTrain No\tPaid Amount\tTime\tNo Of Seats");
		printBasicUser(userList, count);
		System.out.print(userList.get(count).getNoOfSeats()+"\t\t");
		System.out.println();
	}
	
	/** This method prints the ticket of user. 
	 * The ticket will have User Name, Train No, Alloted weight, Paid Amount and Time of train
	 * Internally this method calls printBasicuser() method to print basic details of User and 
	 * itself prints only alloted weight
	 * @param userList : List of objects of user class, generally contains one object
	 */
	public void printTicketGoods(List<User> userList, int count)
	{
		System.out.println("Ticket Details are: \n");
		System.out.println("User Name\tTrain No\tPaid Amount\tTime\tWeight Alloted");
		printBasicUser(userList, count);
		System.out.print(userList.get(count).getWeight()+"\t\t");
		System.out.println();
	}
	
	/** This method prints the list of passenger train. 
	 * @param passengerTrainObj : Object of PassengerTrain class whose details has to be printed
	 */
	public void printPassengerTrain(PassengerTrain passengerTrainObj)
	{
		System.out.print(passengerTrainObj.getTrainNo()+"\t\t");
		System.out.print(passengerTrainObj.getTrainName()+"\t");
		System.out.print(passengerTrainObj.getSource()+"\t");
		System.out.print(passengerTrainObj.getDestination()+"\t\t");
		System.out.print(passengerTrainObj.getFare()+"\t");
		System.out.print(passengerTrainObj.getTime()+"\t");
		System.out.print(passengerTrainObj.getDuration()+"\t\t");
		System.out.print(passengerTrainObj.getAvailableSeats());
		System.out.println();
	}
	
	/** This method prints the list of passenger train. 
	 * @param goodsTrainObj : Object of GoodsTrain class whose details has to be printed
	 */
	public void printGoodsTrain(GoodsTrain goodsTrainObj)
	{
		System.out.print(goodsTrainObj.getTrainNo()+"\t\t");
		System.out.print(goodsTrainObj.getTrainName()+"\t");
		System.out.print(goodsTrainObj.getSource()+"\t");
		System.out.print(goodsTrainObj.getDestination()+"\t\t");
		System.out.print(goodsTrainObj.getFare()+"\t");
		System.out.print(goodsTrainObj.getTime()+"\t");
		System.out.print(goodsTrainObj.getDuration()+"\t\t");
		System.out.print(goodsTrainObj.getAvailableWeight());
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

