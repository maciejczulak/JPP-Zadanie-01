import java.util.Arrays;
public class Wojtek {public static void main(String[] args) {
            // write your code here
        int[][] multiplicationTable = new int[10][10];
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                multiplicationTable[row - 1][col - 1] = row * col;
            }
        }
        // log out all rows to the console
        for(int row = 0; row <multiplicationTable.length; row++) {
            System.out.println(Arrays.toString(multiplicationTable[row]));  // Działa
    }
}
}


