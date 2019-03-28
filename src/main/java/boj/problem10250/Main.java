package boj.problem10250;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/10250
 * ACM 호텔
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            String[] hwn = sc.nextLine().split(" ");
            int h = Integer.parseInt(hwn[0]);
            int w = Integer.parseInt(hwn[1]);
            int n = Integer.parseInt(hwn[2]);

            n--;

            int floor = n % h + 1;
            int room = n / h + 1;

            StringBuilder sb = new StringBuilder();
            sb.append(floor);
            sb.append(String.format("%02d", room));
            System.out.println(sb);
        }
    }
}
