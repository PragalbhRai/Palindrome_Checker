import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "madam";

        PalindromeStrategy strategy;

        // Choose strategy at runtime
        strategy = new StackStrategy();
        System.out.println("Using Stack Strategy: " + strategy.isPalindrome(word));

        strategy = new DequeStrategy();
        System.out.println("Using Deque Strategy: " + strategy.isPalindrome(word));
    }
}

/* Strategy Interface */
interface PalindromeStrategy {
    boolean isPalindrome(String word);
}

/* Stack-based Strategy */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String word) {
        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        for (char c : word.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

/* Deque-based Strategy */
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String word) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}