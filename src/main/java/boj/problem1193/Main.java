package boj.problem1193;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        int a = 1;
        int v1 = 1;
        int cnt = 1;
        int result = 1;

        while (true){
            if (input <= result) {
                break;
            }

            cnt++;
            if (cnt % 2 == 0) {
                v1 = input - result;
                a = cnt - v1 + 1;
            } else {
                a = input - result;
                v1 = cnt - a + 1;
            }

            for (int i = 0; i < cnt; i++) {
                result++;
            }
        }
        System.out.println(v1 + "/" + a);
    }
}
