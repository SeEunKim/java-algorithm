package boj.problem5525;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/5525
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int strLength = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();

        //문자열 만들기
        StringBuilder sb= new StringBuilder();
        sb.append("I");
        for (int i = 0; i < n; i++) {
            sb.append("OI");
        }

        int result = kmp(str, sb.toString(), strLength);
        System.out.println(result);

    }

    public static int kmp(String origin, String target, int originLength) {
        int cnt = 0;
        // pi 만들기
        int[] pi = new int[target.length()];
        for (int i = 1, j = 0; i < target.length(); i++) {
            while (j > 0 && target.charAt(i) != target.charAt(j)) {
                j = pi[j - 1];
            }

            if (target.charAt(i) == target.charAt(j)) {
                pi[i] = ++j;
            }
        }

        for (int i = 0, j = 0; i < originLength; i++) {
            while (j > 0 && origin.charAt(i) != target.charAt(j)) {
                j = pi[j - 1];
            }

            if (origin.charAt(i) == target.charAt(j)) {
                if (j == target.length() - 1) {
                    j = pi[j];
                    cnt++;
                }
                j++;
            }
        }
        return cnt;
    }
}
