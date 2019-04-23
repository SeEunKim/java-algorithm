package boj.problem2667;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-23
 * Time: 14:31
 */
public class Main {
    static int[][] map;
    static int[] count;
    static int n = 0;
    static int cnt = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(str.charAt(j) + "");
            }
        }

        solution();
        System.out.println(cnt - 1);
        Arrays.sort(count);

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println(count[i]);
            }
        }
    }
    private static void solution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    DFS(i, j, ++cnt);
                }
            }
        }

        count = new int[cnt];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] > 1) {
                    count[map[i][j] - 2]++;
                }
            }
        }
    }
    static int[] goX = {-1, 0, 1, 0};
    static int[] goY = {0, 1, 0, -1};
    private static void DFS(int a, int b, int k) {
        map[a][b] = k;

        for (int i = 0; i < 4; i++) {
            int dx = a + goX[i];
            int dy = b + goY[i];

            if ((-1 < dx && dx < n) && (-1 < dy && dy < n) && map[dx][dy] == 1) {
                DFS(dx, dy, k);
            }
        }
    }
}
