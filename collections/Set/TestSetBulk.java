import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

class TestSetBulk {


public static class Person {

		String fname;
		String lname;

		public Person(String fname, String lname) {
			this.fname = fname;
			this.lname = lname;
		}
	}

	public static void main(String[] args) {

		Set<Person> pSet1 = new HashSet<Person>();
		List<Person> pList1 = new ArrayList<Person>();

		Person p1 = new Person("John", "Smith");
		Person p2 = new Person("Jane", "Doe");
		Person p3 = new Person("David", "Bowie");
		Person p4 = new Person("Garrett", "Hod");

		pSet1.add(p1);
		pList1.add(p2);
		System.out.println("pSet1 containsAll pList1: " + pSet1.containsAll(pList1));
		pList1.add(p3);
		System.out.println("pSet1 containsAll pList1: " + pSet1.containsAll(pList1));

		// test containsAll
		// test addAll
		pSet1.addAll(pList1);
		System.out.println("pSet1 size: " + pSet1.size());
		// removeAll
		// retainAll
		// clear
		pSet1.clear();
		System.out.println("pSet1 size: " + pSet1.size());
		
	}


}