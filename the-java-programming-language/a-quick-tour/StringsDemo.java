class StringsDemo {

	public static void main(String[] args) {
		String myName = "Petronius";

		myName = myName + " Arbiter";

		System.out.println("Name = " + myName);

		myName += " (Reorganization Specialist)";

		System.out.println("Name = " + myName);

		// constructing string from character array
		char[] charHello = {'h', 'e', 'l', 'l', 'o'};
		String hello = new String(charHello);
		System.out.println(hello);

		// constructing char array from string
		String world = "world";
		char[] charWorld = world.toCharArray();
		for (int i = 0; i < charWorld.length; i++) {
			System.out.print(charWorld[i]);
		}
		System.out.println();

		// comparing strings
		if (hello.equals(world))
			System.out.println("hello equals world");
		else
			System.out.println("hello does not equal world");

	}

}