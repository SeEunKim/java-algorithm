package boj.problem1149;

import java.io.*;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-02
 * Time: 12:19
 *
 * https://www.acmicpc.net/problem/1149
 * RGB거리
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] distance = new int[n + 1][3];
        int[][] cost = new int[n + 1][3];

        for (int i = 0; i < n; i++) {
            String[] rgb = br.readLine().split(" ");
            int r = Integer.parseInt(rgb[0]);
            int g = Integer.parseInt(rgb[1]);
            int b = Integer.parseInt(rgb[2]);
            cost[i][0] = r;
            cost[i][1] = g;
            cost[i][2] = b;
        }

        for (int i = 1; i <= n; i++) {
            cost[i][0] = Math.min(cost[i-1][1], cost[i-1][2]) + cost[i][0];
            cost[i][1] = Math.min(cost[i-1][0], cost[i-1][2]) + cost[i][1];
            cost[i][2] = Math.min(cost[i-1][0], cost[i-1][1]) + cost[i][2];
        }

        int minimumCost = Math.min(cost[n][0], Math.min(cost[n][1], cost[n][2]));
        bw.write(String.valueOf(minimumCost));
        bw.flush();
        bw.close();
        br.close();
    }
}
