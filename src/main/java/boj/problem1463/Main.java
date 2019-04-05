package boj.problem1463;

import java.util.Scanner;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-05
 * Time: 11:56
 *
 * https://www.acmicpc.net/problem/1463
 * 1로 만들기
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int[] arr = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + 1;
            if (i % 2 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 2] + 1);
            }
            if (i % 3 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 3] + 1);
            }
        }

        System.out.println(arr[n]);

    }
}
