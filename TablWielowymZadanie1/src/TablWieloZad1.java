import java.util.Arrays;
public class TablWieloZad1 {
    public static void main(String[] args) {
        int [][] tab = new int [10][10];
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                tab[i - 1][j - 1] = i * j;
            }
        }
            for(int i = 0; i < tab.length; i++) {
                System.out.println(Arrays.toString(tab[i]));;       // DZIAŁA
    }
}}
/* import java.util.Arrays;
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

 */