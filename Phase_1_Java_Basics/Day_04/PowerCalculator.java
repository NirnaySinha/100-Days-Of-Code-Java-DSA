import java.util.Scanner;

public class PowerCalculator {
    public static double calculatePower(double x, int n) {
        double result = 1;
        for (int i = 1; i <= Math.abs(n); i++) {
            result *= x;
        }
        return n < 0 ? 1 / result : result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        double x = sc.nextDouble();
        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        System.out.println(x + "^" + n + " = " + calculatePower(x, n));
        sc.close();
    }
}