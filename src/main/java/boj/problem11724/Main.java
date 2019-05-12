package boj.problem11724;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/**
 * Created by SeEun Kim.
 * Date: 2019-05-11
 * Time: 23:01
 */
public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int M = sc.nextInt();

        int[][] graph = new int[n + 1][n + 1];
        boolean[] visited = new boolean[n + 1];
        Queue queue = new LinkedList();

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = graph[y][x] = 1;
        }

        for (int i = 2; i <= n; i++) {
            if (graph[1][i] == 1) {
                visited[i] = true;
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()) {
            int c = (int)queue.poll();
            for (int i = 2; i <= n; i++) {
                if (graph[c][i] == 1 && !visited[i]) {
                    visited[i] = true;
                }
            }
        }

        int count = 0;
        for (boolean b : visited) {
            if(b) {
                count++;
            }
        }
        System.out.println(count);
    }
}
