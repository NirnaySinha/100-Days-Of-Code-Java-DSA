import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First number: ");
        double num1 = sc.nextDouble();

        System.out.print("Second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Pick an operation:");
        System.out.println("1 - Divide (/)");
        System.out.println("2 - Multiply (*)");
        System.out.println("3 - Remainder (%)");
        System.out.println("4 - Add (+)");
        System.out.println("5 - Subtract (-)");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                if (num2 != 0) {
                    System.out.println("Answer: " + (num1 / num2));
                } else {
                    System.out.println("Can't divide by zero!");
                }
                break;

            case 2:
                System.out.println("Answer: " + (num1 * num2));
                break;

            case 3:
                if (num2 != 0) {
                    System.out.println("Answer: " + (num1 % num2));
                } else {
                    System.out.println("Can't divide by zero!");
                }
                break;

            case 4:
                System.out.println("Answer: " + (num1 + num2));
                break;

            case 5:
                System.out.println("Answer: " + (num1 - num2));
                break;

            default:
                System.out.println("That option doesn't exist.");
                break;
        }
        sc.close();
    }
}