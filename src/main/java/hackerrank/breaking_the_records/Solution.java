package hackerrank.breaking_the_records;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution {
    static int[] breakingRecords(int[] scores) {
        int preMax = scores[0];
        int preMin = scores[0];
        int max;
        int min;
        int maxCount = 0;
        int minCount = 0;

        for (int i = 1; i < scores.length; i++) {
            max = Math.max(preMax, scores[i]);
            min = Math.min(preMax, scores[i]);

            if (max > preMax) {
                maxCount++;
                preMax = max;
            }

            if (min < preMin) {
                minCount++;
                preMin = min;
            }
        }
        int[] answer = new int[2];
        answer[0] = maxCount;
        answer[1] = minCount;
        return answer;

    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
