package boj.problem1005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] nk = br.readLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            int[] buildingTime = new int[n + 1];
            String[] nArr = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                buildingTime[j + 1] = Integer.parseInt(nArr[j]);
            }

            Queue<Point> q = new LinkedList<>();

            for (int j = 0; j < k; j++) {
                String[] point = br.readLine().split(" ");
                q.add(Point.create(point[0], point[1]));
            }

            int[] d = new int[n + 1];
            for (int j = 1; j < d.length; j++) {
                d[j] = buildingTime[j];
            }

            while(!q.isEmpty()) {
                Point p = q.poll();
                d[p.getY()] = Math.max(d[p.getX()] + buildingTime[p.getY()], d[p.getY()]);
            }

            int w = Integer.parseInt(br.readLine());
            System.out.println(d[w]);
            System.out.println(Arrays.toString(d));
        }
    }
}
class Point {
    private int x;
    private int y;

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static Point create(String x, String y) {
        return new Point(Integer.parseInt(x), Integer.parseInt(y));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
