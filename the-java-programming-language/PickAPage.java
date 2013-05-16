import java.util.Random;

public class PickAPage {

	public static void main(String[] args) {
		System.out.println("Picking a page from 1 through 747");
		System.out.println("Go to page " + new Random().nextInt(747));
	}
}