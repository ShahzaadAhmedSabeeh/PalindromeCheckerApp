package PalindromeCheckerApp;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
    
    // Hardcoded string
        String original = "radar";

        // Convert String to Character Array
        char[] characters = original.toCharArray();

        // Two-pointer variables
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }   
}
