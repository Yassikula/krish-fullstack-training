package Prototype;

public class Mammal extends Animal {
	
	private String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Mammal {gender=" + gender + "}";
	}
	
	

}
