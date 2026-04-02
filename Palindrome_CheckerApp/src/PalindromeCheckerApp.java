public class PalindromeCheckerApp {

    // Recursive function
    public static boolean isPalindrome(String str, int left, int right) {
        // Base condition
        if (left >= right) {
            return true;
        }

        // Check mismatch
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String input = "madam";

        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}