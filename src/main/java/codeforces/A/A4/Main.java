package codeforces.A.A4;

import java.util.Scanner;

/**
 * https://codeforces.com/contest/4/problem/A
 * A. Watermelon
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();

        if (((weight % 2) == 1) || weight == 2) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
