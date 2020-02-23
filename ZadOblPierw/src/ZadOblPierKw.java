import java.util.Scanner;
public class ZadOblPierKw {
    public static double oblDelta(double a, double b, double c) {
        double delta = (Math.pow(b,2))-(4*a*c);
    return delta;
    }
    public static void high(double a, double b, double c, double resultDelta) {
        double x1,x2;
        x1=(-b-(Math.sqrt(resultDelta)))/(2*a);
        x2=(-b+(Math.sqrt(resultDelta)))/(2*a);
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
    }
    public static void zero(double a, double b, double c, double resultDelta) {
        double x1;
        x1=(-b)/(2*a);
        System.out.println("x1 = "+x1);
    }
    public static void low(double a, double b, double c, double resultDelta) {
        System.out.println("Nie ma pierwiastków dla takiej delty");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Parametr 'a':");
        double a = scanner.nextDouble();
        System.out.println("Parametr 'b':");
        double b = scanner.nextDouble();
        System.out.println("Parametr 'c':");
        double c = scanner.nextDouble();
        System.out.println("Pierwiastki rownania kwadratowego dla zadanej delty wynosza:");
        double resultDelta = oblDelta(a,b,c);
        if(resultDelta>0){high(a,b,c,resultDelta);}
        else if(resultDelta==0){zero(a,b,c,resultDelta);}
        else{low(a,b,c,resultDelta);}
}}
