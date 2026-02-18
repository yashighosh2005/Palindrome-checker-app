public class Main {

    public static void main(String[] args) {

        // UC1: Welcome Message
        System.out.println("==============================================");
        System.out.println("   Welcome to the Palindrome Checker App");
        System.out.println("   Version : 1.0");
        System.out.println("   System initialized successfully.");
        System.out.println("==============================================\n");

        // UC2
        uc2_HardcodedPalindrome();

        // UC3
        uc3_StringReverse();

        // UC4
        uc4_CharArrayMethod();
    }

    // UC2: Half Comparison Method
    public static void uc2_HardcodedPalindrome() {

        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC2: Hardcoded Palindrome Check");
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println();
    }

    // UC3: Reverse String Method
    public static void uc3_StringReverse() {

        String input = "level";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        boolean isPalindrome = input.equals(reversed);

        System.out.println("UC3: Palindrome Check Using String Reverse");
        System.out.println("Input : " + input);
        System.out.println("Reversed : " + reversed);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println();
    }

    // UC4: Character Array + Two Pointer Method
    public static void uc4_CharArrayMethod() {

        String input = "radar";

        // Convert string to char array
        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("UC4: Character Array Based Palindrome Check");
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println();
    }
}
