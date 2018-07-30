
public class Animal {
	String name;
	int age;
	String gender;
	float weightInPounds;
	String sound;
	
	public Animal(String name, int age, String gender, float weightInPounds, String sound) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weightInPounds = weightInPounds;
		this.sound = sound;
	}

	public void speak() {
		System.out.println("Hello, I am " + name);
		System.out.println("I am " + age + " years old");
		System.out.println("I am " + gender);
		System.out.println("I am " + weightInPounds + " lbs");
		System.out.println("I " + sound);
	}
	
	public void eat() {
		System.out.println("eating...");
	}
	
}
