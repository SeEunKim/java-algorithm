package codeforces.B.B1097;

import java.util.Scanner;

/**
 * https://codeforces.com/contest/1097/problem/B
 * B. Petr and a Combination Lock
 */

public class Main {
    private static int[] numbers;
    private static boolean flag;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbersOfInput = sc.nextInt();
        numbers = new int[numbersOfInput];
        flag = false;

        for (int i = 0; i < numbersOfInput; i++) {
            numbers[i] = sc.nextInt();
        }

        DFS(0, 0);

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void DFS(int x, int sum) {
        if (x == numbers.length) {
            if ((sum % 360) == 0) {
                flag = true;
            }
            return;
        }

        DFS(x + 1, sum + numbers[x]);
        DFS(x + 1, sum - numbers[x]);
    }
}
