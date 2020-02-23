import java.util.Scanner;
public class Zadanie {
    public static void main(String[] args) {
        System.out.println("Jaki dziś dzień tygodnia?");
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        String dzien = scanner.nextLine();
        switch (dzien) {
            case "Poniedzialek":
                x = 1;
                System.out.println(x);
                break;
            case "Wtorek":
                x = 2;
                System.out.println(x);
                break;
            case "Sroda":
                x = 3;
                System.out.println(x);
                break;
            case "Czwartek":
                x = 4;
                System.out.println(x);
                break;
            case "Piatek":
                x = 5;
                System.out.println(x);
                break;
            case "Sobota":
                x = 6;
                System.out.println(x);
                break;
            case "Niedziela":
                x = 7;
                System.out.println(x);
                break;
            default: System.out.println("Nie ma takiego dnia tygodnia!");
                    }

            if (x<4 && x>0){System.out.println("Poczatek tygodnia");}
            else if (x>=4 && x<=5){System.out.println("Koniec tygodnia");}
            else if (x>5){System.out.println("Weekend");}

    }}

