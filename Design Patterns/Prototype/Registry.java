package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<AnimalType, Animal> ans = new HashMap<>();
	
	public Registry() {
		
		this.initialize();
	}
	
	
	 public Animal getAnimal(AnimalType animalType) {
		  
	        Animal animal = null;
	        try {
	             animal = (Animal)ans.get(animalType).clone();
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	        return animal;
	    }
	
	private void initialize() {
	
		Mammal mammal = new Mammal();
		mammal.setName("Goofy");
		mammal.setGender("Male");
		mammal.setSound("Roar");
		
		Bird bird = new Bird();
		bird.setName("Blurr");
		bird.setColor("blue");
		bird.setSound("twitter");
		
		ans.put(AnimalType.Mammal,mammal);
		ans.put(AnimalType.Bird,bird);
		
	}
	
	

}
