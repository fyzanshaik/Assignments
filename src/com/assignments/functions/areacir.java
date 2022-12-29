package com.assignments.functions;

import java.util.Scanner;

public class areacir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER RADIUS: ");
        double radius = in.nextDouble();
        double area = areaofcir((int) radius);
        double circumference = circum((int)radius);
        System.out.println("Area of circle: " + area);
        System.out.print("Circumference of circle: " + circumference);
    }
    static double areaofcir(int a) {
        return 3.14 * a * a;
    }
    static double circum(int b) {
        return 2 * 3.14 * b;
    }
}
