import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainReservation {
	
	static int count = -1;

	public static void main(String[] args) {
		
		/* Initialization */
		PrintTicketClass printTicketClassObj = new PrintTicketClass();
		List<User> userList = new ArrayList<User>();
		TrainInfo trainInfoObj = new TrainInfo();
		
		/* method invoked to read passenger train info */
		trainInfoObj.readPassengerTrainInfo();
		
		/* method invoked to read goods train info */
		trainInfoObj.readGoodsTrainInfo();
		Scanner scan;
		try
		{
			scan = new Scanner(System.in);
			String userName, choice = "yes";
			String sourceStation = "", destinationStation = "";
			int trainType, countInput = 0, trainNo = 0, noOfSeats = 0;
			int result;
			double weight = 0.0;
			do
			{
				count++;
				/* Inputing details */
				System.out.println("Enter your name");
				userName = scan.next();
				System.out.println("Enter Train type:\n1. Passenger Train\n2. Goods Train\n");
				trainType = scan.nextInt();
				do
				{
					/* if train type == 1 i.e. user has selected passenger train */
					if(trainType == 1)
					{
						/* displaying list of passenger trains */
						System.out.println("Train No\tTrain Name\tSource\tDestination\tFare\tTime\tDuration\tAvailable Seats\n");
						for(PassengerTrain PassengerTrainObj : TrainInfo.passengerTrainList)
						{
							printTicketClassObj.printPassengerTrain(PassengerTrainObj);
						}
							
						System.out.println();
						do
						{
							/* Inputting source and destination */
							System.out.println("Enter Source Station: ");
							sourceStation = scan.next();
							System.out.println("Enter destination Station: ");
							destinationStation = scan.next();
							
							/* Displaying list of passenger trains for specified source and destination */
							System.out.println("Train Details: ");
							System.out.println("Train No\tTrain Name\tSource\tDestination\tFare\tTime\tDuration\tAvailable Seats\n");
							for(PassengerTrain PassengerTrainObj : TrainInfo.passengerTrainList)
							{
			
								if(PassengerTrainObj.getSource().equalsIgnoreCase(sourceStation) && PassengerTrainObj.getDestination().equalsIgnoreCase(destinationStation))
								{
									printTicketClassObj.printPassengerTrain(PassengerTrainObj);
									countInput++;
								}
							}
							System.out.println("Do you want to provide input with another source and destination(press 'y' or 'Y' for yes and any other key for No)");
							choice = scan.next();
						}
						while(choice.charAt(0) == 'y' || choice.charAt(0) == 'Y');
						if((choice.charAt(0) != 'y' || choice.charAt(0) != 'Y') && countInput == 0)
						{
							System.out.println("System Exit");
							System.exit(0);
						}
						
						/* Inputting train and seats details from user */
						System.out.println("Enter Train No in which you want to travel: ");
						trainNo = scan.nextInt();
						
						System.out.println("Enter no of Seats: ");
						noOfSeats = scan.nextInt();
						
						Reservation reservationObj = new Reservation();
						/* method invoked to check availability of train and seat*/
						result = reservationObj.checkAvailabilityPassengerTrain(trainNo, noOfSeats);
					}
					
					/* if train type == 2 i.e. user has selected goods train */
					else if(trainType == 2)
					{
						
						/* displaying list of goods trains */
						System.out.println("Train No\tTrain Name\tSource\tDestination\tFare\tTime\tDuration\tAvailable Weight(in tons)\n");
						for(GoodsTrain goodsTrainObj : TrainInfo.goodsTrainList)
						{
							printTicketClassObj.printGoodsTrain(goodsTrainObj);
						}
						System.out.println();
						do
						{
							/* Inputting source and destination */
							System.out.println("Enter Source Station: ");
							sourceStation = scan.next();
							System.out.println("Enter destination Station: ");
							destinationStation = scan.next();
							
							/* Displaying list of goods trains for specified source and destination */
							System.out.println("Train Details: ");
							System.out.println("Train No\tTrain Name\tSource\tDestination\tFare\tTime\tDuration\tAvailable Weight(in tons)\n");
							for(GoodsTrain goodsTrainObj : TrainInfo.goodsTrainList)
							{
								if(goodsTrainObj.getSource().equalsIgnoreCase(sourceStation) && goodsTrainObj.getDestination().equalsIgnoreCase(destinationStation))
								{
									printTicketClassObj.printGoodsTrain(goodsTrainObj);
									countInput++;
								}
							}
							System.out.println("Do you want to provide input with another source and destination(press 'y' or 'Y' for yes and any other key for No)");
							choice = scan.next();
						}
						while(choice.charAt(0) == 'y' || choice.charAt(0) == 'Y');
						if((choice.charAt(0) != 'y' || choice.charAt(0) != 'Y') && countInput == 0)
						{
							System.out.println("System Exit");
							System.exit(0);
							
						}
						
						/* Inputting train and weight details from user */
						System.out.println("Enter Train No in which you want to use for goods transport: ");
						trainNo = scan.nextInt();
						
						System.out.println("Enter weight of your goods: ");
						weight = scan.nextDouble();
						
						Reservation reservationObj = new Reservation();
						/* method invoked to check availability of train and weight*/
						result = reservationObj.checkAvailabilityGoodsTrain(trainNo, weight);
					}
					else
					{
						System.out.println("Please enter correct value");
						break;
					}
					
					/** Checking of result after reservation confirmation */
					
					/* this code will be executed if train is not available i.e. result is equal to -1 */
					if(result == -1)
					{
						System.out.println("Train no is not correct");
						System.out.println("Do you want to try booking in another train(press 'y' or 'Y' for yes and any other key for No)");
						/* choice of user for continue */
						choice = scan.next();
					}
					
					/* this code will be executed if seats are less than requirement i.e. result is equal to 1 */
					else if(result == 1)
					{
						System.out.println("Requirement is higher than availability");
						
						/* Showing list of trains with available seats more than or equal to requirement */
						if(trainType == 1)
						{
				
							System.out.println("Available trains on this route with required availability");
							System.out.println("Train No\tTrain Name\tSource\tDestination\tFare\tTime\tDuration\tAvailable Seats\n");
							for(PassengerTrain passengerTrainObj : TrainInfo.passengerTrainList)
							{
								if(passengerTrainObj.getSource().equalsIgnoreCase(sourceStation) && passengerTrainObj.getDestination().equalsIgnoreCase(destinationStation))
								{
									if(passengerTrainObj.getAvailableSeats() >= noOfSeats)
									{
										printTicketClassObj.printPassengerTrain(passengerTrainObj);
									}
								}
							}
						}
						/* Showing list of trains with available weight more than or equal to requirement */
						else
						{
							
							System.out.println("Available trains on this route with required availability");
							System.out.println("Train No\tTrain Name\tSource Station\tDestination Station\tFare\tTime\tDuration\tAvailable Weight(in tons)\n");
							for(GoodsTrain goodsTrainObj : TrainInfo.goodsTrainList)
							{
								if(goodsTrainObj.getSource().equalsIgnoreCase(sourceStation) && goodsTrainObj.getDestination().equalsIgnoreCase(destinationStation))
								{
									if(goodsTrainObj.getAvailableWeight() >= weight)
									{
										printTicketClassObj.printGoodsTrain(goodsTrainObj);
									}
								}
							}
						}
						System.out.println("Do you want to try booking in another train(press 'y' or 'Y' for yes and any other key for No)");
						choice = scan.next();
					}
					else if(result == 2)
					{
						/* this code will be executed if seats are available i.e. result is equal to 2 */
						int payChoice;
						System.out.println("Choose payment method:\n1. Credit Card\n2. Debit Card\n3. Wallet\n4. Net Banking");
						payChoice = scan.nextInt();
						
						/* payment processing on user's choice of payment type */
						do
						{					
							/* if choice is 1 then credit card payment */
							if(payChoice == 1)
							{
								System.out.println("Enter Credit card Number: ");
								scan.next();
								System.out.println("Enter cvv number: ");
								scan.nextInt();
								System.out.println("Enter Pin of card: ");
								scan.nextInt();
								System.out.println("Payment Confirmed");
								break;
							}
							
							/* if choice is 2 then debit card payment */
							else if(payChoice == 2)
							{
								System.out.println("Enter Credit card Number: ");
								scan.next();
								System.out.println("Enter cvv number: ");
								scan.nextInt();
								System.out.println("Enter Pin of card: ");
								scan.nextInt();
								System.out.println("Payment Confirmed");
								break;
							}
							
							/* if choice is 3 then wallet payment */
							else if(payChoice == 3)
							{
								System.out.println("Enter user name of wallet");
								scan.next();
								System.out.println("Enter password of wallet: ");
								scan.next();
								System.out.println("Payment Confirmed");
								break;
							}
							
							/* if choice is 4 then Net Banking payment */
							else if(payChoice == 4)
							{
								System.out.println("Enter Net banking ID: ");
								scan.next();
								System.out.println("Enter Net banking password: ");
								scan.next();
								System.out.println("Payment Confirmed");
								break;
							}
							
							/* otherwise */
							else
							{
								System.out.println("Enter correct Choice: ");
							}
							
						}
						
						/* this code will be executed after payment */
						while(true);
							String time = "";
							double amount = 0.0;
							
							/* ticket of passenger train */
							if(trainType == 1)
							{
								for(PassengerTrain passengerTrainObj : TrainInfo.passengerTrainList)
								{
									if(passengerTrainObj.getTrainNo() == trainNo)
									{
										amount = (passengerTrainObj.getFare()) * noOfSeats;
										time = passengerTrainObj.getTime();
										passengerTrainObj.setAvailableSeats(passengerTrainObj.getAvailableSeats() - noOfSeats);
									}
									
								} 
								
								/* userList is updated with ticket details */
								userList.add(new User(userName, trainNo, amount, time, noOfSeats));
								printTicketClassObj.printTicketPassenger(userList);
							}
							
							/* ticket of goods train */
							else if(trainType == 2)
							{
								for(GoodsTrain goodsTrainObj : TrainInfo.goodsTrainList)
								{
									if(goodsTrainObj.getTrainNo() == trainNo)
									{
										amount = (goodsTrainObj.getFare()) * weight;
										time = goodsTrainObj.getTime();
										goodsTrainObj.setAvailableWeight(goodsTrainObj.getAvailableWeight() - weight);
									}
									
								} 
								
								/* userList is updated with ticket details */
								userList.add(new User(userName, trainNo, amount, time, weight));
								printTicketClassObj.printTicketGoods(userList);
							}
							
							/* Printing train list with updated data */
							System.out.println("\n\nUpdated Train Chart is: \n");
							System.out.println("Train No\tTrain Name\tSource\tDestination\tFare\tTime\tDuration\tAvailable Seats\n");
							for(PassengerTrain passengerTrainObj : TrainInfo.passengerTrainList)
								printTicketClassObj.printPassengerTrain(passengerTrainObj);
							System.out.println();
							System.out.println("Train No\tTrain Name\tSource\tDestination\tFare\tTime\tDuration\tAvailable Weight\n");
							for(GoodsTrain goodsTrainObj : TrainInfo.goodsTrainList)
								printTicketClassObj.printGoodsTrain(goodsTrainObj);
						}
				}
				while(choice.charAt(0) == 'y' || choice.charAt(0) == 'Y');
				System.out.println("press 'y' for next ticket booking or press any other key to exit");
				choice = scan.next();
			}
			while(choice.charAt(0) == 'y' || choice.charAt(0) == 'Y');
			scan.close();
			System.out.println("System Exit");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
