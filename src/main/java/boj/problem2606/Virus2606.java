package boj.problem2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Virus2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfComputers = Integer.parseInt(br.readLine());
        int numberOfPairs = Integer.parseInt(br.readLine());
        StringTokenizer st;

        boolean[][] pair = new boolean[numberOfComputers + 1][numberOfComputers + 1];
        boolean[] visited = new boolean[numberOfComputers + 1];

        for (int i = 0; i < numberOfPairs; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            pair[x][y] = true;
            pair[y][x] = true;
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;

        while(!q.isEmpty()) {
            int tmp = q.poll();
            for (int i = 0; i <= numberOfComputers; i++) {
                if (pair[tmp][i] && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
        int cnt = 0;
        for (int i = 2; i <= numberOfComputers; i++) {
            if (visited[i]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
