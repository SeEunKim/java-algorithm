package hackerrank.diagonal_difference;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution {
    static int diagonalDifference(int[][] arr) {
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    primaryDiagonal += arr[i][j];
                }

                if (j == arr.length - 1 - i) {
                    secondaryDiagonal += arr[i][j];
                }
            }
        }
        return Math.abs(primaryDiagonal - secondaryDiagonal);
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.close();
        scanner.close();
    }
}
