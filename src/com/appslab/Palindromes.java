package com.appslab;

public class Palindromes {



    public void checkPalindrome(String palindrome){
        String original, reverse = "";
        original = palindrome;

        int length = original.length();

        for (int i = length - 1; i >= 0; i--){
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)){
            System.out.println("Entered string is a Palindrome");
        }
        else {
            System.out.println("Entered string in not Palindrome");
        }
    }
}
