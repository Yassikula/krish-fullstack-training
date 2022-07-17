package Singelton;

public class singeltonClass {
	

	
private static singeltonClass name = new singeltonClass();
	

	private singeltonClass() {
		 if (name != null){
	            throw new RuntimeException("Please use getName method");
	        }
	}

	public static singeltonClass getName() {
		
		return name;
	}
	


}
