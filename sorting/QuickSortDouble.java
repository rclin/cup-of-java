class QuickSortDouble extends SortDouble {

	protected void doSort() {

		int p = 0;
		int r = getDataLength()-1;


		quickSort(p, r);
		
	}

	private void quickSort(int p, int r) {

		if (p<r) {

			int q = partition(p,r);

			quickSort(p, q-1);

			quickSort(q+1,r);

		}

	}

	private int partition(int p, int r) {

		double x = probe(r);

		int i = p - 1;

		for (int j = p; j <= r-1; j++) {

			if (probe(j) <= x) {
				i = i+1;
				swap(i,j);
			}

		}

		swap(i+1, r);

		return i+1;

	}

}