public class PalindromeCheckerApp {

    public static void main(String[] args) {

<<<<<<< HEAD
        // UC1: Welcome Message
        System.out.println("Palindrome Checker App");
        System.out.println("Version 1.0");
        System.out.println("----------------------");

        // UC2: Hardcoded Palindrome Check
        String word = "madam";
        boolean isPalindrome = true;

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
=======
        String input = "madamimadam";

        long start, end;

        // Algorithm 1: Reverse String
        start = System.nanoTime();
        boolean result1 = isPalindromeByReverse(input);
        end = System.nanoTime();
        System.out.println("Reverse Method: " + result1 + " | Time: " + (end - start) + " ns");

        // Algorithm 2: Two Pointer
        start = System.nanoTime();
        boolean result2 = isPalindromeByTwoPointer(input);
        end = System.nanoTime();
        System.out.println("Two Pointer Method: " + result2 + " | Time: " + (end - start) + " ns");

        // Algorithm 3: Recursion
        start = System.nanoTime();
        boolean result3 = isPalindromeByRecursion(input, 0, input.length() - 1);
        end = System.nanoTime();
        System.out.println("Recursive Method: " + result3 + " | Time: " + (end - start) + " ns");
    }

    // Reverse string method
    static boolean isPalindromeByReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Two-pointer method
    static boolean isPalindromeByTwoPointer(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
>>>>>>> feature/UC13
            }
            left++;
            right--;
        }
<<<<<<< HEAD

        if (isPalindrome) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
=======
        return true;
    }

    // Recursive method
    static boolean isPalindromeByRecursion(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindromeByRecursion(str, left + 1, right - 1);
>>>>>>> feature/UC13
    }
}