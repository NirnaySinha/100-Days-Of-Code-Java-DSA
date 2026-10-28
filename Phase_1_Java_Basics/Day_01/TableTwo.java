import java.util.Scanner;

public class TableTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Loop Type:");
        System.out.println("1: For Loop");
        System.out.println("2: While Loop");
        System.out.println("3: Do-While Loop");
        System.out.print("Enter choice (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("--- Table of 2 using for loop ---");
                for (int i = 1; i <= 10; i++) {
                    System.out.println("2 * " + i + " = " + (2 * i));
                }
                break;

            case 2:
                System.out.println("--- Table of 2 using while loop ---");
                int i = 1;
                while (i <= 10) {
                    System.out.println("2 * " + i + " = " + (2 * i));
                    i++;
                }
                break;

            case 3:
                System.out.println("--- Table of 2 using do-while loop ---");
                i = 1;
                do {
                    System.out.println("2 * " + i + " = " + (2 * i));
                    i++;
                } while (i <= 10);
                break;

            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
                break;
        }
        sc.close();
    }
}