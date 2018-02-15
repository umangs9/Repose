
class BubbleSort {
	public void bubbleSort(int arr[]) {
		int n = arr.length;
		int i=0;
		int j=0;
		//System.out.println(n);
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");
			System.out.println();
		}

	}

	public static void main(String args[]) {
		BubbleSort b = new BubbleSort();
		int arr[] = { 77, 87, 74, 55, 99, 13, 74 };
		b.bubbleSort(arr);
		System.out.println("sorted array");
		b.printArray(arr);
	}

}