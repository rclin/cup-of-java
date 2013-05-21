import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class QuickSortUtil {

	public static void main(String[] args ) {

		System.out.println("Quicksort!");

		int[] A = {2, 8, 7, 1, 3, 5, 6, 4};

		quickSort(A, 0, A.length-1);

		for (int i=0; i<A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println("");

		int[] B = {1,1,1,1,1,1,1,1,1};
		quickSort(B, 0, B.length-1);

	}

	public static void quickSort(int[] A, int p, int r) {

		// If array has one or zero elements, do nothing
		if (p<r) {

			// find pivot and subarrays
			int q = partition(A, p, r);

			// sort elements smaller than pivot
			quickSort(A, p, q-1);

			// sort elements larger than pivot
			quickSort(A, q+1, r);
		}

	}

	public static int partition(int[] A, int p, int r) {

		// choose pivot to be right most element
		int x = A[r];

		int i = p - 1;

		// loop invariants
		// for any array index k,
		// if p <= k <= i, then A[k] <= x
		// if i+1 <= k <= j-1, then A[k] > x
		// if k=r, then A[k] = x

		for (int j = p; j <= r-1; j++) {

			// move element from "larger" region to "smaller" region if element is less than pivot
			if (A[j] <= x) {
				i = i+1;

				// swap A[i] and A[j]
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}

		// move pivot to be between the two regions
		int temp = A[i+1];
		A[i+1] = A[r];
		A[r] = temp;

		return i+1;
	}

}