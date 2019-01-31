package boj.problem1456;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n != 0) {
            int tmp = Integer.parseInt(sc.nextLine());
            if (tmp == 0) {
                n = 0;
            }
            int result = tmp % 3;
            if (result == 0) {
                System.out.println(tmp + " is a multiple of " + n + ".");
            } else {
                System.out.println(tmp + " is NOT a multiple of " + n + ".");
            }
        }
    }
}
