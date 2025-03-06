import java.util.Objects;

public class test1 {
	private String name;
	private int age;

	public test1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		test1 obj = new test1("Rahul", 28);
		System.out.println("Tostring: " + obj.toString());
		System.out.println("Tostring: " + obj.hashCode());
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + "}";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		test1 person = (test1) obj;
		return age == person.age && name.equals(person.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
}
