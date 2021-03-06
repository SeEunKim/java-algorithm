package codeforces.A.A1;

import java.util.Scanner;

/**
 * https://codeforces.com/contest/1/problem/A
 * A. Theatre Square
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double m = sc.nextInt();
        double a = sc.nextInt();

        double width = Math.ceil(n / a);
        double height = Math.ceil(m / a);
        Double result = width * height;
        String str = String.valueOf(String.format("%.0f", result));
        System.out.println(str);
    }
}
