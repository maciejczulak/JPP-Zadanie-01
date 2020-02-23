import java.util.Scanner;
public class ZajeciaPetle {
    public static void main(String[] args) {
         // for (int i=0; i<10 ; i++){System.out.println("To jest " + i + " iteracji petli");} - schemat ogólny petli for
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();                      // - podajemy liczbe x
        for(int y = 0; y < x ; y++){
          if(y%2==0){
              System.out.println(y);                // operujemy i wyswietlamy liczbe y
           }
       }}}





