public class BinSearch {

	public static void main(String[] args) {

		int[] A = {1,2,3,4,5,6,7,8,9,10};

		int ind = binSearchRec(A, 3, 0, A.length-1);
		System.out.println("should return 2 for binsearchIter(3): " + ind);
		
		ind = binSearchRec(A, 4, 0, A.length-1);
		System.out.println("should return 3 for binsearchIter(4): " + ind);

		ind = binSearchRec(A, 13, 0, A.length-1);
		System.out.println("should return -1 for binsearchIter(13): " + ind);

		ind = binSearchIter(A, 3);
		System.out.println("should return 2 for binsearchIter(3): " + ind);
		
		ind = binSearchIter(A, 4);
		System.out.println("should return 3 for binsearchIter(4): " + ind);

		ind = binSearchIter(A, 13);
		System.out.println("should return -1 for binsearchIter(13): " + ind);


	}

	// return index
	public static int binSearchRec(int[] A, int key, int lo, int hi) {

		// for sample array of length 10, mid is 9-0/2
		if (lo>hi) return -1;

		int mid = lo+ (hi-lo)/2;
		
		if (key < A[mid]) {
 			return binSearchRec(A, key, lo, mid-1);
		} else if (key > A[mid]) {
			return binSearchRec(A, key, mid+1, hi);
		} else {
			return mid;
		}
	}

	public static int binSearchIter(int[] A, int key) {

		int lo=0;
		int hi=A.length-1;

		while(lo<=hi) {

			int mid = lo + (hi-lo)/2;

			if (key < A[mid]) {

				// key is on left side, so set high to mid-1
				hi = mid-1;

			} else if (key > A[mid]) {

				// key is on right side, so set lo to mid+1
				lo = mid+1;

			} else {
				return mid;
			}


		}

		// no key found!
		return -1;
	}

}