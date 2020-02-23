public class DodatkoweZadania {
    public static void main(String[] args) {
// zadanie 1
    System.out.println("Maciej");
// zadanie 2
    System.out.println("28");
// zadanie 3
    int x , y , suma , roznica , iloczyn;
    x = 3;
    y = 2;
    suma = x + y;
    roznica = x - y;
    iloczyn = x * y;
    System.out.println(suma);
    System.out.println(roznica);
    System.out.println(iloczyn);
// zadanie 4
    int a = 5;
    if (a % 2==0){System.out.println("True");}else{System.out.println("False");}
// zadanie 5
    int b = 15;
    if (b%3==0 && b%5==0){System.out.println("True");}else{System.out.println("False");}
// zadanie 6
    int c = 3;
    double d = Math.pow(c,3);
    int dd = (int) d;
    System.out.println(dd);
// zadanie 7
    double e = -9;
    double f = Math.sqrt(Math.pow(e,2));
    int ff = (int) f;
    System.out.println(ff);
// zadanie 8
    int aa , bb, cc;
    aa = 5;
    bb = 3;
    cc = 4;
    // a2+b2=c2
    if (Math.pow(aa,2)+Math.pow(bb,2)==Math.pow(cc,2)){System.out.println("True");}
    else if (Math.pow(aa,2)+Math.pow(cc,2)==Math.pow(bb,2)){System.out.println("True");}
    else if (Math.pow(bb,2)+Math.pow(cc,2)==Math.pow(aa,2)){System.out.println("True");}
    else{System.out.println("False");}




    }
}
