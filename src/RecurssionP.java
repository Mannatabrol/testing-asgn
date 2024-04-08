

//         Java recursive method to check if a given string is a palindrome.

import java.util.Scanner;

public class RecurssionP{

    // Recursive method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Base case: if the string is empty or has only one character, it's a palindrome
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        // Compare the first and last characters
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // If the first and last characters match, recursively check the substring without those characters
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            // If the first and last characters don't match, it's not a palindrome
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        scanner.close();

        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
    }
}
//output
//Enter a string:
//nayan
//nayan is a palindrome.
//Enter a string:
//mannat
//mannat is not a palindrome.