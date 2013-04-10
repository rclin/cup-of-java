import java.util.Map;
import java.util.HashMap;

class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		System.out.println("Return first non-repeated character");

		Character result = null;

		String testString = "hello";
		result = returnFirstNonRepeatedCharacter(testString);

		if (result == 'h')
			System.out.println("success: hello returns h");
		else {
			System.out.println("failure: hello should return h, instead it returns " + result);
		}

		testString = "hhelloe";
		result = returnFirstNonRepeatedCharacter(testString);
		if (result == 'o')
			System.out.println("success: hhelloe returns o");
		else
			System.out.println("failure: hhelloe should return o, instead it returns " + result);

		testString = "";
		result = returnFirstNonRepeatedCharacter(testString);

		if (result == null)
			System.out.println("success: empty test string returns null");
		else
			System.out.println("failure: empty test string should return null");

		testString = null;
		result = returnFirstNonRepeatedCharacter(testString);

		if (result == null)
			System.out.println("success: null test string returns null");
		else
			System.out.println("failure: null test string should return null");

	}

	public static Character returnFirstNonRepeatedCharacter(String str) {

		if (str == null || str.length() == 0) {
			return null;
		}

		Map<Character, Integer> countMap = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {

			Integer count = countMap.get(str.charAt(i));

			if (count == null) {
				countMap.put(str.charAt(i), 1);				
			} else {
				countMap.put(str.charAt(i), ++count);
			}
		}

		for (int i = 0; i < str.length(); i++) {

			Integer count = countMap.get(str.charAt(i));

			if (count == 1) {
				return str.charAt(i);
			}
		}

		// should not get here, but adding to satisfy compiler
		return null;

	}
}