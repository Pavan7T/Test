
public class StringMagic {
	public static void main(String[] args) {

		String name = "Rahul";

		String str1 = "Hello";
		String str2 = "World";

		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		int num = 123;
		int reversenum = 0;

		while (num != 0) {
			int digit = num % 10;
			reversenum = reversenum * 10 + digit;
			num = num / 10;

		}

		System.out.println("reversenum :" + reversenum);

	}
}
