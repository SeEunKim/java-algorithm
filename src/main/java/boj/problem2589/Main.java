package boj.problem2589;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by SeEun Kim.
 * Date: 2019-05-13
 * Time: 23:11
 */
public class Main {
    private static boolean[][] visited;
    private static int[][] map;
    private static int height;
    private static int width;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        width = sc.nextInt();
        sc.nextLine();

        map = new int[height][width];
        visited = new boolean[height][width];

        for (int i = 0; i < height; i++) {
            String[] input = sc.nextLine().split("");
            for (int j = 0; j < width; j++) {
                map[i][j] = input[j].equals("L") ? 1 : 0;
            }
        }

        int maxDistance = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (map[i][j] == 1) {
                    maxDistance = Math.max(maxDistance, bfs(i, j));
                }
            }
        }
        System.out.println(maxDistance - 1);
    }

    private static int bfs(int i, int j) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int count = 0;

        for (int k = 0; k < height; k++) {
            for (int l = 0; l < width; l++) {
                visited[k][l] = false;
            }
        }

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(i, j));
        visited[i][j] = true;

        while(!queue.isEmpty()) {
            count++;
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                Point p = queue.poll();
                for (int l = 0; l < 4; l++) {
                    int nextX = dx[l] + p.getX();
                    int nextY = dy[l] + p.getY();

                    if (0 <= nextX && nextX < height && 0 <= nextY && nextY < width) {
                        if (!visited[nextX][nextY] && map[nextX][nextY] == 1) {
                            visited[nextX][nextY] = true;
                            queue.add(new Point(nextX, nextY));
                        }
                    }

                }
            }
        }
        return count;
    }
}
class Point{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}