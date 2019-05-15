package boj.problem17128;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by SeEun Kim.
 * Date: 2019-05-15
 * Time: 23:11
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int Q = Integer.parseInt(input[1]);

        int[] cows = new int[N + 1];
        input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            cows[i + 1] = Integer.parseInt(input[i]);
        }

        int[] wookCows = new int[Q];
        input = br.readLine().split(" ");
        for (int i = 0; i < Q; i++) {
            wookCows[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < Q; i++) {
            cows[wookCows[i]] = cows[wookCows[i]] * -1;

            int sum = 0;
            int index;
            for (int j = 1; j <= N; j++) {
                index = j;
                int cow1 = cows[index];
                index++;
                if (index > N) {
                    index = 1;
                }
                int cow2 = cows[index];
                index++;
                if (index > N) {
                    index = 1;
                }
                int cow3 = cows[index];
                index++;
                if (index > N) {
                    index = 1;
                }
                int cow4 = cows[index];

                sum += cow1 * cow2 * cow3 * cow4;
            }
            System.out.println(sum);
        }
    }
}
