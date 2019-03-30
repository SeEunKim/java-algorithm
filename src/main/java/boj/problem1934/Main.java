package boj.problem1934;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1934
 * 최소공배수
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseCount = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < caseCount; i++) {
            String[] ab = sc.nextLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);

            System.out.println(lcm(a, b));
        }
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
