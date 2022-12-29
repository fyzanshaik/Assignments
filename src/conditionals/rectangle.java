package conditionals;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        System.out.print("Enter length and breadth: ");
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int breadth = in.nextInt();

        int area = length * breadth;

        System.out.println(area);

    }
}
