// ensure class provides onl one instance and provide a global point of access

public final class ClassicSingleton {

	private static ClassicSingleton instance = null;

	private ClassicSingleton() {}

	public synchronized static ClassicSingleton getInstance() {
		
		// lazy initialization
		if (instance == null)
			instance = new ClassicSingleton();
		
		return instance;
	}


}