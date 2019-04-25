package programmers.카카오프렌즈컬러링북;

import java.util.Arrays;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-25
 * Time: 14:31
 *
 * https://programmers.co.kr/learn/courses/30/lessons/1829
 *
 */
class Solution {
    static int width;
    static int height;
    static int map[][];
    static int cnt;
    static int pre = 1;
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        cnt = 1;

        height = m;
        width = n;

        map = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] != 0) {
                    int tmp = picture[i][j];
                    //map[i][j] = tmp;
                    pre = tmp;
                    cnt++;
                    DFS(i, j, tmp, picture);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(picture[i]));
        }

        System.out.println();

        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(map[i]));
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    private void DFS(int i, int j, int number, int[][] picture) {
        int[] goX = {0, 1, 0, -1};
        int[] goY = {1, 0, -1, 0};

        for (int k = 0; k < 4; k++) {
            int newX = goX[k] + i;
            int newY = goY[k] + j;

            if (isRange(newX, newY)) {
                if (picture[newX][newY] == number && (map[newX][newY] == 0)) {
                    map[newX][newY] = number;
                    DFS(newX, newY, number, picture);
                }
            }
        }

    }

    private boolean isRange(int i, int j) {
        return (0 <= i && i < height) && (0 <= j && j < width);
    }
}
