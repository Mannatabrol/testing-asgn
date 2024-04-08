
// calculating factorial using recurssion and overloading
import java.math.BigInteger;
import java.util.Scanner;

public class factorial {

    // Recursive method to calculate factorial for int
    public static BigInteger factorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }

    // Overloaded method to calculate factorial for long integers
    public static BigInteger factorial(long n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      //  getting integer value
        System.out.print("Enter an integer to calculate its factorial: ");
        int num1 = scanner.nextInt();

        // getting long value
        System.out.print("Enter a long integer to calculate its factorial: ");
        long num2 = scanner.nextLong();

        scanner.close();

        // Calculate factorial for int
        System.out.println("Factorial of " + num1 + " is: " + factorial(num1));

        // Calculate factorial for long
        System.out.println("Factorial of " + num2 + " is: " + factorial(num2));
    }
}
