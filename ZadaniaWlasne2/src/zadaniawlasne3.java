import java.util.Scanner;
public class zadaniawlasne3 {
    public static void main(String[] args) {
// zad 1
System.out.println("ZADANIE 1");
        Scanner newscanner = new Scanner(System.in);
        short liczba1 = newscanner.nextShort();
        int i = 0;
        while(Math.pow(2,i)<=liczba1){System.out.println((int)Math.pow(2,i));i++;}
// zad 2
System.out.println("ZADANIE 2");
        Scanner newscanner1 = new Scanner(System.in);
        String znak;
        int x = 1;
        do{System.out.println("Podaj haslo:");
        znak = newscanner.nextLine();
        x++;}
        while(!"x".equals(znak));



    }}

