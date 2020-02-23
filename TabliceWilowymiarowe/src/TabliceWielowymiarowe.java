public class TabliceWielowymiarowe {
    public static void main(String[] args) {
        double [][] tab = new double [4][5];            // pierwsza tabela
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 5 ; j++){
                System.out.print(tab[i][j] + " ");
        } System.out.println();
    }
        tab [1][3] = 2.25;
        tab [3][4] = -3;

        for (int i = 0; i < 4; i++){                    // druga tabela po zmianach wartości
            for (int j = 0; j < 5 ; j++){
                System.out.print(tab[i][j] + " ");
            } System.out.println();




}}}
