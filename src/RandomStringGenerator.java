import java.util.Random;
import java.util.UUID;

public class RandomStringGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = 6;
		String alphanumbericStr = "1234567890abcdefghijklmnopqrstuvwxyz";
		RandomStringGenerator rg = new RandomStringGenerator();
		rg.usingUUID(len);
		System.out.println(rg.usingManualID(alphanumbericStr, len));

	}

	public String usingUUID(int len) {
		String s = UUID.randomUUID().toString();
		s = s.replace("-", "");
		s = s.substring(0, len);
		System.out.println(s);

		return s;
	}

	public String usingManualID(String a, int len) {

		Random rd = new Random();
		String s = "";
		for (int i = 1; i <= len; i++) {
			int index = rd.nextInt(a.length());
			s += a.charAt(index);
		}

		return s;
	}

}
