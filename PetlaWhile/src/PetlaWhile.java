import java.util.Scanner;
public class PetlaWhile {
    public static void main(String[] args) {
       /* int i = 0;
        while( i < 10){System.out.println(i);
        i++;}
        */
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y =0;
        while (y < x) {
            if (y%2!=0&&y>0) {
                System.out.println(" twoj wynik to :");
            }
            y++;
        }System.out.println();
    }}
// int i = 0;
//        while (i < liczba) {
//            if (i % 2 != 0 && i > 0) {
//                System.out.println(" twoj wynik to :" + i);
//            }
//            i++;