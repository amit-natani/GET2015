package com.metacampus.vehiclemanagement;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.metacampus.vehiclemanagement.helper.VehicleHelper;
import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;

public class VehicleHelperTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testCreateCar() {
		Car car = VehicleHelper.create("Hyundai", "Verna", "1200 CC", "60 Liters", "21 km/pl", 2, 5);
		assertEquals("Hyundai", car.getMake());
	}

	@Test 
	public void testCreateCarNullTest() {
		Car car = VehicleHelper.create("Hyundai", "Verna", "1200 CC", "60 Liters", "21 km/pl", 2, 5);
		assertNotNull(car);
	}
	
	@Test
	public void testCreateBike() {
		Bike bike = VehicleHelper.create("TVS", "Apache", "180 CC", "14 Liters", "40 km/pl", 5, "Stepped");
		assertEquals("180 CC",  bike.getEngineCC());
	}
	
	@Test
	public void testCreateBikeNullTest() {
		Bike bike = VehicleHelper.create("TVS", "Apache", "180 CC", "14 Liters", "40 km/pl", 5, "Stepped");
		assertNotNull(bike);
	}

}

