import java.util.Scanner;
public class ZadaniaWlasne {
    public static void main(String[] args) {
// zad 1
System.out.println("ZADANIE 1");
        Scanner newscanner = new Scanner(System.in);
        int liczba1 = newscanner.nextShort();
        for(int i = 1;  i<liczba1; i++){if(i%2==0){System.out.println(i);}}
// zad 2
System.out.println("ZADANIE 2");
        for (int x=0; x<=100; x++){if(x%(2*3*5)==0){System.out.println(x + ", Podzielna przez 2, 3 i 5");}
        else if(x%2==0){System.out.println(x + ", Podzielna przez 2");}
        else if(x%3==0){System.out.println(x + ", Podzielna przez 3");}
        else if(x%5==0){System.out.println(x + ", Podzielna przez 5");}
        else{System.out.println(x);}













    }}}

