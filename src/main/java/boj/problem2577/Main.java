package boj.problem2577;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2577
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());

        int[] arr = new int[10];

        double result = a * b * c;
        String str = String.valueOf(String.format("%.0f", result));

        for (int i = 0; i < str.length(); i++) {
            int tmp = Integer.parseInt(String.valueOf(str.charAt(i)));
            arr[tmp] = arr[tmp] + 1;
        }

        for (int i1 : arr) {
            System.out.println(i1);
        }
    }
}
