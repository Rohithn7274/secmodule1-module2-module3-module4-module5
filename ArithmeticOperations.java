import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quotient = a / b;      
        int remainder = a % b;
        System.out.println("\n--- Arithmetic Results ---");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}