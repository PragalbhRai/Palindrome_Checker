import java.util.*;
public class Palindrome_checker{
    public static void main (String args[]){
        String str;
        System.out.println("Enter a String to be checked: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        int left = 0 , right = str.length()-1;
        while(left < right){
            if(str.charAt(right) != str.charAt(left)){
                System.out.println("Entered String is not a Palindrome!");
                System.exit(0);
            }
            left++;
            right--;
        }
        System.out.println("Entered string is a Palindrome");
        sc.close();
    }
}