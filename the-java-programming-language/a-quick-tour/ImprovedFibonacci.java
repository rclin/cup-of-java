class ImprovedFibonacci {
	
	static final int MAX_INDEX = 9;

	/**
	 *  Print out the first few Fibonacci numbers,
	 *  marking evens with a '*'
	 */
	public static void main(String[] args) {

		generateFibSequence1();
		generateFibSequence2();
	}	

	public static void generateFibSequence1() {
		int lo = 1;
		int hi = 1;
		String mark;

		System.out.println("1: " + lo);

		for (int i = 2; i <= MAX_INDEX; i++) {

			if (hi % 2 == 0)
				mark = " *";
			else
				mark = "";

			System.out.println(i + ": " + hi + mark);
			hi = lo + hi;
			lo = hi - lo;

		}
	}

	public static void generateFibSequence2() {

		FibThingy[] fibArray = buildFibArray();
		//printFibArray(fibArray);
		printFibArrayString(fibArray);
	}

	public static FibThingy[] buildFibArray() {
		FibThingy[] fibArray = new FibThingy[MAX_INDEX];

		fibArray[0] = new FibThingy();
		fibArray[0].value = 1;
		fibArray[0].isEven = false;
		fibArray[1] = new FibThingy();
		fibArray[1].value = 1;
		fibArray[1].isEven = false;

		for (int i = 2; i <= MAX_INDEX-1; i++) {

			fibArray[i] = new FibThingy();
			fibArray[i].value = fibArray[i-1].value + fibArray[i-2].value;

			if (fibArray[i].value % 2 == 0) {
				fibArray[i].isEven = true;
			} else {
				fibArray[i].isEven = false;
			}
		}

		return fibArray;
	}

	public static void printFibArray(FibThingy[] fibArray) {

		for (int i = 0; i < fibArray.length; i++) {

			String mark = fibArray[i].isEven ? " *" : "";
			int index = i+1;
			String fibLine = index + ": " + fibArray[i].value + mark;
			System.out.println(fibLine);
		}

	}

	// store Strings into array and then print
	public static void printFibArrayString(FibThingy[] fibArray) {

		String[] strArray = new String[fibArray.length];
		for (int i = 0; i < fibArray.length; i++) {

			String mark = fibArray[i].isEven ? " *" : "";
			int index = i+1;
			String fibLine = index + ": " + fibArray[i].value + mark;
			strArray[i] = fibLine;
		}

		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}

	}

	
}