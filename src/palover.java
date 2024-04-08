
// java method to check if string is pallindrome or not using recurssion and methodoverloading
    import java.util.Scanner;


    public class palover {

        // Recursive method to check if a string is a palindrome
        public static boolean isPalindrome(String str) {

            if (str.length() == 0 || str.length() == 1) {
                return true;
            }

            if (str.charAt(0) == str.charAt(str.length() - 1)) {

                return isPalindrome(str.substring(1, str.length() - 1));
            } else {
                return false;
            }
        }

        // Overloaded method to check if a character array is a palindrome
        public static boolean isPalindrome(char[] chars) {
            return isPalindrome(chars, 0, chars.length - 1);
        }

        // Recursive method to check if a character array is a palindrome
        private static boolean isPalindrome(char[] chars, int start, int end) {
            // Base case: if the start index is greater than or equal to end index, it's a palindrome
            if (start >= end) {
                return true;
            }

            // Compare characters at start and end indices
            if (chars[start] == chars[end]) {
                // Recur for the substring between start and end indices
                return isPalindrome(chars, start + 1, end - 1);
            } else {
                // If characters don't match, it's not a palindrome
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

