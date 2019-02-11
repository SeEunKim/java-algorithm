package boj.problem10950;

/**
 * https://www.acmicpc.net/problem/10950
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size; i++) {
            String[] strings = sc.nextLine().split(" ");
            System.out.println(Integer.parseInt(strings[0]) + Integer.parseInt(strings[1]));
        }
    }
}
