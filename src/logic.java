import java.util.UUID;

public class logic extends InternTest {

	public static void main(String[] args) {
		/*
		 * int i; // Declared outside for (i = 0; i < 10; i++) { System.out.println(i);
		 * } System.out.println("value of I after loop: "+i);
		 */
		
		/*String s=UUID.randomUUID().toString();
		System.out.println(s);
		s=s.replace("-","");
		System.out.println(s);
		s=s.substring(0, 6);
		System.out.println(s);*/
		
		String s="Hello world";
		s.format("%-6s", s.replace(' ','_'));
		
	}
}
