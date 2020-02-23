import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args) {
        System.out.println("Jaki dziś dzień tygodnia?");
        Scanner scanner = new Scanner(System.in);
        short dzien = scanner.nextShort();
        switch(dzien) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Sroda");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default: System.out.println("Nie ma takiego dnia tygodnia! Wpisz ponownie.");
                short dzien2 = scanner.nextShort();
                switch(dzien2) {
                    case 1:
                        System.out.println("Poniedziałek");
                        break;
                    case 2:
                        System.out.println("Wtorek");
                        break;
                    case 3:
                        System.out.println("Sroda");
                        break;
                    case 4:
                        System.out.println("Czwartek");
                        break;
                    case 5:
                        System.out.println("Piątek");
                        break;
                    case 6:
                        System.out.println("Sobota");
                        break;
                    case 7:
                        System.out.println("Niedziela");
                        break;
                    default: System.out.println("Nie ma takiego dnia tygodnia!");
        }}}}


