class TypeCastTest {
	public static void main(String[] args) {
		String name = "Petronius";
		Object obj = name;
		name = (String)obj;  // name String reference requires String type

	}
}