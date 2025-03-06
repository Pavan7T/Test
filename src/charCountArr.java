public class charCountArr {

	public static void main(String[] args) {

		// still not get output
		String a = "aabbbcabz";
		a = a.toLowerCase();
		int count = 1;
		int set = 0;

		for (int i = 0; i < a.length(); i++) {
			for (int j = i + 1; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j)) {
					count++;

				}

			}

			System.out.println(count + ":" + a.charAt(i));
			count = 1;
			i = set;
		}

		System.out.println(a);
	}
}