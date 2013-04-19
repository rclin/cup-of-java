import java.util.Arrays;

class MathUtil {

	public static void main(String[] args) {

		int[] intArr = {5, 3, 4, 1, 2};

		int median = findMedian(intArr);

		if (median == 3) 
			System.out.println("success, 3 is returned");
		else
			System.out.println("failure, " + median + " is returned");

		int[] intArr2 = {5, 2, 4, 1, 3, 6};
		median = findMedian(intArr2);
		if (median == 3)
			System.out.println("success, 3 is returned");
		else
			System.out.println("failure, " + median + " is returned");
	}

/** 
 *  Return the median of a list of numbers, which is the value
 *  such that half the numbers are below and half are above.
 */
	public static int findMedian(int[] intArr) {

		//TODO: handle null or empty arrays

		// Java API for sorting array
		Arrays.sort(intArr);

		// even number of elements
		if (intArr.length % 2 == 0) {
			int sum = intArr[intArr.length/2] + intArr[(intArr.length/2)-1];
			return sum/2;

		// odd number of elements
		} else {
			return intArr[intArr.length/2];

		}

	}
}