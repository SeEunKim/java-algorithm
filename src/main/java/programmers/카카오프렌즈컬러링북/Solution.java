package programmers.카카오프렌즈컬러링북;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-25
 * Time: 14:31
 *
 * https://programmers.co.kr/learn/courses/30/lessons/1829
 *
 */
class Solution {
    private static boolean[][] visited;
    private static int M;
    private static int N;
    static int[][] map;
    static int maxSizeOfOneArea;
    static int count;
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        maxSizeOfOneArea = 0;

        visited = new boolean[m][n];
        M = m;
        N = n;
        map = picture;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && (map[i][j] != 0)) {
                    numberOfArea++;
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, count);
                    count = 0;
                    dfs(i, j);
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea + 1;
        return answer;
    }

    public void dfs(int x, int y) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        visited[x][y] = true;
        int color = map[x][y];

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (isRange(newX, newY) && !visited[newX][newY]) {
                if (color == map[newX][newY]) {
                    count++;
                    dfs(newX, newY);
                }
            }
        }
    }

    private boolean isRange(int x, int y) {
        return ((0 <= x) && (x < M) && (0 <= y) && (y < N));
    }
}
