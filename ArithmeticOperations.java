package projectcalculator;


import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Calculate square
        int square = number * number;
        System.out.println("Square of " + number + " = " + square);

        // Calculate cube
        int cube = number * number * number;
        System.out.println("Cube of " + number + " = " + cube);

        // Calculate square root
        double squareRoot = Math.sqrt(number);
        System.out.println("Square root of " + number + " = " + squareRoot);

        // Calculate power (e.g., 2^3)
        int exponent = 3; // Change this to the desired exponent
        double result = Math.pow(number, exponent);
        System.out.println(number + " raised to the power of " + exponent + " = " + result);

        // Calculate modulus
        int divisor = 5; // Change this to the desired divisor
        int modulus = number % divisor;
        System.out.println("Modulus of " + number + " divided by " + divisor + " = " + modulus);

        scanner.close();
    }
}