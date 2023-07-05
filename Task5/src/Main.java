import java.util.Scanner;

class SimpleCalculator implements Calculator {

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        return x / y;
    }
}
public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Create a calculator object.
        SimpleCalculator calculator = new SimpleCalculator();

        // Display the menu.
        System.out.println("What would you like to do?");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");

        // Get the user's choice.
        int choice = scanner.nextInt();

        // Switch on the user's choice.
        switch (choice) {
            case 1:
                // Add two numbers.
                System.out.println("Enter the first number: ");
                double x = scanner.nextDouble();
                System.out.println("Enter the second number: ");
                double y = scanner.nextDouble();
                double result = calculator.add(x, y);
                System.out.println("The result is: " + result);
                break;
            case 2:
                // Subtract two numbers.
                System.out.println("Enter the first number: ");
                x = scanner.nextDouble();
                System.out.println("Enter the second number: ");
                y = scanner.nextDouble();
                result = calculator.subtract(x, y);
                System.out.println("The result is: " + result);
                break;
            case 3:
                // Multiply two numbers.
                System.out.println("Enter the first number: ");
                x = scanner.nextDouble();
                System.out.println("Enter the second number: ");
                y = scanner.nextDouble();
                result = calculator.multiply(x, y);
                System.out.println("The result is: " + result);
                break;
            case 4:
                // Divide two numbers.
                System.out.println("Enter the first number: ");
                x = scanner.nextDouble();
                System.out.println("Enter the second number: ");
                y = scanner.nextDouble();
                result = calculator.divide(x, y);
                System.out.println("The result is: " + result);
                break;
            case 5:
                // Exit the application.
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}