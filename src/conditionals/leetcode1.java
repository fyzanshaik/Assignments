package conditionals;

import java.util.Scanner;

public class leetcode1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int product = 1;
        int sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            product = product * remainder;
            sum = sum + remainder;
            n = n / 10;
        }
        System.out.println("product of digits = " + product);
        System.out.println("sum of digits = " + sum);
        System.out.println(product - sum);


    }


}
