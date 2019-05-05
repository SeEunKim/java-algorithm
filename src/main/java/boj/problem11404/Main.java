package boj.problem11404;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by SeEun Kim.
 * Date: 2019-05-05
 * Time: 17:15
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int city = Integer.parseInt(br.readLine());
        int bus = Integer.parseInt(br.readLine());
        int[][] map = new int[101][101];

        for (int i = 1; i <= city; i++) {
            for (int j = 1; j <= city; j++) {
                if (i != j) {
                    map[i][j] = 10000001;
                }
            }
        }

        int from;
        int to;
        int distance;

        for (int i = 1; i <= bus; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            from = Integer.parseInt(st.nextToken());
            to = Integer.parseInt(st.nextToken());
            distance = Integer.parseInt(st.nextToken());
            if (distance < map[from][to]) {
                map[from][to] = distance;
            }
        }

        for (int k = 1; k <= city; k++) {
            for (int i = 1; i <= city; i++) {
                for (int j = 1; j <= city; j++) {
                    map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
                }
            }
        }

        for (int i = 1; i <= city; i++) {
            for (int j = 1; j <= city; j++) {
                if (map[i][j] < 10000001) {
                    System.out.print(map[i][j]);
                }
                else {
                    System.out.print("0");
                }

                if (j < city) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
