
public class SumOfArray {

	public static void main(String[] args) {

		int[] a = { 1, 10, 10 };
		int size = a.length;
		// Sum of array element
		System.out.println("Sum of Array Elements: " + sumofElements(a, size));

		// multipcationof 5 table withoutusing mutiplication operator
		System.out.println("Multiplication of " + multiplicationOf(5, 10));

	}

	private static int multiplicationOf(int i, int j) {
		int ans = 0;
		/*
		 * for (int a = 1; a <= j; a++) { ans += i; }
		 */

		while (j != 0) {
			ans += i;
			j--;
		}
		return ans;
	}

	public static int sumofElements(int[] arr, int size) {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
