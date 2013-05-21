public class Apple implements Cloneable {

	public int nSeeds;

	public Apple(int nSeeds) {
		this.nSeeds = nSeeds;
	}

	public Apple clone() throws CloneNotSupportedException {
		return (Apple)super.clone();
	}
}