package Singleton;

public class MainClass {

    public static void main(String[] args) {
    	
    	singletonClass s1 = singletonClass.getName();
    	System.out.println(s1);
    	
    	
    	singletonClass s2 = singletonClass.getName();
    	System.out.println(s2);

    }
}

