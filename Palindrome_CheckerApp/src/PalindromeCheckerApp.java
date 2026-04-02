import java.util.Stack;

class PalindromeChecker {

    // Public method to check palindrome
    public boolean checkPalindrome(String input) {
        String normalized = preprocess(input);
        return isPalindrome(normalized);
    }

    // Encapsulated preprocessing logic
    private String preprocess(String input) {
        return input.replaceAll("\\s+", "").toLowerCase();
    }

    // Internal palindrome logic using Stack
    private boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        // Compare with original order
        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Demo class
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();

        String input = "Never odd or even";
        boolean result = checker.checkPalindrome(input);

        System.out.println(result ? "Palindrome" : "Not a Palindrome");
    }
}