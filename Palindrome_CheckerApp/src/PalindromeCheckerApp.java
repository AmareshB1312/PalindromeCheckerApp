import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "madam";

        Stack<Character> stack = new Stack<>();

        // Step 1: Push characters into stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        boolean isPalindrome = true;

        // Step 2: Pop and compare
        for (int i = 0; i < original.length(); i++) {
            char ch = stack.pop();
            if (ch != original.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }

        // Step 3: Print result
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}