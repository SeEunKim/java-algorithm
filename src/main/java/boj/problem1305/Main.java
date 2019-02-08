package boj.problem1305;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = Integer.parseInt(sc.nextLine());
        String p = sc.nextLine();

        int j = 0;
        int[] pi = new int[p.length()];
        for (int i = 1; i < p.length(); i++) {
            while (j > 0 && p.charAt(i) != p.charAt(j)) {
                j = pi[j - 1];
            }

            if (p.charAt(i) == p.charAt(j)) {
                pi[i] = ++j;
            }
        }

        j = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(p);
        sb.append(p);
        String t = sb.toString();
        for (int i = 0; i < t.length(); i++) {
            while (j > 0 && t.charAt(i) != p.charAt(j)) {
                j = pi[j - 1];
            }

            if (t.charAt(i) == p.charAt(j)) {
                if(i == p.length() - 1) {
                    //todo 못품
                }
            }

        }

        System.out.println(Arrays.toString(pi));
    }
}
