import java.util.Map;
import java.util.HashMap;

class HashMapTest {

	public static void main(String[] args) {

		Map fooMap = new HashMap();

		fooMap.put('a', 1);
		System.out.println("key a, value " + fooMap.get('a'));

	}


}