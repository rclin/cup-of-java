package SingleLinkedQueue;

import java.lang.StringBuffer;

public class SingleLinkedQueue {

    // c1(head) -> c2 -> ... -> cn(tail)
	protected Cell head;
	protected Cell tail;

	public void add(Object item) {

		if (tail == null) {
			tail = new Cell(item);
			head = tail;
		} else {
	
			tail.setNext(new Cell(item));
			tail = tail.getNext();
		}

	}

	public String toString() {
		
		StringBuffer buf = new StringBuffer();
		for (Cell i=head; i!= null; i=i.getNext()) {
			buf.append(i.getElement().toString());
			buf.append(" ");
		}

		return buf.toString();


	}

	public Object remove() {
		Object item = head.getElement();
		head = head.getNext();
		return item;
	}

	public static void main(String[] args) {
		System.out.println("singly linked queue");

		SingleLinkedQueue queue = new SingleLinkedQueue();
		queue.add(new Cell(7));
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(new Cell(6));
		System.out.println(queue);

		System.out.println("Removed " + (String)queue.remove());
		System.out.println("Removed " + queue.remove());
		System.out.println(queue);

	}
}
