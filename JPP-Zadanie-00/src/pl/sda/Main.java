package pl.sda;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Height in m:");
        float height = scanner.nextFloat();
        System.out.println("Wieght in kg:");
        float wieght = scanner.nextFloat();
        double BMI = wieght / (Math.pow(height,2));
        System.out.println("Your BMI:" + BMI);




    }
}
