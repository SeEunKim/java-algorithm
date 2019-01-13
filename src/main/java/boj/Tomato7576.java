package boj;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Tomato7576 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int M = Integer.parseInt(str[0]);
        int N = Integer.parseInt(str[1]);

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            str = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }
        BFS(arr, N, M);
    }

    public static void BFS(int[][] arr, int N, int M) {
      //  print(arr, N, M);
        Queue<Point> q = new LinkedList<Point>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 1) {
                    // 익은 토마토가 있는 모든 위치를 큐에 담는다.
                    q.add(new Point(i, j));

                }
            }
        }

        while (!q.isEmpty()) {
            // 익은 토마토의 상하좌우는 다음에 익기 때문에 큐에 담아야 한다.
            Point p = q.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = p.x + dx[i];
                int nextY = p.y + dy[i];

                if (isInRange(nextX, nextY, N, M)) {
                    // 다음 위치가 익지 않은 토마토가 아니면 패스
                    if (arr[nextX][nextY] != 0) {
                        continue;
                    }

                    // 최대 일수를 구하기 때문에 1로 바뀌는 것이 아니라 현재 일수 +1 을 해줘야 한다.
                    arr[nextX][nextY] = arr[p.x][p.y] + 1;
                    q.add(new Point(nextX, nextY));
                }
            }
         //   print(arr, N, M);
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 0) {
                    // 토마토가 모두 익지 못한 상황이라면 -1을 출력한다.
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, arr[i][j]);
            }
        }
        System.out.println(max - 1);
    }

    public static void print(int[][] arr, int N, int M) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isInRange(int x, int y, int N, int M) {
        return (0 <= x && x < N) && (0 <= y && y < M);
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}