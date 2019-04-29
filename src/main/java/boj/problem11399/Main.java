package boj.problem11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-29
 * Time: 17:45
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Solution s = new Solution();
        int result = s.solution(arr);
        System.out.println(result);
    }
}
class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);

        int[] totals = new int[arr.length];

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            totals[i] = sum;
        }

        int result = 0;
        for (int total : totals) {
            result += total;
        }

        return result;
    }
}
