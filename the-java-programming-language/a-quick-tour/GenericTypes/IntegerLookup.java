// implementing generic interface
class IntegerLookup implements Lookup<Integer> {

	private String[] names = {"one", "two"};
	private Integer[] values = {1, 2};

	public Integer find(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name))
				return values[i];
		}
		return null; // not found
	}

}