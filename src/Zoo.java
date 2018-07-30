
public class Zoo {
	
	public static void main(String args[]) {
		Animal cow = new Animal("Cow", 4, "female", 80, "MOO..");
		Animal horse = new Animal("Horse", 5, "Male", 60, "Neigh...");
		Fish fish1 = new Fish();
		Bird sparrow = new Bird();
		
		
		cow.speak();
		horse.speak();
		fish1.swim();
		sparrow.fly();
		
	}
}
