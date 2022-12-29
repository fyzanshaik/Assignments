package com.assignments.functions;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to check whether it is a palindrome or not: ");
        int number = in.nextInt();
        int temp1 = number;
        int reverse = reverse(number);
        System.out.println("reverse of number: "+reverse);
        if (temp1 == reverse) {
            System.out.println("Yes it is a palindrome");
        } else {
            System.out.println("No it's not a palindrome");
        }
    }
    static int reverse(int a) {
        int b = 0;
        while(a!=0) {
            int remainder = a % 10;
            b = b*10 + remainder;
            a = a / 10;
        }
        return b;
    }


}
