import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {

        // UC1
        System.out.println("==============================================");
        System.out.println("   Welcome to the Palindrome Checker App");
        System.out.println("   Version : 1.0");
        System.out.println("   System initialized successfully.");
        System.out.println("==============================================\n");

        uc2_HardcodedPalindrome();
        uc3_StringReverse();
        uc4_CharArrayMethod();
        uc5_StackMethod();
        uc6_QueueStackMethod();
        uc7_DequeMethod();
        uc8_LinkedListMethod();
    }

    // UC2
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

    // UC3
    public static void uc3_StringReverse() {
        String input = "level";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("UC3 Input : " + input);
        System.out.println("Is Palindrome? : " + input.equals(reversed) + "\n");
    }

    // UC4
    public static void uc4_CharArrayMethod() {
        String input = "radar";
        char[] arr = input.toCharArray();

        int start = 0, end = arr.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (arr[start++] != arr[end--]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC4 Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome + "\n");
    }

    // UC5
    public static void uc5_StackMethod() {
        String input = "noon";
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray())
            stack.push(c);

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC5 Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome + "\n");
    }

    // UC6
    public static void uc6_QueueStackMethod() {
        String input = "civic";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC6 Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome + "\n");
    }

    // UC7
    public static void uc7_DequeMethod() {
        String input = "refer";
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray())
            deque.add(c);

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC7 Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome + "\n");
    }

    // ================= UC8 =================

    // Node class for Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // UC8
    public static void uc8_LinkedListMethod() {

        String input = "madam";

        // Convert string to linked list
        Node head = null, tail = null;
        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Find middle using slow & fast pointers
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node prev = null;
        while (slow != null) {
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Compare both halves
        Node first = head;
        Node second = prev;
        boolean isPalindrome = true;

        while (second != null) {
            if (first.data != second.data) {
                isPalindrome = false;
                break;
            }
            first = first.next;
            second = second.next;
        }

        System.out.println("UC8 Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome + "\n");
    }
}
