import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);


        System.out.println("Simple Calculator with java");

        double n1, n2, result;
        char operator;

        System.out.print("Enter the first number: ");
        n1 = scanner.nextDouble();

        System.out.print("Enter an operator for an operation ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        n2 = scanner.nextDouble();

        switch (operator) {
            case '1':
                result = n1 + n2;
                System.out.println("Result: " + result);
                break;
            case '2':
                result = n1 - n2;
                System.out.println("Result: " + result);
                break;
            case '3':
                result = n1 * n2;
                System.out.println("Result: " + result);
                break;
            case '4':
                if (n2 != 0) {
                    result = n1 / n2;
                    System.out.println("Result is : " + result);
                } else {
                    System.out.println("Error : Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
        }

        scanner.close();
    }
}
