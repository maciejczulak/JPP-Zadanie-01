public class Punkt2D {
    private int x;
    private int y;

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double obliczodleglosc(Punkt2D punktA, Punkt2D punktB) {
        double d = Math.sqrt((Math.pow((punktB.getX()-punktA.getX()),2)) + (Math.pow((punktB.getX()-punktA.getX()),2)));
    return d;}

    @Override
    public String toString() {
        return "Punkt2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
