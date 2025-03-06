
public class Test extends Abs {

	public static void main(String[] args) {

		Test obj = new Test();
		obj.add();
		obj.sub(10, 5);
		System.out.println("Value of X: " + Test.x);
	}

	public Test() {
		
		System.out.println("Constructor Executed ");
	}

	@Override
	public void add() {
		int a = 10, b = 5, c = 0;
		System.out.println("Addition: " + (c = a + b));
	}

	static int x;
	static {
		System.out.println("Static block executed");
		x = 9;
	}

}
