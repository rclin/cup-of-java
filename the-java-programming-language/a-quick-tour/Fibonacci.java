public class Fibonacci {
	static final int MAX = 100;
	static final int ARRAY_SIZE = 100;

	/** Print out the Fibonacci sequence for values < MAX */	
	public static void main(String[] args) {

		generateFibSequence1();
		generateFibSequence2();

	}


	public static void generateFibSequence1() {
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

	public static void generateFibSequence2() {

		int[] fibArray = buildFibArray();
		printFibArray(fibArray);

	}

	public static int[] buildFibArray() {

		// we don't know the array size beforehand.  For the purposes of this
		// exercise, allocate size 100
		int[] fibArray = new int[ARRAY_SIZE];

		fibArray[0] = 1;
		fibArray[1] = 1;

		for (int i = 2; ; i++) {

			fibArray[i] = fibArray[i-1] + fibArray[i-2];
			if (fibArray[i] > MAX) {
				fibArray[i] = 0;
				break;
			}
		}

		return fibArray;
	}

	public static void printFibArray(int[] fibArray) {

		for (int i = 0; fibArray[i] != 0; i++) {
			System.out.println(fibArray[i]);
		}

	}

}
