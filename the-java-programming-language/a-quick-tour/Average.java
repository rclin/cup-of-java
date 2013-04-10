class Average {

	public static void main(String[] args) {

		int[] values = {1, 1, 1, 1, 1};
		System.out.println("average: " + average(values));

	}

	public static double average(int[] values) {

		if (values == null || values.length == 0)
			throw new IllegalArgumentException();

		double sum = 0.0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}

		return sum / values.length;
	}

}