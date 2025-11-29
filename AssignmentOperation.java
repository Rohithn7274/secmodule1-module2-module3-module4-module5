import java.util.Scanner;

public class AssignmentOperation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial number: ");
        int num = sc.nextInt();
        System.out.print("Enter value to add (+=): ");
        int addValue = sc.nextInt();
        System.out.print("Enter value to subtract (-=): ");
        int subValue = sc.nextInt();
        System.out.print("Enter value to multiply (*=): ");
        int mulValue = sc.nextInt();
        num += addValue;
        System.out.println("After += " + addValue + " : " + num);

        num -= subValue;
        System.out.println("After -= " + subValue + " : " + num);

        num *= mulValue;
        System.out.println("After *= " + mulValue + " : " + num);
    }
}