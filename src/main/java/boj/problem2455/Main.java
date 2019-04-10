package boj.problem2455;

import java.util.Scanner;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-10
 * Time: 12:46
 *
 * https://www.acmicpc.net/problem/2455
 * 지능형 기차
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int p = 0;
        for (int i = 0; i < 4; i++) {
            String[] people = sc.nextLine().split(" ");
            p = p - Integer.parseInt(people[0]) + Integer.parseInt(people[1]);
            max = Math.max(max, p);
        }
        System.out.println(max);
    }
}
