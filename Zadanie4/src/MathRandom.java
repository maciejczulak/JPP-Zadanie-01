import java.util.Random;

public class MathRandom {
    public static void main(String[] args) {

        double random1 = Math.random(); //  losowa liczba
        System.out.println(random1);

        Random random = new Random();
        int randomInt = random.nextInt();
        System.out.println(randomInt);
        if (randomInt > 0){System.out.println("Liczba dodatnia");}
        if (randomInt < 0){System.out.println("Liczba ujemna");}
        if (randomInt == 0){System.out.println("Zero");}             // metoda bez zakresu


        int max = 25;
        int min = -25;
        int range = max - min;
        int rand = (int) (Math.random() * range) + min;
        System.out.println(rand);
        if (rand > 0){System.out.println("Liczba dodatnia");}
        if (rand < 0){System.out.println("Liczba ujemna");}
        if (rand == 0){System.out.println("Zero");}                  // metoda z zakresem

        System.out.println(rand);
        if (rand > 0 && rand % 2 == 0){System.out.println("Liczba dodatnia");}
        if (rand < 0 && rand % 2 == 0){System.out.println("Liczba ujemna");}  // rand % 2 == 0 (reszta z dzielenia równa się 0 - liczba parzysta)
        if (rand % 2 != 0){System.out.println("Błąd");}
        if (rand == 0){System.out.println("Zero");}


        // random1 > 0 ? System.out.println("większe od zera");




    }
}
