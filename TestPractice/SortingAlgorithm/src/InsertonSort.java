
class InsertionSort {

	void sorting(int arr[]) {
		int l = arr.length;
		for (int i = 1; i < l; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String args[]) {
		int arr[] = { 77, 87, 74, 55, 67 };
		InsertionSort i = new InsertionSort();
		i.sorting(arr);
		printArray(arr);
	}
}