package boj.problem1912;

import java.io.*;
import java.util.Arrays;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-07
 * Time: 22:36
 *
 * https://www.acmicpc.net/problem/1912
 * 연속합
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] ns = br.readLine().split(" ");
        int[] arr = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(ns[i]);
        }

        d[0] = arr[0];

        for (int i = 1; i < n; i++) {
            d[i] = Math.max(arr[i], arr[i] + d[i - 1]);
        }

        int max = Arrays.stream(d).max().getAsInt();
        bw.write(String.valueOf(max));
        bw.close();
        br.close();
    }
}
