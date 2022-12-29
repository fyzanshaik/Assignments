package com.assignments.functions;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find it's factorial: ");
        int number = in.nextInt();
        int factorial = fact(number);
        System.out.println("Factorial of " + number+ " is " + factorial);
    }
    static int fact(int a) {
        int fact = 1;
        for (int i = 1; i <= a ; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
