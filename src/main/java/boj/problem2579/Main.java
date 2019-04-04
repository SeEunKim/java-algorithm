package boj.problem2579;

import java.io.*;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-04
 * Time: 14:02
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
        int result = solution(arr);
        bw.write(String.valueOf(result));
        bw.close();
        br.close();
    }

    public static int solution(int[] arr) {
        int[] result = new int[arr.length];
        result[1] = arr[1];

        if (arr.length - 1 >= 2) {
            result[2] = result[1] + arr[2];
        }

        for (int i = 3; i < arr.length; i++) {
            result[i] = Math.max(arr[i] + result[i -2],
                    arr[i] + arr[i - 1] + result[i - 3]);
        }
        return result[result.length - 1];
    }
}
