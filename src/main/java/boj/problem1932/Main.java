package boj.problem1932;

import java.io.*;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-03
 * Time: 21:08
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            //System.out.println(Arrays.toString(str));
            for (int j = 0; j <= i; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        int[][] result = new int[n][n];

        result[0][0] = arr[0][0];
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i - 1 ; j++) {
                int a = result[i - 1][j - 1] + arr[i][j];
                int b = result[i - 1][j] + arr[i][j];
                result[i][j] = Math.max(a, b);
            }
            result[i][0] += result[i - 1][0] + arr[i][0];
            result[i][i] += result[i - 1][i - 1] + arr[i][i];
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, result[n - 1][i]);
        }
        System.out.println(max);
    }
}
