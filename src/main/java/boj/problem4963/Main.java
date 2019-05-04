package boj.problem4963;

import java.util.Scanner;

/**
 * Created by SeEun Kim.
 * Date: 2019-05-04
 * Time: 11:40
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        Solution s = new Solution();

        while (!input[0].equals("0") && !input[1].equals("0")) {
            int w = Integer.parseInt(input[0]);
            int h = Integer.parseInt(input[1]);

            int[][] map = new int[h][w];

            for (int i = 0; i < h; i++) {
                input = sc.nextLine().split(" ");
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(input[j]);
                }
            }

            int result = s.solution(map);
            System.out.println(result);

            input = sc.nextLine().split(" ");
        }
    }
}

class Solution {
    static private int w;
    static private int h;
    static private boolean[][] visited;
    static private int[][] map;
    public int solution(int[][] arr) {

        w = arr[0].length;
        h = arr.length;

        map = arr;

        visited = new boolean[h][w];
        int result = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    result++;
                    dfs(i, j);
                }
            }
        }
        return result;
    }

    private void dfs(int i, int j) {
        int[] dx = {-1, 0, 1, 0, -1, 1, -1, 1};
        int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};

        for (int k = 0; k < 8; k++) {
            int newI = dx[k] + i;
            int newJ = dy[k] + j;

            if ((isRange(newI, newJ)) && (!visited[newI][newJ]) && (map[newI][newJ] == 1)) {
                visited[newI][newJ] = true;
                dfs(newI, newJ);
            }
        }
    }

    private boolean isRange(int i, int j) {
        return (0 <= i && i < h && 0 <= j && j < w);
    }
}
