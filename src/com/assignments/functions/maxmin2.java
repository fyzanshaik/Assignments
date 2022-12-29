package com.assignments.functions;

import java.util.Scanner;

public class maxmin2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = in.nextInt();
        System.out.print("Enter number 2: ");
        int b = in.nextInt();
        System.out.print("Enter number 3: ");
        int c = in.nextInt();
        int maximum = max(a, b, c);
        int minimum = min(a, b, c);
        System.out.println("Maximum value: " + maximum);
        System.out.println("Minimum Value: " + minimum);

    } // 6 5 7

    static int max(int a, int b, int c) {
        if (a > b) {
            return Math.max(a, c);
        } else {
            return Math.max(b, c);
        }
    }

    static int min(int a, int b, int c) {
        if (a < b) {
            return Math.min(a, c);
        } else {
            return Math.min(b, c);
        }
    }
}