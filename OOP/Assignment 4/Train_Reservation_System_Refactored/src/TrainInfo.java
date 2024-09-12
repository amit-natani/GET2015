import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class TrainInfo
{
	/** List of Passenger Trains */
	public static List<PassengerTrain> passengerTrainList = new ArrayList<PassengerTrain>();
	
	/** List of Goods Trains */
	public static List<GoodsTrain> goodsTrainList = new ArrayList<GoodsTrain>();
	
	/** This method will read passenger train details from file and
	 * stores them in object of PassengerTrain class and that object is stored in
	 * passengerTrainList 
	 */
	public void readPassengerTrainInfo()
	{
		/* Initialization */
		BufferedReader bufferedReaderObj;
		try
		{
			bufferedReaderObj = new BufferedReader(new FileReader(Constants.PASSENGERTRAINFILE));
			String line;
			/* Reading line by line details of Passenger Trains */
			while((line = bufferedReaderObj.readLine()) != null)
			{
				String[] trainDetails = line.split(",");
				/* Adding details of Passenger Trains to PassengerTrain object and add that object to passenger train list */
				if(trainDetails.length == 8)
				{
					passengerTrainList.add(new PassengerTrain(trainDetails[0].trim(), trainDetails[1].trim(), trainDetails[2].trim(), trainDetails[3].trim(), trainDetails[4].trim(), trainDetails[5].trim(), trainDetails[6].trim(), trainDetails[7].trim()));
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	/** This method will read Goods train details from file and
	 * stores them in object of GoodsTrain class and that object is stored in
	 * goodsTrainList 
	 */
	public void readGoodsTrainInfo()
	{
		BufferedReader bufferedReaderObj;
		try
		{
			bufferedReaderObj = new BufferedReader(new FileReader(Constants.GOODSTRAINFILE));
			String line;
			/* Reading line by line details of Passenger Trains */
			while((line = bufferedReaderObj.readLine()) != null)
			{
				String[] trainDetails = line.split(",");
				/* Adding details of Passenger Trains to PassengerTrain object and add that object to passenger train list */
				if(trainDetails.length == 8)
				{
					goodsTrainList.add(new GoodsTrain(trainDetails[0].trim(), trainDetails[1].trim(), trainDetails[2].trim(), trainDetails[3].trim(), trainDetails[4].trim(), trainDetails[5].trim(), trainDetails[6].trim(), trainDetails[7].trim()));
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}