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
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int countOfGames = Integer.parseInt(br.readLine());
        for (int i = 0; i < countOfGames; i++) {
            game();
        }
    }
    public static void game() throws IOException {

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int countOfBug = Integer.parseInt(st.nextToken());

        Boolean[][] visited = new Boolean[M][N];
        int[][] checked = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                visited[i][j] = false;
                checked[i][j] = 0;
            }
        }

        Queue<Point> q = new LinkedList<>();

        for (int i = 0; i < countOfBug; i++) {
            st = new StringTokenizer(br.readLine());
            q.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        while (!q.isEmpty()) {
            Point p = q.poll();
            for (int i = 0; i < 4; i++) {
                int newX = dx[i] + p.getX();
                int newY = dy[i] + p.getY();
                if (0 <= newX && newX < M && 0 <= newY && newY < N && !visited[newX][newY]) {
                    checked[newX][newY] = checked[p.getX()][p.getY()] + 1;
                    visited[newX][newY] = true;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                max = Math.max(checked[i][j], max);
            }
        }

        System.out.println(max);
    }
    //todo 실패
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
