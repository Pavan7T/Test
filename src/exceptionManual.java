class exceptionManual {
	public int MAX_SPEED;
	int b=19;
	

	public exceptionManual(int a) {
		MAX_SPEED = a;

	}

	void display() {
		System.out.println("Max Speed: " + MAX_SPEED);
	}

	public static void main(String[] args) {
		exceptionManual obj = new exceptionManual(5);
		obj.display();
		int c=obj.b+obj.MAX_SPEED;
		obj.MAX_SPEED++;
		System.out.println(obj.MAX_SPEED);

		// obj.MAX_SPEED = 150; // Error: Cannot modify a final variable
	}
}
