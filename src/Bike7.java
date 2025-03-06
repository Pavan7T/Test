class Bike7 {
	static int speed;

	{
		speed = 100; 
	}

	Bike7() {
		System.out.println("speed is " + speed);
	}

	public static void main(String args[]) {
		Bike7 b1 = new Bike7();
		Bike7 b2 = new Bike7();
	}
}