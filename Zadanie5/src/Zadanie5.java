public class Zadanie5 {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z = x - y;
        int random = (int)(Math.random() * z) + y;
        System.out.println(random);

        String text = random<5 ? "Mniejsza niz 5":"Większa lub równa 5"; // skrócony zapis funkcji
        System.out.println(text);


        switch(random) {                         // funkcja switch - przypisujemy case do danej liczby
            case 1:
                System.out.println(random + "yo1");
            break;                              // - break zatrzymuje switcha, jesli jest spełniony warunek
            case 2:
                System.out.println(random + "yo2");
            break;
            case 3:
                System.out.println(random + "yo3");
            break;
            default:                            // default wykonuje pozostałe operacje, nie zdefiniowane przez case
                System.out.println("Default Case");
        }
}


    }

