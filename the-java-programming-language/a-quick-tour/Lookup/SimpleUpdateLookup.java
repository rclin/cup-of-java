class SimpleUpdateLookup implements UpdateLookup {

	private String[] names = {};
	private Object[] values = {};

	public Object find(String name) {
		for (int i =0; i < names.length; i++) {
			if (names[i].equals(name))
				return values[i];
		}
		return null;  // not found
	}

	public void add(String name, Object value) {
		System.out.println("add called");
	}

	public void remove(String name) {
		System.out.println("remove called");
	}
}