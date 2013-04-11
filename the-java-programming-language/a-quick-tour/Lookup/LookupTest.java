class LookupTest {

	public static void main(String[] args) {

		String[] names = {"hello"};

		// incorrect since Lookup is abstract and cannot be instantiated
		//Lookup table = new Lookup();

		Lookup table = new SimpleLookup();

		processValues(names, table);

		UpdateLookup stringTable = new SimpleUpdateLookup();
		stringTable.add("hello", "world");
		stringTable.remove("hello");
		processValues(names, stringTable);

	}

	public static void processValues(String[] names, Lookup table) {
		for (int i=0; i < names.length; i++) {
			Object value = table.find(names[i]);
			if (value != null)
				System.out.println("Value found for " + names[i]);
			else
				System.out.println("Value not found for " + names[i]);
		}
	}

}