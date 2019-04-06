package boj.problem2156;

import java.io.*;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-06
 * Time: 23:25
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] maxArr = new int[n + 1];
        maxArr[1] = arr[1];

        if (arr.length - 1 >= 2) {
            maxArr[2] = maxArr[1] + arr[2];
        }

        for (int i = 3; i <= n; i++) {
            maxArr[i] = Math.max(maxArr[i - 3] + arr[i - 1] + arr[i],
                    Math.max(maxArr[i - 1], maxArr[i - 2] + arr[i]));
        }
        bw.write(String.valueOf(maxArr[n]));
        bw.close();
        br.close();
    }
}
