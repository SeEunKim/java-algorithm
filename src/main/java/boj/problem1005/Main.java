package boj.problem1005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-12
 * Time: 13:12
 *
 * https://www.acmicpc.net/problem/1005
 * ACM Craft
 */
public class Main {
    public static LinkedList<Integer> graph[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String line[] = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);

            int[] buildTime = new int[n];
            int[] result = new int[n];
            line = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                buildTime[j] = Integer.parseInt(line[j]);
            }

            graph = new LinkedList[n];

            for (int j = 0; j < n; j++) {
                graph[j] = new LinkedList<>();
            }
            int[] indegree = new int[n];
            for (int j = 0; j < m; j++) {
                line = br.readLine().split(" ");
                int from = Integer.parseInt(line[0]) - 1;
                int to = Integer.parseInt(line[1]) - 1;
                graph[from].add(to);
                indegree[to]++;
            }

            for (int j = 0; j < graph.length; j++) {
                System.out.println(graph[j]);
            }

            Queue<Integer> searchQ = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                if(indegree[j] == 0) {
                    searchQ.offer(i);
                }
            }

            for (int j = 0; j < n; j++) {
                result[j] = buildTime[j];
            }

            while(!searchQ.isEmpty()) {
                int zeroIndegree = searchQ.poll();

                for(int linkNode : graph[zeroIndegree]) {
                    indegree[linkNode]--;
                    result[linkNode] = Math.max(result[linkNode], result[zeroIndegree] + buildTime[linkNode]);
                    if(indegree[linkNode] == 0) {
                        searchQ.offer(linkNode);
                    }
                    System.out.println(Arrays.toString(result));
                }
            }
            int w = Integer.parseInt(br.readLine());
            //System.out.println(Arrays.toString(result));
        }
    }

}
