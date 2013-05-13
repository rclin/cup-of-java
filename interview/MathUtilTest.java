import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

/**
 *  Tests for {@MathUtil}.
 *
 *  @author rclin@github.com
 */

public class MathUtilTest {


	@Test
	@Ignore
	public void thisAlwaysPasses() {
	}

	@Test
	public void testOddLengthArr() {

		int[] arr = {5, 2, 4, 1, 3};
	
		assertEquals(3, MathUtil.findMedian(arr), 0.1);
	} 

	@Test
	public void testEvenLengthArr() {

		int[] arr = {5, 2, 4, 1, 3, 6};

		assertEquals(3.5, MathUtil.findMedian(arr), 0.1);
	}

	@Test
	public void testOneLengthArr() {

		int[] arr = {1};


		assertEquals(1, MathUtil.findMedian(arr), 0.1);
	}

	@Test
	public void testTwoLengthArr() {

		int [] arr = {1,2};

		assertEquals(1.5, MathUtil.findMedian(arr), 0.1);
	}


	@Test
	public void testEmptyArr() {

		try {
			int[] arr = {};

			MathUtil.findMedian(arr);
		} catch (Throwable expected) {
			assertEquals(IllegalArgumentException.class, expected.getClass());
		}

	}

	@Test
	public void testNullArr() {

		try {
			MathUtil.findMedian(null);
		} catch (Throwable expected) {
			assertEquals(NullPointerException.class, expected.getClass());
		}

	}


//	@Test

}