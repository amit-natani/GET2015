import static org.junit.Assert.*;

import org.junit.Test;


public class TestPassengerTrain {

	@Test
	public void positiveTest() {
		
		PassengerTrain PassengerTrainObj = new PassengerTrain("1", "PassengerTrain1", "Ajmer", "Alwar", "300.0", "13", "23", "500");
		assertEquals(500, PassengerTrainObj.getAvailableSeats());
		assertEquals(1, PassengerTrainObj.getTrainNo());
		assertEquals("PassengerTrain1", PassengerTrainObj.getTrainName());
		assertEquals("Ajmer", PassengerTrainObj.getSource());
		assertEquals("Alwar", PassengerTrainObj.getDestination());
	}
	
	@Test
	public void negativeTest() {
		
		PassengerTrain PassengerTrainObj = new PassengerTrain("1", "PassengerTrain1", "Ajmer", "Alwar", "300.0", "13", "23", "500");
		assertEquals(600, PassengerTrainObj.getAvailableSeats());
		assertEquals(3, PassengerTrainObj.getTrainNo());
		assertEquals("PassengerTrain2", PassengerTrainObj.getTrainName());
		assertEquals("Kota", PassengerTrainObj.getSource());
		assertEquals("Sikar", PassengerTrainObj.getDestination());
	}
}
