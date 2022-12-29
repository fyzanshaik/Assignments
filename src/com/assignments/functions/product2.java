package com.assignments.functions;

import java.util.Scanner;

public class product2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num1 = in.nextInt();
        System.out.print("Enter number: ");
        int num2 = in.nextInt();
        int ans = product(num1 , num2);
        System.out.print("product of both numbers = " + ans);
    }

    static int product(int a,int b) {
        return a * b;
    }
}
