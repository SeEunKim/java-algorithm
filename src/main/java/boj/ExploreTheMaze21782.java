package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExploreTheMaze21782 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }
        print(arr, N, M);
    }

    public static void print(int[][] arr, int N, int M) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[N][M] + " ");
            }
            System.out.println();
        }
    }
}

class Point21782 {
    int x;
    int y;

    public Point21782(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
