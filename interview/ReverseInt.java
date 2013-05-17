public class ReverseInt {


	public static void main(String[] args) {

		int foo = 123456789;

		System.out.println("Reverse: " + foo + " -> " + reverseInt(foo));

	}

	public static int reverseInt(int num) {

		// test
		// foo=12

		int reverseNum=0;

		// terminate when there is no remainder left
		while(num%10 != 0) {
			// shift reverse to the left and add rightmost digit of num
			reverseNum = reverseNum*10 + (num%10);

			// get rid of right most digit of num
			num = num/10;

		}

		return reverseNum;

	}

}