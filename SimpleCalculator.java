// COS 201 - Computer Programming I
// Week 3, Practical 1: Simple calculator
// Reads two numbers and displays their sum, difference, product and quotient.

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the two numbers from the keyboard
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        // Calculate the results
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;

        // Display the results to two decimal places
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Difference: %.2f%n", difference);
        System.out.printf("Product: %.2f%n", product);

        // Check for a zero divisor before dividing
        if (secondNumber != 0) {
            double quotient = firstNumber / secondNumber;
            System.out.printf("Quotient: %.2f%n", quotient);
        } else {
            System.out.println("Division is undefined for a zero divisor.");
        }
    }
}
