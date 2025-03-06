
public class MaxArrDiffOfelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 3, 7, 14, 18, 29 };

		int MaxDiff = diff(a);
		System.out.println("The Max difference in array element is : " + MaxDiff);
	}

	private static int diff(int[] a) {
		int diff = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i + 1] - a[i] > diff) {
				diff = a[i + 1] - a[i];
			}
			System.out.println("difference is :" + diff);
		}
		return diff;
	}

}
