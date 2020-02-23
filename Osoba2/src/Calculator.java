public class Calculator {
    public int dodaj(int ... args) {
        int suma = 0;
        for(int a=0; a<args.length;a++) {
            suma += args[a];
        }
        return suma;
    }

    public int dodajCosTam(int[] args) {
        int suma = 0;
        for(int a=0; a<args.length;a++) {
            suma += args[a];
        }
        return suma;


}}
