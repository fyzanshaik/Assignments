package conditionals;

import java.util.Scanner;

public class input1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            max = Math.max(max, num);
        }
        System.out.println("Maximum number is " + max);

    }
    }

