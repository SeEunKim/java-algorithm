package joonggo.Q1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    private static int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
    private static int[] dy = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
    public static int m;
    public static int n;
    public static String[][] result;
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] mn = scanner.nextLine().split(" ");
        m = Integer.parseInt(mn[0]);
        n = Integer.parseInt(mn[1]);
        boolean[][] isLandmines = new boolean[m][n];
        result = new String[m][n];

        for (int i = 0; i < m; i++) {
            String[] line = scanner.nextLine().split("");
            for (int j = 0; j < n; j++) {
                if (line[j].equals("*")) {
                    isLandmines[i][j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                searchLandmines(isLandmines, i, j);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isLandmines[i][j]) {
                    result[i][j] = "*";
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(result[i][j]);
            }
            bw.newLine();
        }

        bw.close();
        scanner.close();

    }

    private static void searchLandmines(boolean[][] isLandmines, int x, int y) {
        int count = 0;
        for (int i = 0; i < dx.length; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (isInRange(nextX, nextY)) {
                if (isLandmines[nextX][nextY]) {
                    count++;
                }
            }
        }
        result[x][y] = String.valueOf(count);
    }

    private static boolean isInRange(int nextX, int nextY) {
        return ((0 <= nextX && nextX < m) && (0 <= nextY && nextY < n));
    }


}
