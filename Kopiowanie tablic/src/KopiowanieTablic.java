import java.util.Arrays;

public class KopiowanieTablic {
    public static void main(String[] args) {
       /* int [] tab = {9, -2, 34, 5, 6};
        int [] tabCopy = tab;                       // dwie te same tablice skopiowane - przy zmianie zawartości pierwszej, zmienia sie tez druga
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(tabCopy));

        */
       int [] tab = {1, 2, 3, 4, 5, 6, 7, 8};
       int [] newtab = new int [tab.length];
       for (int i = 0; i < tab.length; i++){newtab [i] = tab [i];}   // przy zmianie zawartoście pierwszej, druga nie ulega zmianie
       System.out.println(Arrays.toString(tab));
       System.out.println(Arrays.toString(newtab));

       tab [4] = 11;
       tab [5] = 12;

       System.out.println(Arrays.toString(tab));
       System.out.println(Arrays.toString(newtab));

      // int newtab = Arrays.copyOf(tab, tab.length);  // innna metoda kopiowania

        int [] anotherTab = {10, 11, 12, 13, 14, 15, 16, 17};
        int [] copyTab = Arrays.copyOf(anotherTab, 10);
                // tab.lenght - ta sama długość
                // new.Lenght: 10 - zwiększa tablice i dopisuje zera
                // new.Lenght: 6 - zmiejsza tablice i ucina koncowe argumenty.

        System.out.println(Arrays.toString(anotherTab));
        System.out.println(Arrays.toString(copyTab));

        anotherTab [4] = 26;
        System.out.println(Arrays.toString(anotherTab));
        System.out.println(Arrays.toString(copyTab));
 //
        // Kopiowanie za pomoca for each:
        // int [] tab = {1, 2, 3, 4};
        //        int [] newtab = new int [tab.length];
        //        int y = 0;                            // w for each trzeba stowrzyc zmienna przed petla, poniewaz nie mamy dsotepu do indeksu
        //        for (int x : tab){                    // x - indeks z tabeli
        //            newtab [y] = x;                 // do tabeli o indeksie y przypisujemy wartość x - tutaj możemy mnożyć (np x*2)
        //            y++;                            // koniecznie iteracja +1 na konci petli !!!
        //        }
        //        System.out.println(Arrays.toString(tab));  //  drukowanie tabeli przez funkcje Arrays
        //        System.out.println(Arrays.toString(newtab));


    }

}
