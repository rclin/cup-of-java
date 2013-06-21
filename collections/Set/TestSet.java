import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Collection;

class TestSet {

	public static class Person implements Comparable<Person> {

		String fname;
		String lname;

		public Person(String fname, String lname) {
			this.fname = fname;
			this.lname = lname;
		}

		public int compareTo(Person p) {
			return fname.compareTo(p.fname);
		}
	}


	public static void main(String[] args) {

		Set<Person> pSet = new HashSet<Person>();

		Person p1 = new Person("John", "Smith");
		Person p2 = new Person("Jane", "Doe");

		System.out.println("adding p1: " + pSet.add(p1));
		System.out.println("adding p2: " + pSet.add(p2));
		System.out.println("adding p1: " + pSet.add(p2));

		Set<Person> pSetSorted = new TreeSet<Person>();

		System.out.println("adding p1: " + pSetSorted.add(p1));
		System.out.println("adding p2: " + pSetSorted.add(p2));
		System.out.println("adding p1: " + pSetSorted.add(p2));

		System.out.println("pSet hashset size: " + pSet.size());

		// Getting person iterator
		Iterator<Person> pIter = pSet.iterator();
		while (pIter.hasNext()) {
			System.out.println("Removing set element");
			System.out.println(pIter.next().fname);
			pIter.remove();
		}

		System.out.println("pSet hashset size: " + pSet.size());

		Collection<Person> pIt = new HashSet<Person>();
		pIt.size();

		System.out.println("pSet size: " + pSet.size());
		
		// runtime error
		//Person[] pArr = (Person[])pSet.toArray();
		Person[] parr = new Person[pSet.size()];
		parr = pSet.toArray(parr);
		System.out.println("parr size: " + parr.length);

		pSet.add(p1);
		System.out.println("pSet size after add: " + pSet.size());
		pSet.remove(p1);
		System.out.println("pSet size after remove: " + pSet.size());

	}

}