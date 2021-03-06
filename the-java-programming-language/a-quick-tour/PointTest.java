class PointTest {

	public static void main(String[] args) {
		
		System.out.println("Running PointTest");
		
		// lowerLeft is a reference type
		Point lowerLeft = new Point();
		Point upperRight = new Point();
		Point middlePoint = new Point();

		lowerLeft.x = 0.0;
		lowerLeft.y = 0.0;

		upperRight.x = 1280.0;
		upperRight.y = 1024.0;

		middlePoint.x = 640.0;
		middlePoint.y = 512.0;

		System.out.println("lowerLeft: " + lowerLeft.x + " " + lowerLeft.y);
		System.out.println("upperRight: " + upperRight.x + " " + upperRight.y);
		System.out.println("middlePoint: " + middlePoint.x + " " + upperRight.y);
		System.out.println("origin: " + Point.origin.x + " " + Point.origin.y);

		double d = lowerLeft.distance(upperRight);
		System.out.println("distance between lowerLeft and upperRight: " + d);


		System.out.println("Clearing out middlePoint...");
		middlePoint.clear();
		System.out.println("middlePoint: " + middlePoint.x + " " + middlePoint.y);

		Point movePoint = new Point();
		movePoint.move(123.0, 123.0);
		System.out.println("movePoint: " + movePoint.x + " " + movePoint.y);

		Point updatePoint = new Point();
		updatePoint.setCoordinates(movePoint);
		System.out.println("updatePoint: " + updatePoint.x + " " + updatePoint.y);

	}
}