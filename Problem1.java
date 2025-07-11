
import java.util.Scanner;
 // in java code calculator program
class Calculator {
    private double a, b;
    private String operation;

    // Constructor
    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    // Method to perform the calculation
    public void calculate() {
        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Result: " + (a + b));
                break;
            case "subtract":
                System.out.println("Result: " + (a - b));
                break;
            case "multiply":
                System.out.println("Result: " + (a * b));
                break;
            case "divide":
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Error: Division by zero!");
                break;
            default:
                System.out.println("Invalid operation!");
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        System.out.print("Enter operation (add / subtract / multiply / divide): ");
        String operation = scanner.next();

        // Create Calculator object and perform calculation
        Calculator calc = new Calculator(a, b, operation);
        calc.calculate();

        scanner.close();
    }
}
