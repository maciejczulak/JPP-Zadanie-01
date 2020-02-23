import java.util.Scanner;
public class PetlaDoWhile {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    String symbol;
     int i = 1;
    do {System.out.println("Podaj symbol:");
        symbol = scanner.nextLine();          // scanner zadany w petli
        i++;}                                 // ponawia pytanie
    while(!"x".equals(symbol)); // ! negacja  / program ponawia pytanie tak długo, aż dostanie "x"

//  do {
//            System.out.println("podaj literę");
//            litera = scanner.nextLine();
//            i++;
//        } while ("x".equals(litera));
    }
}
