package boj.problem1012;


import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1012
 */
public class Main {
    static BufferedReader br;
    static Boolean[][] visited;
    static int[][] map;
    static int M;
    static int N;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int countOfGames = Integer.parseInt(br.readLine());
        for (int i = 0; i < countOfGames; i++) {
            game();
        }
    }
    public static void game() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int countOfBug = Integer.parseInt(st.nextToken());

        visited = new Boolean[M][N];
        map = new int[M][N];

        for (int i = 0; i < countOfBug; i++) {
            st = new StringTokenizer(br.readLine());
            map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                visited[i][j] = false;
            }
        }

        int cnt = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    DFS(i, j);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }

    public static void DFS(int x, int y) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (0 <= newX && newX < M && 0 <= newY && newY < N) {
                if (map[newX][newY] == 1 && !visited[newX][newY]) {
                    DFS(newX, newY);
                }
            }
        }
    }
}