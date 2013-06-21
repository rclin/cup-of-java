import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

class SortedSetAPI {

	public static void main(String[] args) {

		System.out.println("sorted set api");

		SortedSet<Integer> sset = new TreeSet<Integer>();

		sset.add(1);
		sset.add(5);
		sset.add(2);
		sset.add(8);
		sset.add(4);

		Iterator<Integer> ssetIter = sset.iterator();

		while (ssetIter.hasNext()) {

			System.out.println(ssetIter.next());
		}

		System.out.println("first: " + sset.first());
		System.out.println("last: " + sset.last());

		//Comparator use?

		SortedSet<Integer> ssetSub = sset.subSet(1,4);
		Iterator<Integer> ssetSubIter = ssetSub.iterator();
		while (ssetSubIter.hasNext()) {

			System.out.println(ssetSubIter.next());
		}

		//headset (max)
		//tailset (min)

		// snapshot


		// creating hashset with capacity and load factor
		Set<String> stringSet = new HashSet<String>(10,(float)2.0);

		// linked hash set is same as HashSet, but extends it by returning elements in insertion order

	}


}