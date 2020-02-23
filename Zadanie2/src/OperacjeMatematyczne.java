import javax.swing.plaf.metal.MetalLookAndFeel;

public class OperacjeMatematyczne {
    public static void main(String[] args) {
        short dzien , rok , miesiac;
        dzien = 10;
        rok = 1991;
        miesiac = 4;
        double x = (dzien - (Math.sqrt(Math.abs((Math.pow(4,2)) - 4 * rok)))) / (Math.PI * miesiac);
        System.out.println(x);

        double A = Math.PI * Math.E * Math.sin(Math.PI / 6);
        System.out.println(A);
        System.out.println(Math.sin(Math.PI / 6));

        double Z = 1 + x / (3 * A) + (Math.pow(x ,4) / Math.E);
        System.out.println(Math.round(Z));

        // zrobić zadanie na nowo, rozbijając na osobne zmienne


        // konwersje ->
        double liczba;
        liczba = Double.parseDouble("7.53"); // konwersja exclipite: zamienia tekst (string) na liczbę (double) lub odwrotnie
        System.out.println(liczba);

        double liczba1 = 2.8;
        int rzutowanie = (int) liczba1; // rzutowanie exclipite: zamienia liczbę na liczbę (np double na int)
        System.out.println(rzutowanie);

        String slowo = new String();
        slowo = "to jest slowo";
        int l1 = 1;
        int l2 = 2;
        System.out.println(l1 + l2 + slowo); // liczby są na początku, więc się dodają
        System.out.println(slowo + l1 + l2); // string jest na początku, więc kolejne zmienne zmieniają się w string
        System.out.println(l1 + l2+ slowo + l2 + l1); // l1l2 na przodzie się dodały, a l1l2 z tyłu zmieniły się w słowa

        // rzutowanie ->
        int a1 = 11;
        int a2 = 4;
        int wynik1 = a1 / a2;
        double wynik2 = a1 / a2;
        double wynik3 = a1 % a2;
        System.out.println(wynik1);
        System.out.println(wynik2);
        System.out.println(wynik3);

        // konwersja stratna i bezstratna ->
        int liczbaLong = 1231231234;
        System.out.println(liczbaLong);
        float liczbaDouble = (float) liczbaLong;
        System.out.println(liczbaDouble);
        short liczbaShort = 12312;
        System.out.println(liczbaShort);
        int liczbaInt = (int) liczbaShort;
        System.out.println(liczbaInt);

    }
}
