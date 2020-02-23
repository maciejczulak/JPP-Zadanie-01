import java.util.Scanner;
public class ZadnieIf {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Pensja");
         double pensja = scanner.nextDouble();
         System.out.println("Libcza przepracowanych godzin");
         double liczbagodz = scanner.nextDouble();
         System.out.println("Pensja z premią (zaokrąglona)");
         if (liczbagodz >= 200){
             double pensja2 = pensja * 1.1;
             System.out.println(Math.round(pensja2) + " zł");
         }else{System.out.println(Math.round(pensja) + " zł");
         }}}


 /* if (true) {
            String wanat = "Wanat";
        }
        warunki: np if, or, true
          */