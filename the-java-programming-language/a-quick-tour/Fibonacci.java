public class Fibonacci {
	static final int MAX = 100;
	/** Print out the Fibonacci sequence for values < MAX */	
	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;

		System.out.println("Fibonacci sequence for values < " + MAX);
		System.out.println(lo);
		while (hi < MAX) {
			System.out.println(hi);
			hi = lo + hi;
			lo = hi - lo;
		}
	}
}
