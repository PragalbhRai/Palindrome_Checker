public class PalindromeCheckerApp {

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        String word = "madam";

        if (checker.checkPalindrome(word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}

// Service class that encapsulates palindrome logic
class PalindromeChecker {

    public boolean checkPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}