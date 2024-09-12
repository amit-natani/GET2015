/**
 * 
 */

/**
 * @author Amit
 *
 */
public class User {
	
	private String userName;
	private int trainNo;
	private int noOfSeats;
	private double amount;
	private String time;
	private double weight;
	
	/** Parameterized constructor 
	 * @param userName : Name of User
	 * @param trainNo :  Train No in which user has booked ticket
	 * @param amount : Amount paid by the user
	 * @param time : Time of train 
	 */
	public User(String userName, int trainNo, double amount, String time)
	{
		this.userName = userName;
		this.trainNo = trainNo;
		this.amount = amount;
		this.time = time;
	}
	/** Parameterized constructor. 
	 * First four parameters of this constructor are passed to another constructor using this calling
	 * @param userName : Name of User
	 * @param trainNo :  Train No in which user has booked ticket
	 * @param amount : Amount paid by the user
	 * @param time : Time of train 
	 * @param noOfSeats : Number of Seats booked by the user
	 * 
	 */
	public User(String userName, int trainNo, double amount, String time, int noOfSeats)
	{
		this(userName, trainNo, amount, time);
		this.noOfSeats = noOfSeats;
	}
	
	/** Parameterized constructor. 
	 * First four parameters of this constructor are passed to another constructor using this calling
	 * @param userName : Name of User
	 * @param trainNo :  Train No in which user has booked ticket
	 * @param amount : Amount paid by the user
	 * @param time : Time of train 
	 * @param weight : weight alloted to user
	 * 
	 */
	public User(String userName, int trainNo, double amount, String time, double weight)
	{
		this(userName, trainNo, amount, time);
		this.weight = weight;
	}
	
	/** Method to set the userName of User 
	 * 
	 * @param userName :  Name of User
	 */
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	/** Method to set the train No booked by User 
	 * 
	 * @param trainNo :  Train Number
	 */
	public void setTrainNo(int trainNo)
	{
		this.trainNo = trainNo;
	}
	
	/** Method to set number of seats booked by User 
	 * 
	 * @param noOfSeats :  Number of seats
	 */
	public void setNoOfSeats(int noOfSeats)
	{
		this.noOfSeats = noOfSeats;
	}
	
	/** Method to set amount paid by User 
	 * 
	 * @param amount :  Amount paid for ticket
	 */
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	
	/** Method to set time of train in which user has booked seats 
	 * 
	 * @param time : Time of train
	 */
	public void setTime(String time)
	{
		this.time = time;
	}
	
	/** Method to set weight alloted to user in Goods Train 
	 * 
	 * @param weight : New alloted Weight
	 */
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	/** Method to get Name of user 
	 * 
	 *@return userName : Name of user
	 */
	public String getUserName()
	{
		return this.userName;
	}
	
	/** Method to get Train No in which user has booked seats
	 * 
	 *@return trainNo : Train Number
	 */
	public int getTrainNo()
	{
		return this.trainNo;
	}
	
	/** Method to get number of seats booked by user
	 * 
	 *@return noOfSeats : Number of seats booked by user
	 */
	public int getNoOfSeats()
	{
		return this.noOfSeats;
	}
	
	/** Method to get Amount paid by user
	 * 
	 *@return amount : Amount paid by user
	 */
	public double getAmount()
	{
		return this.amount;
	}
	
	/** Method to get time of train in which user has booked ticket
	 * 
	 *@return time : Time of Train
	 */
	public String getTime()
	{
		return this.time;
	}
	
	/** Method to get weight alloted to user in goods train
	 * 
	 *@return weight : Weight alloted to user
	 */
	public double getWeight()
	{
		return this.weight;
	}
}
