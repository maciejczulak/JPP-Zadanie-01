import java.util.Scanner; // dodanie Scanner do biblioteki
public class Drugie {
    public static void main(String[] args) {
        System.out.println("Wpisz swpiej imie");
        Scanner scanner = new Scanner(System.in); // tworzenie obiektu typu Scanner
        String imie = scanner.nextLine(); // metoda NextLine, znajdująca się w klasie Scanner
        System.out.println("Twoje imie to: " + imie); // - teraz wpisujemy Maciek w konsoli i wyswietla się całe zdanie
        // https://javastart.pl/baza-wiedzy/java-podstawy-jezyka/podstawowe-wejscie-wyjscie

    }
}
