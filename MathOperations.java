package projectcalculator;


public class MathOperations {
    import java.util.Scanner;

    

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
    
            System.out.print("Enter two numbers: ");
            double num1 = scan.nextDouble();
            double num2 = scan.nextDouble();
    
            double sum = num1 + num2;
            double difference = num1 - num2;
            double product = num1 * num2;
            double quotient = num1 / num2;
            double sqrtNum1 = Math.sqrt(num1);
            double sqrtNum2 = Math.sqrt(num2);
            double expNum1 = Math.exp(num1);
            double expNum2 = Math.exp(num2);
    
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
            System.out.println("Square root of num1: " + sqrtNum1);
            System.out.println("Square root of num2: " + sqrtNum2);
            System.out.println("Exponential of num1: " + expNum1);
            System.out.println("Exponential of num2: " + expNum2);
    
            scan.close();
        }

      
      
