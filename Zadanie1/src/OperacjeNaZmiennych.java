public class OperacjeNaZmiennych {
    static final int k = 10; // 'final' oznacza stałą zmienną, której nie można potem zmienić
    // zmienna 'static' poza klasą jest też dostępna dla innych klas
    public static void main(String[] args) {
        System.out.println(k);
        int a , b , h; // 'int' to liczby całkowite
        a = 0;
        b = 3;
        h = b * 2;
        System.out.println(h);
        double c , d;  // 'double' to libczy po przecinku, nie dodaje się w int i innych liczbach całkowitych
        c = 2.5;
        d = a + b + c;
        System.out.println(d);
        byte e , f , y;
        e = 00000001; // w 'bytes' wpisujemy cyfry binarne mniejsze od 127
        f = 00000111;
        System.out.println(f);
        long g;
        g = a + b; // komenda 'short' nie wykonuje tego działania - trzeba zmienić na 'long'
        System.out.println(g);
        short z;
        z = 4;
        System.out.println(z);
        float x;
        x = 6.8f;  // żeby 'float' zadziałało trzeba wpisać 'f' po wartości
        System.out.println(x);
        boolean j;
        j = false; // w komencie 'boolean' wpisujemy true lub false
        System.out.println(!j); // ! przed wartością robi negację (zamienia false na true)
        char u = '8'; // wartości komendy 'char' wpisujemy w apostrofie
        System.out.println(u);
        System.out.println("Zajebiście!");

        int l , m;
        l = 6;
        m = 6;
        System.out.println(l == m); // == porównuje dwie wartości
        boolean o;
        o = true;
        System.out.println(j && o); // && iloczyn logiczny pomiędzy true i false

        System.out.println(a);
        System.out.println(++a); // postinkrementacja - po użyciu zmiennej jej wartość jest podnoszona o 1
        System.out.println(a); // a zostało powyżej użyte, więc jego wartość wzrosła o 1
        System.out.println(++a);
        System.out.println(++a);


    }
}
