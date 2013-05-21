public class AppleCloneTest {

	public static void main(String[] args) {

		Apple foo = new Apple(10);
		Apple bar;
		try {
			bar = foo.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("CloneNotSupportedException thrown");
			bar = new Apple(1);
		}

		System.out.println("foo nseeds: " + foo.nSeeds);
		System.out.println("bar nseeds: " + bar.nSeeds);
	}

}