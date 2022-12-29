package conditionals;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0; // 0 1 1 2 3 5 8 13
        int b = 1;
        int count = 3;
        while (count <= n) {
            int temp = b;
            b += a;
            a = temp;
            count++;
        }
        System.out.println(b + " is the " + n + "th" + "fibonacci number of the series");
    }
}
