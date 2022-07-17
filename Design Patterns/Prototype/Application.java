package Prototype;

public class Application {

	public static void main(String[] args) {

		Registry registry = new Registry();
		
		Mammal mammal = (Mammal) registry.getAnimal(AnimalType.Mammal);
		System.out.println(mammal);
		
		mammal.setGender("Female");
		
		System.out.println(mammal);
		
		Mammal mammal2 = (Mammal) registry.getAnimal(AnimalType.Mammal);
		System.out.println(mammal2);
	}

}
