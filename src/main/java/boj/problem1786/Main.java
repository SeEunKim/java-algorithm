package boj.problem1786;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1786
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        String p = sc.nextLine();

        // getPi
        int j = 0;
        int[] pi = new int[p.length()];
        for (int i = 1; i < p.length(); i++) {
            while(j > 0 && p.charAt(i) != p.charAt(j)) {
                j = pi[j - 1];
            }

            if (p.charAt(i) == p.charAt(j)) {
                pi[i] = ++j;
            }
        }

        // kmp
        j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < t.length(); i++) {
            while (j > 0 && t.charAt(i) != p.charAt(j)) {
                j = pi[j - 1];
            }

            if (t.charAt(i) == p.charAt(j)) {
                if (j == p.length() - 1) {
                    list.add(i - p.length() + 2);
                    j = pi[j];
                } else {
                    j++;
                }
            }
        }

        System.out.println(list.size());
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
