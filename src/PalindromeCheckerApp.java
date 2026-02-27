public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        // Normalize string: remove spaces & make lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = normalized.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome (ignoring case & spaces)");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}