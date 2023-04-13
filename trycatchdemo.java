import java.util.Scanner;

public class trycatchdemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter another number: ");
        int num2 = sc.nextInt();
        try {
            int result = divide(num1, num2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown error: " + e.getMessage());
        } finally {
            System.out.println("Done.");
        }
    }

    public static int divide(int num1, int num2) throws ArithmeticException {
        if(num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1 / num2;
    }

}