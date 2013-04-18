public class Vehicle {

	public double currentSpeed;
	public double currentDirection;
	public String ownerName;

	private static long nextID = 0;
	public long idNum;

	public static final int a_blank_final = 42;

	// constant variable
	public final int foo = 3;


	public Vehicle() {
		idNum = nextID++;
	}

	public Vehicle(String ownerName) {
		this();
		this.ownerName = ownerName;
	}

	public static void main(String[] args) {
		System.out.println("test vehicle class");

		Vehicle v1 = new Vehicle("John");

		Vehicle v2 = new Vehicle("Richard");

		System.out.println("v1 id: " + v1.idNum);
		System.out.println("v1 owner: " + v1.ownerName);

		System.out.println("v2 id: " + v2.idNum);
		System.out.println("v2 owner: " + v2.ownerName);

	}

}