public class ZadRozgrz {

    public static double calAverage (double ... n){  // zadajemy zmienną ilość argumentów
        double sum = 0;
        double average = 0;
        for (int i = 0; i<n.length; i++){  // iterujemy argumenty od 0 do n
            sum += n[i];                   // inaczej: sum=sum+n[i];
        }
        average = (sum/n.length);          // średnia
        System.out.println(average);
        return average;
       }

        public static void main(String[] args) {
            calAverage(7.9, 8.7, 9.87, 89.764);

}}


