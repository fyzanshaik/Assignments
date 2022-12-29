package com.assignments.functions;

import java.util.Scanner;

public class sum2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num1 = in.nextInt();
        System.out.print("Enter number: ");
        int num2 = in.nextInt();
        int ans = sum(num1 , num2);
        System.out.println("Sum of both numbers = " + ans);
        }

        static int sum(int a,int b) {
        return a + b;
    }
}
