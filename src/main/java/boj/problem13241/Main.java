package boj.problem13241;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] ab = sc.nextLine().split(" ");
        Arrays.sort(ab);
        long a = Integer.parseInt(ab[0]);
        long b = Integer.parseInt(ab[1]);
        System.out.println(lcm(a, b));

    }

    private static long gcd(long a, long b) {
        while (b > 0) {
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    private static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }
}
