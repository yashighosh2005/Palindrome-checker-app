import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class palindromechecker {
    public static void main(String[] args) {

        // UC1
        System.out.println("   Welcome to the Palindrome Checker App");
        System.out.println("   Version : 1.0");
        System.out.println("   System initialized successfully.");

        uc2_HardcodedPalindrome();
        uc3_StringReverse();
    }

    public static void uc2_HardcodedPalindrome() {
        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC2 Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome + "\n");
    }
    public static void uc3_StringReverse() {
        String input = "level";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("UC3 Input : " + input);
        System.out.println("Is Palindrome? : " + input.equals(reversed) + "\n");
    }
}
