public class Vehicle {

	public double currentSpeed;
	public double currentDirection;
	public String ownerName;

	private static long nextID = 0;
	public long idNum;

	public static final int a_blank_final = 42;

	// constant variable
	public final int foo = 3;

	private EnergySource energySrc;


	public Vehicle() {
		idNum = nextID++;
	}

	public Vehicle(String ownerName) {
		this();
		this.ownerName = ownerName;
	}

	public Vehicle(String ownerName, EnergySource src) {
		this(ownerName);
		this.energySrc = src;
	}

	public void start() {
		if (energySrc.empty() == true) {
			System.out.println("Can't start since energy src is empty");
		} else {
			System.out.println("Started");
		}
	}

	public static void main(String[] args) {
		System.out.println("test vehicle class");

		Vehicle v1 = new Vehicle("John");

		Vehicle v2 = new Vehicle("Richard");

		System.out.println("v1 id: " + v1.idNum);
		System.out.println("v1 owner: " + v1.ownerName);

		System.out.println("v2 id: " + v2.idNum);
		System.out.println("v2 owner: " + v2.ownerName);

		System.out.println("next ID: " + Vehicle.getNextID());
		System.out.println(v1);
		System.out.println(v2);
		
		changeName(v2);
		System.out.println(v2);

		thisDoesNotChangeName(v2);
		System.out.println(v2);
		
		for (int i = 0; i < args.length; i++) {
			Vehicle veh = new Vehicle(args[i]);
			System.out.println(veh);
		}

		// test energy src
		Vehicle v3 = new Vehicle ("Greg", new Battery());
		v3.start();

		Vehicle v4 = new Vehicle ("Judy", new GasTank());
		v4.start();

	}
	
	public static long getNextID() {
		return nextID;
	}
	
	public String toString() {
		String desc = idNum + " (" + ownerName + ")";
		return desc;
	}

	public static void changeName(Vehicle veh) {
		veh.ownerName = "Gary";
	}
	
	public static void thisDoesNotChangeName(Vehicle veh) {
		veh = new Vehicle();
		veh.ownerName = "Mo";
	}
		
}