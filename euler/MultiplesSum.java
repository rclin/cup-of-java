public class MultiplesSum {


	public static void main(String[] args) {

//		System.out.println("args0 " + args[0]);
//		System.out.println("args1 " + args[1]);
		if (args.length==0) {
			System.out.println("Enter a number");
			return;
		}

		int sum=0;
		int num = Integer.valueOf(args[0]);

		for (int i=0; i<num; i++) {

			if (i%3==0 || i%5==0)
				sum += i;
		}

		System.out.println(sum);

	}

}