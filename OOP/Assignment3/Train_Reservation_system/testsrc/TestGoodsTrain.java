import static org.junit.Assert.*;

import org.junit.Test;


public class TestGoodsTrain {

	private double delta;

	/** Positive Test Case */
	@Test
	public void positiveTest() {
		
		GoodsTrain goodsTrainObj = new GoodsTrain("1", "goodsTrain1", "Pali", "Alwar", "300.0", "13", "23", "400.0");
		assertEquals(400.0, goodsTrainObj.getAvailableWeight(), delta);
		assertEquals(1, goodsTrainObj.getTrainNo());
		assertEquals("goodsTrain1", goodsTrainObj.getTrainName());
		assertEquals("Pali", goodsTrainObj.getSource());
		assertEquals("Alwar", goodsTrainObj.getDestination());
	}

	/** Negative Test Case */
	@Test
	public void negativeTest() {
		GoodsTrain goodsTrainObj = new GoodsTrain("1", "goodsTrain1", "Pali", "Alwar", "300.0", "13", "23", "400.0");
		assertEquals(450.0, goodsTrainObj.getAvailableWeight(), delta);
		assertEquals(2, goodsTrainObj.getTrainNo());
		assertEquals("GoodsTrain1", goodsTrainObj.getTrainName());
		assertEquals("Jaipur", goodsTrainObj.getSource());
		assertEquals("Ajmer", goodsTrainObj.getDestination());
	}
}
