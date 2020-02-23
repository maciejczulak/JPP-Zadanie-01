public class Tablice {
    public static void main(String[] args) {
       /* int [] intTab = new int[6];         // tworzenie tablicy int na 6 pól
        intTab [0] = 1;
        intTab [1] = 2;
        intTab [2] = 3;
        intTab [3] = 4;
        intTab [4] = 5;
        intTab [5] = 6;
        int x = 0;
        while (x <= intTab.length-1){             // a.length - zakres tabeli
            System.out.println(intTab[x]);      // wyswietla caly zakres tabeli
        x++;}
*/
        int [] intTablica = new int [10];
        int y;
        for (y = 0; y < intTablica.length; y++) {
        intTablica [y] = intTablica.length - y;
        System.out.println(intTablica[y]);

        }}}







        /* double b [];
        double [] doubleTab = new double[8];
        doubleTab [0] = 1;
        doubleTab [7] = 8;
        System.out.println(doubleTab[7]);

        boolean [] c;
        boolean [] bTab = new boolean[5];
        bTab [0] = false;
        bTab [1] = true;
        System.out.println(bTab[1]);

         */








