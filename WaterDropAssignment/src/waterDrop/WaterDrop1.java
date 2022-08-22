package waterDrop;

import java.util.Arrays;
import java.util.Scanner;

public class WaterDrop1 {

	
	 public static void main(String[] args) {
	        double inputValue = 100;
	        double [] Array = {0,0,0,0,0,0,0};
	      
	        int [][] waterptn ={
	        	  { 0, 0, 0, 0, 0, 0, 0 },
	  		      { 1, 0, 0, 0, 0, 0, 0 },
	  		      { 0, 0, 1, 1, 1, 0, 0 },
	  		      { 0, 0, 0, 0, 0, 0, 0 },
	  		      { 1, 1, 1, 0, 0, 1, 0 },
	  		      { 0, 0, 0, 0, 0, 0, 1 },
	  		      { 0, 0, 0, 0, 0, 0, 0 }
	                };

	        System.out.println("Enter the position:" );
	        Scanner sc = new Scanner(System.in);
	        int index = sc.nextInt() - 1;
	        Array[index] = inputValue;

	        double [] currentValue;

	        for (int i = 0; i < waterptn.length; i++) {
	            int [] currentRow = waterptn[i];
	            double [] splittedValues;

	            currentValue = Arrays.copyOf(Array, Array.length);

	            for (int j = 0; j < currentRow.length; j++) {
	                if (currentRow[j] == 1 && Array[j] > 0){
	                    splittedValues = valueSplit(currentRow.length, Array[j], currentRow[j], j);

	         
	                    if (splittedValues[0] > 0){
	                    	currentValue[j - 1] = currentValue[j - 1] + splittedValues[0];
	                    }

	                   
	                    if (splittedValues[1] > 0){
	                    	currentValue[j + 1] = currentValue[j + 1] + splittedValues[1];
	                    }
	                    currentValue[j] = 0;
	                }
	            }
	          
	            Array = currentValue;
	        }

	       
	        System.out.println("\n Result: \n");
	        for (double l: Array ) {
	            System.out.println(l);
	        }
	    }

	    public static double[] valueSplit(int column,double input, int x, int y){
	       
	    	double [] splittedValues = {0,0};
	        if (x == 1){
	           
	            if(y == 0){
	                splittedValues[1]  = input/2;
	            }
	            else if (y == column - 1){
	                splittedValues[0]  = input/2;
	            }else{
	                splittedValues[0] = input/2;
	                splittedValues[1] = input/2;
	            }
	        }
	        return splittedValues;
	    }
    
}
