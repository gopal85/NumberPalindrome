package com.mistergopal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPalindrome(-232));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int count = 1;
        int compare = number;
        while (Math.abs(number) !=  0) {
            int lastDigit = number % 10; // 1. for 1221, lastDigit = 1.
            System.out.println("lastDigit = " + lastDigit);
            reverse *= 10; // 1. reverse = 10.
            System.out.println("Reverse = " + reverse);
            reverse += lastDigit; // 1. reverse = 10?.
            System.out.println("Reverse = " + reverse);
            number /= 10; // 1. number = 122.
            System.out.println("number = " + number);
            System.out.println("End of step " + count);
            count++;
        }
        if (reverse == compare) {
            return true;
        }
        return false;
    }
}
