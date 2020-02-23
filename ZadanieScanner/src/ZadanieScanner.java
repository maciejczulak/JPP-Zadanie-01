import java.util.Scanner;
public class ZadanieScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imie");
        String imie = scanner.nextLine();
        System.out.println("Nazwisko");
        String nazwisko = scanner.nextLine();
        System.out.println("Wiek");
        short wiek = scanner.nextShort();
        System.out.println("Wzrost (w metrach)");
        double wzrostm = scanner.nextDouble();
        double wzrostcm1 = wzrostm * 100;
        int wzrostcm2 = (int) wzrostcm1;  // konwersja z double na short
        System.out.println("Wzrost (w centymetrach)");
        System.out.println(wzrostcm2);

        // mozemy wpisywać dane w konsolem

    }


}
