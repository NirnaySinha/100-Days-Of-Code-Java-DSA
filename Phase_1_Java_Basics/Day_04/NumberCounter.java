import java.util.Scanner;

public class NumberCounter {
    public static void countNumbers() {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nSummary:");
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);
        sc.close();
    }

    public static void main(String[] args) {
        countNumbers();
    }
}