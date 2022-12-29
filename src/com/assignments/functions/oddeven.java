package com.assignments.functions;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to check it's nature: ");
        int number = in.nextInt();
        boolean ans = oddevencheck(number);
        if (ans) {
            System.out.println("Is is even");
        } else {
            System.out.println("It is odd");
        }
    }
    static boolean oddevencheck(int num) {
        return num % 2 == 0;
    }
}
