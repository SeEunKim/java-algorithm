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



    }
    public static void game() throws IOException {


        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int countOfBug = Integer.parseInt(st.nextToken());

        Boolean[][] visited = new Boolean[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                visited[i][j] = false;
            }
        }

        Queue<Point> q = new LinkedList<>();

        for (int i = 0; i < countOfBug; i++) {
            st = new StringTokenizer(br.readLine());
            q.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

    }
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
}
