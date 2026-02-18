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
    }

    // UC2: Hardcoded Palindrome (Half Comparison Method)
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

        // Reverse using loop
        for (int i = input.length() - 1; i >= 0; i--) {

            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed
        boolean isPalindrome = input.equals(reversed);

        System.out.println("UC3: Palindrome Check Using String Reverse");
        System.out.println("Input : " + input);
        System.out.println("Reversed : " + reversed);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println();
    }
}
