package conditionals;

import java.util.Scanner;

public class triangle2 {
    public static void main(String[] args) {
        //q: Area of triangle using 3 sides:

        // Area = under root ( s(s-a)(s-b)(s-c)

        Scanner in = new Scanner(System.in);
        double side1 = in.nextDouble();
        double side2 = in.nextDouble();
        double side3 = in.nextDouble();
        double s = (side1+side2+side3)/2;

        double Area = Math.sqrt(s * (s - side1) * (s -side2) *(s - side3 ));

        System.out.println(Area);

    }
}
