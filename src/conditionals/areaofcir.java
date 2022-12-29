package conditionals;

import java.util.Scanner;

public class areaofcir {
    public static void main(String[] args) {


        //q: Area of circle:
        System.out.println("Enter radius: ");

        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();

        int area = (int) (3.14 * radius * radius);
        System.out.println(area);

    }
}
