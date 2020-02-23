import java.util.Scanner;
public class Petle {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
         for (int y=0; y < x ; y++){ // ilosc pieter
            for (int z=0; z<=y; z++){ // dolne pietro
            System.out.print("*");  // drukuje w tej samej linii
            }
            System.out.println();
         }}}

