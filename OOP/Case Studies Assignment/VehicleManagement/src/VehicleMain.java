import com.metacampus.vehiclemanagement.helper.VehicleHelper;
import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.printer.VehicleDetailPrinter;


public class VehicleMain {

	public static void main(String[] args) {
		
		/* Car object creation */
		Car carObj = VehicleHelper.create("Hyundai", "Verna", "1200 CC", "60 Liters", "21 km/pl", 900000, 78000, "YES", "YES", "YES");
		System.out.println( VehicleDetailPrinter.printVehicleSpecification(carObj));
		System.out.println( "On road Price : "+VehicleDetailPrinter.printOnRoadPrice(carObj)+"\n");
		
		/* Bike object creation */
		Bike bikeObj = VehicleHelper.create("TVS", "Apache", "180 CC", "14 Liters", "40 km/pl", 80000, 7800, "YES", 1000);
		System.out.println( VehicleDetailPrinter.printVehicleSpecification(bikeObj));
		System.out.println( "On road Price : "+VehicleDetailPrinter.printOnRoadPrice(bikeObj)+"\n");

	}

}

