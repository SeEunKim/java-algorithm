package boj.problem5567;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by SeEun Kim.
 * Date: 2019-05-12
 * Time: 19:26
 */
public class Main {
    private static int[][] graph;
    private static boolean[] visited;
    private static boolean[] result;
    private static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];
        result = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            graph[x][y] = graph[y][x] = 1;
        }

        int cnt = 1;
        for (int i = 1; i <= N ; i++) {
                dfs(1, cnt);
                cnt = 1;
                for (int j = 0; j < N; j++) {
                    visited[i] = false;
                }
        }

        int count = 0;
        for (boolean b : result) {
            if (b) {
                count++;
            }
        }
        System.out.println(Arrays.toString(result));
        System.out.println(count);
    }

    private static void dfs(int i, int cnt) {
        visited[i] = true;

        for (int j = 1; j <= N ; j++) {
            if (graph[i][j] == 1 && !visited[j] && cnt < 3) {
                result[j] = true;
                cnt = cnt + 1;
                dfs(j, cnt);
            }
        }
    }
}
