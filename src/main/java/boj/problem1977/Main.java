package boj.problem1977;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        double m = Math.sqrt(M);
        double n = Math.sqrt(N);

        double mm = Math.ceil(m);
        double nn = Math.floor(n);

        int sum = 0;
        for (double i = mm; i <= nn; i++) {
            sum += i * i;
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(String.format("%.0f", mm * mm));
        }
    }
}
