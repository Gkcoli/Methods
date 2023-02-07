import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an input value
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        try {
            // Try taking the square root of the input value
            double sqrt = Math.sqrt(num);
            System.out.println("Square root: " + sqrt);
        } catch (ArithmeticException e) {
            // Catch the ArithmeticException and display an appropriate message
            System.out.println("Invalid Syntax");
        }
    }
}
