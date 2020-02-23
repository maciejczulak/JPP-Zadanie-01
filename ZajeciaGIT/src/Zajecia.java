public class Zajecia {
    public static void drawWater (int height) {  // warto wyznaczyć argument w funkcji
        for (int i = 1; i <= height; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    public static void raisingWave(){
        for(int i=1; i<=4; i++){drawWater(i);
        }}

    public static void descendingWave(){
        for(int i=4; i>=1; i--){drawWater(i);
        }}


    public static void main(String[] args) {
        raisingWave();                               // wywołanie metody napisanej powyzej
        descendingWave();
        raisingWave();
        descendingWave();





}}
