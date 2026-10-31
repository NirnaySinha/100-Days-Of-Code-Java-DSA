import java.util.Scanner;

public class CircleCircumference {
    public static double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.println("Circumference: " + getCircumference(radius));
        sc.close();
    }
}