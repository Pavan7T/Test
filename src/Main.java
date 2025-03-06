class Main {

	static String clg = "PCCOE";

	final int a = 10;
	int b = 30;
	String str = "sir";
	String name = "Rahul";

	static {
		System.out.println("static block is invoked");
		clg = "AIT";
	}

	public Main(int i) {
		System.out.println("CLass constructor");
		this.b = i;// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {

		Main obj = new Main(90);
		Main obj2 = new Main(70);
		System.out.println(Main.clg);
		System.out.println("a: " + obj.a);
		System.out.println("a: " + obj2.a);
		System.out.println("b: " + obj.b);
		System.out.println("b of obj2: " + obj2.b);
		System.out.println("str: " + obj.str);
		;
	}
}