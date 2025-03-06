import java.util.Iterator;

public class ArrayPractice {

	public static void main(String[] args) {

		String str = "Automation is good";

		char[] resultArray = new char[str.length()];
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {

				resultArray[index++] = ch; // Add non-space characters to resultArray
			}
		}

		String str3 = new String(resultArray);
		System.out.println(str3);
	}
}
