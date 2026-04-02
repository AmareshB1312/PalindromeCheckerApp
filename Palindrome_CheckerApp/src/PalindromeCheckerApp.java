public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "madam";
        String reversed = "";

        // Step 1: Reverse using loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Step 2: Compare strings
        if (original.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}