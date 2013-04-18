public class VehicleTest {

	public static void main(String[] args) {
		System.out.println("Vehicle Test");

		// compile time error if static final variable not initialized
		System.out.println(Vehicle.a_blank_final);

		// compile time error if non-static final variable not initialized
		Vehicle aVehicle = new Vehicle();
	}
}