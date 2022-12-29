package com.assignments.functions;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check: ");
        int number = input.nextInt();
        boolean ans = primed(number);
        if (ans) {
            System.out.println("Yes " + number + " is a prime number");
        } else {
            System.out.println("No " + number + " is not a prime number");
        }
    }
    static boolean primed(int a) {
        if (a<=1) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if ( a % i == 0) {
                return false;
            }
        }

        return true;



        }



}