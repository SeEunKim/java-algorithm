package boj.problem11724;

import java.util.Scanner;

/**
 * Created by SeEun Kim.
 * Date: 2019-05-11
 * Time: 23:01
 */
public class Main {
    private static int[][] graph;
    private static boolean[] visited;
    private static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();

        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = graph[y][x] = 1;
        }

        int cnt = 1;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                cnt++;
            }
        }
        System.out.println(cnt - 1);
    }

    private static void dfs(int x) {
        visited[x] = true;

        for (int i = 1; i <= N; i++) {
            if ((!visited[i]) && (graph[x][i] == 1)) {
                dfs(i);
            }
        }
    }
}
