class LookupTest {

	public static void main(String[] args) {

		Lookup<Integer> table = new IntegerLookup();
		// ... add entries to table
		String[] names = {"one", "two"};
		processValues (names, table);

	}

	// this does not work because processValues expecting object
	// of class that implements Lookup<Integer>, not Lookup<Object>
//	public static void processValues(String[] names, Lookup<Object> table) {

	// Here, table is an instance of a class that implements a lookup of some type
	// Add <? extends Number> to bound the wildcare
	public static void processValues(String[] names, Lookup<? extends Number> table) {
		for (int i=0; i < names.length; i++) {
			Object value = table.find(names[i]);
			if (value != null)
				System.out.println("Value found for " + names[i]);
			else
				System.out.println("Value not found for " + names[i]);
		}
	}
}