import SingleLinkedQueue.SingleLinkedQueue;
import SingleLinkedQueue.Cell;

public class PriorityQueue extends SingleLinkedQueue {


	public void add(Object item) {
		super.add(item);
	}

	public Object remove() {
		return super.remove();
	}

	// if q were a subclass of PriorityQueue, this access would also be valid
	// Access also valid for subclass of PriorityQueue, such as FooQueue
	// Access not valid if parameter is SingleLinkedQueue
	// Access also not valid if parameter is Barqueue, which extends SingleLinkedQueue
	public void merge(SingleLinkedQueue q) {
		Cell first = q.head;
	}

	public static void main(String[] args) {
		System.out.println("priority queue");

		PriorityQueue queue = new PriorityQueue();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		System.out.println(queue);

		System.out.println("Removed " + queue.remove());
		System.out.println("Removed " + queue.remove());
		System.out.println(queue);
	}

}