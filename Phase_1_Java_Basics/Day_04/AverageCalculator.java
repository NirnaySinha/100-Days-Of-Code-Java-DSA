import java.util.Scanner;

public class AverageCalculator {
    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("Average: " + calculateAverage(a, b, c));
        sc.close();
    }
}