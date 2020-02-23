import java.util.Arrays;

public class PorownanieStringow {
    public static void main(String[] args) {

   /*  String s1 = "Napis";
    String s2 = "Napis";
    String s3 = "Tekst";                                // zapisuje się w pamięcie String Pool
    String s4 = new String ("Napis");
    String s5 = new String ("Napis");
    String s6 = new String ("Tekst");           // znajdue się w pamięci Stetra

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s4 == s5);

        System.out.println(s1.equals(s2));              // porównanie tekstu za pomocą equals
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s5));
        System.out.println(s3.equals(s6));
        System.out.println(s4.equals(s5));
        System.out.println(s4.equals(s6));

        String czescTekstu = s1.substring(1,4);         // częsć tekstu, od 1 do 4 literki
        System.out.println(czescTekstu);

    */

String tekst = "Dzis zajecia rozpoczely sie ";
String godzina = new String("9:00");
String wynik = tekst + godzina;
System.out.println(wynik);

String fragmenttekstu = tekst.substring(5,24);
int dlugosc = fragmenttekstu.length();
char pierwszyznak = fragmenttekstu.charAt(0);
char ostatniznak = fragmenttekstu.charAt(fragmenttekstu.length()-2);

System.out.println(fragmenttekstu);
System.out.println(dlugosc);
System.out.println(pierwszyznak);
System.out.println(ostatniznak);

String duzelitery = wynik.toUpperCase();
String malelitery = duzelitery.toLowerCase();
System.out.println(duzelitery);
System.out.println(malelitery);

StringBuilder sb = new StringBuilder();
sb.append(tekst);
sb.append(godzina);
System.out.println(sb.toString());

String message = "Dzialanie metody indexOf";
System.out.println(message.indexOf('a'));               // wyswietle indeks gdzie jest pierwsze 'a'
System.out.println(message.indexOf('e', 9)); // wysswietla indeks 'e' od 9 indeksu\

String msg = "Dzialanie metody split";
String [] wyrazy = msg.split(" ");      // split usuwa dany znak - tutaj " "
String [] innyPodzial = msg.split("a");  // split usuwa "a"
System.out.println(Arrays.toString(wyrazy));
System.out.println(Arrays.toString(innyPodzial));

String replace = msg.replace('a', 'A');  // replace zamienia jeden znak w drugi
System.out.println(replace);
String nextreplace = msg.replace(" ", "");  // wywalenie spacji z tekstu
System.out.println(nextreplace);

System.out.println(msg.contains("y")); // contans sprawdza czy dany znak jest w stringu - true/false

System.out.println(msg.trim());  // trim ucina wszystkie spacje przed i po tekscie (w srodku tekstu nie)



}}
