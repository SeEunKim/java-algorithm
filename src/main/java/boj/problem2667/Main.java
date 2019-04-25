package boj.problem2667;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-23
 * Time: 14:31
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(str.charAt(j) + "");
            }
        }

        Solution s = new Solution();
        int[] result = s.solution(map, n);

        Arrays.sort(result);

        System.out.println(result.length - 1);

        for (int value : result) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}

class Solution {
    private static int[][] map;
    private static int n;

    public int[] solution(int[][] map, int n) {
        int cnt = 1;
        Solution.n = n;
        Solution.map = map;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    DFS(i, j, ++cnt);
                }
            }
        }

        int[] count = new int[cnt];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] > 1) {
                    count[map[i][j] - 2]++;
                }
            }
        }
        return count;
    }

    private void DFS(int a, int b, int k) {
        map[a][b] = k;
        int[] goX = {-1, 0, 1, 0};
        int[] goY = {0, 1, 0, -1};
        for (int i = 0; i < 4; i++) {
            int dx = a + goX[i];
            int dy = b + goY[i];

            if ((-1 < dx && dx < n) && (-1 < dy && dy < n) && map[dx][dy] == 1) {
                DFS(dx, dy, k);
            }
        }
    }
}