import java.util.Scanner;

public class GreaterNumber {
    public static int getGreater(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Greater number: " + getGreater(a, b));
        sc.close();
    }
}