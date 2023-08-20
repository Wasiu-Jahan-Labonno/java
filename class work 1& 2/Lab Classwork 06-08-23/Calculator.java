import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Average");
        System.out.print("Enter your choice (1-5): ");

        int choice = scanner.nextInt();

        Calculator calculator = new Calculator();

        switch (choice) {
            case 1:
                int sum = calculator.addition(num1, num2);
                System.out.println("Sum: " + sum);
                break;
            case 2:
                int diff = calculator.subtraction(num1, num2);
                System.out.println("Difference: " + diff);
                break;
            case 3:
                int product = calculator.multiplication(num1, num2);
                System.out.println("Product: " + product);
                break;
            case 4:
                double quotient = calculator.division(num1, num2);
                System.out.println("Quotient: " + quotient);
                break;
            case 5:
                double avg = calculator.average(num1, num2);
                System.out.println("Average: " + avg);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        scanner.close();
    }

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }

    public double average(int a, int b) {
        return (a + b) / 2.0;
    }
}