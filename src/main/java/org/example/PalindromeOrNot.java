package org.example;

public class PalindromeOrNot {
    public static void main(String[] args) {
        isPalindrome(12241);
    }

    public static void isPalindrome(Integer in){
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(in));
        String reversed = stringBuilder.reverse().toString();
        if (String.valueOf(in).equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
