import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int [] tab = {1, 2, 3, 4};
        int [] newtab = new int [tab.length];
        int y = 0;                            // w for each trzeba stowrzyc zmienna przed petla, poniewaz nie mamy dsotepu do indeksu
        for (int x : tab){                    // x - indeks z tabeli
            newtab [y] = x;                 // do tabeli o indeksie y przypisujemy wartość x - tutaj możemy mnożyć (np x*2)
            y++;                            // koniecznie iteracja +1 na konci petli !!!
        }
        System.out.println(Arrays.toString(tab));  //  drukowanie tabeli przez funkcje Arrays
        System.out.println(Arrays.toString(newtab));


    }
}
