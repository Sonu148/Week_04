package com.training.day_05.junit.basicjunit;

public class StringUtils {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println("Reverse: " + reverse("hello"));        // "olleh"
        System.out.println("Palindrome: " + isPalindrome("madam")); // true
        System.out.println("Uppercase: " + toUpperCase("hello"));  // "HELLO"
    }
}
