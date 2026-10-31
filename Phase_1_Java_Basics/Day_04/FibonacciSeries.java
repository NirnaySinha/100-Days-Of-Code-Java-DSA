import java.util.Scanner;

public class FibonacciSeries {
    public static void printFibonacci(int n) {
        if (n <= 0) return;

        int first = 0, second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        System.out.print("Fibonacci series: ");
        printFibonacci(n);
        sc.close();
    }
}