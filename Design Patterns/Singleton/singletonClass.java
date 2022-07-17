package Singleton;

public class singletonClass {
	

	
private static singletonClass name = new singletonClass();
	

	private singletonClass() {
		 if (name != null){
	            throw new RuntimeException("Please use getName method");
	        }
	}

	public static singletonClass getName() {
		
		return name;
	}
	


}
