package boj.problem1003;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/1003
 * 피보나치 함수
 */

public class Main {
    private static int[] fibonacciArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int tmp = Integer.parseInt(br.readLine());

            fibonacciArr = new int[40 + 1];

            if (tmp == 0) {
                bw.write(String.valueOf(1));
            } else if (tmp == 1) {
                bw.write(String.valueOf(0));
            } else {
                bw.write(String.valueOf(fibonacci(tmp - 1)));
            }
            bw.write(" ");
            bw.write(String.valueOf(fibonacci(tmp)));
            bw.flush();
            bw.newLine();
        }
        bw.close();
    }

    private static int fibonacci(int n) {

        if (n == 0) {
            fibonacciArr[n] = 0;
            return fibonacciArr[n];
        }

        if (n == 1) {
            fibonacciArr[n] = 1;
            return fibonacciArr[n];
        }

        if (fibonacciArr[n] != 0) {
            return fibonacciArr[n];
        }

        fibonacciArr[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return fibonacciArr[n];
    }
}
