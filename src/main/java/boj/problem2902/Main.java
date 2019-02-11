package boj.problem2902;

/**
 * https://www.acmicpc.net/problem/2902
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("-");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i].charAt(0));
        }
        System.out.println(sb);
    }
}
