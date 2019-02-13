package boj.problem10797;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/10797
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = Integer.parseInt(sc.nextLine());

        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            int carNumber = sc.nextInt();
            if (day == carNumber) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
