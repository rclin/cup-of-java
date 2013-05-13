import java.util.Arrays;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;

class MathUtil {

/** 
 *  Return the median of a list of numbers, which is the value
 *  such that half the numbers are below and half are above.
 */
	public static double findMedian(int[] intArr) {

		if (intArr == null) {
			throw new NullPointerException();
		}

		if (intArr.length == 0) {
			throw new IllegalArgumentException();
		}

		if (intArr.length == 1) {
			return intArr[0];
		}

		if (intArr.length == 2) {
			return ((double)intArr[0] + intArr[1])/2;
		}

		// Java API for sorting array
		Arrays.sort(intArr);

		// even number of elements
		if (intArr.length % 2 == 0) {
			return ((double)intArr[intArr.length/2] + intArr[(intArr.length/2)-1])/2;

		// odd number of elements
		} else {
			return intArr[intArr.length/2];

		}

	}
}