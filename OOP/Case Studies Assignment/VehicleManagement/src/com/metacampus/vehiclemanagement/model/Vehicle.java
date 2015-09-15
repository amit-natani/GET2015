package com.metacampus.vehiclemanagement.model;

public class Vehicle {

	/* Data Members */
	private String make;
	private String model;
	private String engineCC;
	private String fuelCapacity;
	private String mileage;
	
	/** Method to set Fuel capacity of vehicle
	 * 
	 * @param fuelCapacity
	 */
	public void setFuelCapacity(String fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	
	/** Method to set Mileage of vehicle 
	 * @param mileage
	 */
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	
	/** Method to get company name of a vehicle 
	 * 
	 * @return make : company of vehicle
	 */
	public String getMake() {
		return make;
	}
	
	/** Method to set company name of a vehicle
	 * 
	 * @param make : comapny name of vehicle
	 */
	public void setMake(String make) {
		this.make = make;
	}
	
	/** Method to return model of a vehicle
	 * 
	 * @return model : model name
	 */
	public String getModel() {
		return model;
	}
	
	/** Method to set model of a vehicle
	 * 
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	/** Method to get Engine CC of a vehicle
	 * 
	 * @return engineCC
	 */
	public String getEngineCC() {
		return engineCC;
	}
	
	/** Method to set Engine CC of a vehicle
	 * 
	 * @param engineCC
	 */
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	
	/** Method to get fuel Capacity of a vehicle
	 * 
	 * @return fuelCapacity
	 */
	public String getFuelCapacity() {
		return fuelCapacity;
	}
	
	/** Method to get mileage of a vehicle
	 * 
	 * @return mileage
	 */
	public String getMileage() {
		return mileage;
	}
	
	/** this method returns basic details of a vehicle	*/
	public String toString() {
		return "Make: "+getMake()+",Model: "+getModel()+
				",Engine CC: "+getEngineCC()+
				",Fuel Capacity: "+getFuelCapacity()+
				",Mileage: "+getMileage();
	}
}