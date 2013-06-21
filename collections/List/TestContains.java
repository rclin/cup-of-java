import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class TestContains {

	public static class Person {

		String fname;
		String lname;

		public Person(String fname, String lname) {
			this.fname = fname;
			this.lname = lname;
		}
	}


	public static void main(String[] args) {

		List<Person> plist = new ArrayList<Person>();

		Person p1 = new Person("John", "Smith");

		plist.add(p1);

		System.out.println("plist size: " + plist.size());
		System.out.println("plist isEmpty: " + plist.isEmpty());


		if (plist.contains(p1)) {
			System.out.println("p1 found");

		}

		// return iterator
		// iterator methods: hasNext(), next(), remove(), set(), add()
		Iterator<Person> pIt = plist.iterator();





//		plist.add("Hello");

//		if (plist.contains("Hello")) {
//			System.out.println("Hello found");
//		}

	}

}