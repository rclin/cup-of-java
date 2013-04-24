class PassengerVehicle extends Vehicle {

	private int seatsAvailable;
	private int seatsOccupied;

	public PassengerVehicle(String ownerName) {
		super(ownerName);
		seatsAvailable = 5;
		seatsOccupied = 0;
	}

	public String toString() {
		String desc = super.toString();
		desc += "available: " + seatsAvailable;
		desc += ", seatsOccupied " + seatsOccupied;
		return desc;
	}

	public static void main(String[] args) {
		System.out.println("PassengerVehicle Test");

		PassengerVehicle veh = new PassengerVehicle("Greg");
		System.out.println(veh);
	}

}