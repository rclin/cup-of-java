public class TestPair {


	public static void main(String[] args) {

		Pair<Integer, String> p1 = new OrderedPair<Integer, String>(1, "apple");
		Pair<Integer, String> p2 = new OrderedPair<Integer, String>(2, "pear");
		boolean same = Util.<Integer, String>compare(p1, p2);
		System.out.println("should be false: " + same);

	}

}