public class LinkedList {

	public Object element;
	public LinkedList next;

	public static void main(String[] args) {

		LinkedList node1 = new LinkedList();
		LinkedList node2 = new LinkedList();

		Vehicle v1 = new Vehicle();
		v1.idNum = Vehicle.nextID++;
		v1.ownerName = "John";

		Vehicle v2 = new Vehicle();
		v2.idNum = Vehicle.nextID++;
		v2.ownerName = "Richard";
		
		node1.element = v1;
		node2.element = v2;
		node1.next = node2;

		System.out.println("node2 vehicle id: " + ((Vehicle)node1.next.element).idNum);

	}

}