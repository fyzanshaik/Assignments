package com.assignments;

import java.util.Scanner;

public class input0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 1;
        do {
            n = in.nextInt();
            sum += n;
        } while (n != 0);
        System.out.println(sum);


    }
}
