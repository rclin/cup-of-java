public class Palindrome {


	public static void main(String[] args) {


		String test1 = "abba";
		String test2 = "aboba";
		String test3 = "sflkjdsf";
		String test4 = "a";
		String test5 = "";

		System.out.println(test1 + ": " + isPalindrome(test1));
		System.out.println(test2 + ": " + isPalindrome(test2));
		System.out.println(test3 + ": " + isPalindrome(test3));
		System.out.println(test4 + ": " + isPalindrome(test4));

		try {
			System.out.println(test5 + ": " + isPalindrome(test5));
		} catch (Exception e) {
			if (e instanceof IllegalArgumentException) {
				System.out.println(e.getMessage());
			}
		}

		try {
		System.out.println("null: " + isPalindrome(null));
		} catch (Exception e) {
			if (e instanceof NullPointerException) {
				System.out.println(e.getMessage());
			}
		}

	}

	// another way is to construct a reverse and then use string equals method

	public static boolean isPalindrome(String arg) {

		if (arg == null) {
			throw new NullPointerException("string is null");
		}

		if (arg.length() == 0) {
			throw new IllegalArgumentException("string is empty");
		}

		if (arg.length() == 1) {
			return true;
		}
		//even palindrome
		// i>j


		// odd palindrome
		// i=j

		// iterate forward through string
		// until two cases:
		// if i>=j, then return true
		// if characters don't match, then return false
		for (int i=0, j=arg.length()-1; i<=j; i++, j--) {

			if (arg.charAt(i) != arg.charAt(j)) {
				return false;
			}

		}

		return true;

	}

}