package boj.problem6603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int[] visited;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            arr = new int[N];
            visited = new int[N];

            if (N == 0) {
                break;
            }

            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            DFS(0, 0);
            System.out.println();
        }
    }

    public static void DFS (int start, int depth) {
        if (depth == 6) {
            print();
        }

        for (int i = start; i < N; i++) {
            visited[i] = 1;
            DFS(i + 1, depth + 1);
            visited[i] = 0;
        }
    }

    public static void print() {
        for (int i = 0; i < N; i++) {
            if (visited[i] == 1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
