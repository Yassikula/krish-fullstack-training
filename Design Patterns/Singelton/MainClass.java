package Singelton;

public class MainClass {

    public static void main(String[] args) {
    	
    	singeltonClass s1 = singeltonClass.getName();
    	System.out.println(s1);
    	
    	
    	singeltonClass s2 = singeltonClass.getName();
    	System.out.println(s2);

    }
}
