package com.assignments.functions;

import java.util.Scanner;

public class voteage {
    public static void main(String[] args) {
        //Program that takes input and checks for eligibility to vote:
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        boolean verify = votecheck(age);
        if (verify) {
            System.out.println("Yes he/she are eligible to vote!");
        }
        else {
            System.out.println("No he/she are not eligible to vote!");
        }
    }
    static boolean votecheck(int num) {
        return num >= 18;
    }
}
