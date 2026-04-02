public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "madam";

        // Step 1: Convert to char array
        char[] chars = original.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        // Step 2: Two-pointer comparison
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Step 3: Display result
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}