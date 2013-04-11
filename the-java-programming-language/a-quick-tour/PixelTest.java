class PixelTest {


	public static void main(String[] args) {

		Point point = new Pixel();

		point.x = 25.0;
		point.y = 25.0;

		System.out.println(point.x + " " + point.y);
		point.clear();
		System.out.println(point.x + " " + point.y);

		// object class
		Object oref = new Pixel();
		oref = "Some String";

	}

}