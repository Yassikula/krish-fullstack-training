package waterDrop;

public class WaterDrop2 {
	 public static void main(String[] args) {
	        int[][] input = new int[][] {
	                { 0, 0, 0, 0, 0, 0, 0 },
	                { 1, 0, 0, 0, 0, 0, 0 },
	                { 0, 0, 1, 1, 1, 0, 0 },
	                { 0, 0, 0, 0, 0, 0, 0 },
	                { 1, 1, 1, 0, 0, 1, 0 },
	                { 0, 0, 0, 0, 0, 0, 1 },
	                { 0, 0, 0, 0, 0, 0, 0 },
	        };

	        WaterDrop(input, 2);

	    }

	    public static void WaterDrop(int array[][], int y) {

	    	int result[] = new int[7];
	        util(array, 0, y, 100, result);

	        for (double bucket : result) {
	            System.out.print(bucket + ", ");
	        }

	    }

	    public static void util(int array[][], int x, int y, int percentage, int result[]) {
	        if (array.length - 1 == x) {
	            result[y] = percentage;
	            return;
	        }

	        if (array[x + 1][y] == 0) {
	            util(array, x + 1, y, percentage, result);
	        }
	        if (array[x + 1][y] == 1) {
	            int temp;
	            if (y + 1 < array[x].length) {
	                temp = y;
	                while (temp < array[x].length && array[x + 1][temp] == 1) {
	                    temp++;
	                    if (temp > array[x].length)
	                        return;
	                }
	                util(array, x + 1, temp, percentage / 2, result);
	            }
	            if (y - 1 > -1) {
	                temp = y;
	                while (temp > -1 && array[x + 1][temp] == 1) {
	                    temp--;
	                    if (temp < 0)
	                        return;
	                }
	                util(array, x + 1, temp, percentage / 2, result);
	            }
	        }

	    }
}
