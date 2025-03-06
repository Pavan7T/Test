
public class stringpractice {

	public static void main(String[] args) {

		String str1 = "donald";
		String str2 = "trumph";

		str1 = str1 + str2;

		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(5);

		System.out.println(str1);
		System.out.println(str2);

	}
}
