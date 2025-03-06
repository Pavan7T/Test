public class ArrayPlay {

	public static void main(String[] args) {

		int arr[] = { 3, 5, 1 };
		int sum = 0;
		int k = 3;

	
		for (int i = 0; i < arr.length; i++) {
			int currsum = arr[i] + arr[i + 1] + arr[i + 2];
			if (currsum > sum) {
				sum = currsum;
			}
		}
		System.out.println(sum);

	}

}