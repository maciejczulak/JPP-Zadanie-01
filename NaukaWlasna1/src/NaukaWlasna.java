import java.util.Scanner;
import java.util.Random;
public class NaukaWlasna {
    public static void main(String[] args) {
        // zad 1
        System.out.println("ZADANIE 1");
        int jeden = 1;
        double dwa = 2;
        String trzy = "trzy";
        System.out.println(jeden);
        System.out.println(dwa);
        System.out.println(trzy);
// zad 2
        System.out.println("ZADANIE 2");
        int dzien = 10;
        int miesiac = 4;
        int rok = 1991;
        double dzielnik = Math.PI * miesiac;
        double dzielna = dzien - (Math.sqrt(Math.abs(Math.pow(4, 2)) - (4 * rok)));

        double a, b, c, d;
        a = Math.pow(4, 2);
        b = 4 * rok;
        c = Math.abs(a - b);
        d = Math.sqrt(c);
        dzielna = dzien - d;
        double x = dzielna / dzielnik;
        System.out.println(dzielna);
        System.out.println(dzielnik);
        System.out.println(x);

        double A = Math.PI * Math.E * Math.sin(30);
        System.out.println(A);

        double Z = 1 + (x / (3 * A)) + ((Math.pow(x, 4)) / Math.E);
        System.out.println(Z);

        int intZ = (int) Z;
        System.out.print(intZ);

        double roundZ = Math.round(Z);
        System.out.println(roundZ);
// zad 3
        System.out.println("ZADANIE 3");
        Scanner newscanner = new Scanner(System.in);
        System.out.println("Wpisz imię");
        String imie = newscanner.nextLine();
        System.out.println("Twoje imię to " + imie);
// zad 4
        System.out.println("ZADANIE 4");
        System.out.println("Podaj liczbe przepracowanych godzin:");
        Short liczbagodzin = newscanner.nextShort();
        System.out.println("Przepracowana liczba godzin to " + liczbagodzin);
        System.out.println("Podaj wysokość pensji standardowej:");
        Short pensja = newscanner.nextShort();
        double pensjazpremia = pensja * 1.1;
        int intPensjazpremia = (int) pensjazpremia;
        if (liczbagodzin > 200) {
            System.out.println("Wysokosc pensji z pramie wynosi " + intPensjazpremia);
        } else {
            System.out.println("Wysokosc pensji z pramie wynosi " + pensja);
        }

// zad 5
System.out.println("ZADANIE 5");
        System.out.println("Podaj liczbę:");
        Random liczba = new Random();
        int max = 25;
        int min = -25;
        int w = liczba.nextInt(max - min + 1) + min;
        System.out.println(w);
        if (w>0){System.out.println("Dodatnia");}
        if (w==0){System.out.println("Zero");}
        if (w<0){System.out.println("Ujemna");}
        if (w%2==0){System.out.println("Parzysta");}
        else{System.out.println("Nieparzysta");}



    }
}
