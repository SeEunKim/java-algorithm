package hackerrank.plus_minus;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static void plusMinus(int[] arr) {
        long posiviteNumber = Arrays.stream(arr).filter(x -> x > 0).count();
        long negativeNumber = Arrays.stream(arr).filter(x -> x < 0).count();
        long zeroCount = Arrays.stream(arr).filter(x -> x == 0).count();
        System.out.println(String.format("%.6f", (posiviteNumber / (double)arr.length)));
        System.out.println(String.format("%.6f", (negativeNumber / (double)arr.length)));
        System.out.println(String.format("%.6f", (zeroCount / (double)arr.length)));
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);
        scanner.close();
    }
}
