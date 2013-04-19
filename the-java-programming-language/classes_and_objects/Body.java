// class declarations can be preceded by annotations, public, abstract, final, strctfp

class Body {

	// initializers added to fields
	public long idNum;
	public String name;
	public Body orbits;

	private static long nextID = 0;

	// initialization block - should be used judiciously
	{
		name = "<unnamed>";
		orbits = null;
	}

	// a default constructor would have same access level as the class
	// and is created automatically only if no other constructors exist

	// no-arg constructor
	// can have annotations
	Body() {
		idNum = nextID++;
	}

	Body(String bodyName) {
		this(bodyName, null);
	}

	Body(String bodyName, Body orbitsAround) {
		//explicit constructor invocation
		this();
		name = bodyName;
		orbits = orbitsAround;
	}

	// copy constructor.  Not used much since preferred way is to use Clone
	Body(Body other) {
		idNum = other.idNum;
		name = other.name;
		orbits = other.orbits;
	}

	public static void main(String[] args) {
		System.out.println("testing Body class");

		Body sun = new Body("Sol");
		Body earth = new Body("Earth", sun);

		System.out.println("Earth orbits around " + earth.orbits.name);
	}
}