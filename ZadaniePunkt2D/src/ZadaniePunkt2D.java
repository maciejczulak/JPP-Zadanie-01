public class ZadaniePunkt2D {
    public static void main(String[] args) {
        Punkt2D punktA = new Punkt2D(5, 6);
        Punkt2D punktB = new Punkt2D(7, 8);
        Punkt3D punktC = new Punkt3D (4,5,6);
        System.out.println(punktA.obliczodleglosc(punktA, punktB));
        System.out.println(punktA.toString());
        System.out.println(punktC.toString());


    }

}

