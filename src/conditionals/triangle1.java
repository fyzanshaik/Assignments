package conditionals;

import java.util.Scanner;

public class triangle1 {
    public static void main(String[] args) {
        //q: Find area of a triangle:

        System.out.println("Enter Radius and height: ");

        Scanner in = new Scanner(System.in);
        double base = in.nextDouble();
        double height = in.nextDouble();

        double area = 0.5 * base * height;

        System.out.println(area);



    }


}
