package hackerrank.Kangaroo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 < v2) {
            return "NO";
        }
        if (x1 < x2 && v1 > v2) {
            int xDiff = Math.abs(x1 - x2);
            int vDiff = Math.abs(v1- v2);
            if (xDiff % vDiff == 0) {
                return "YES";
            } else {
                return "NO";
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] x1v1x2v2 = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(x1v1x2v2[0]);
        int v1 = Integer.parseInt(x1v1x2v2[1]);
        int x2 = Integer.parseInt(x1v1x2v2[2]);
        int v2 = Integer.parseInt(x1v1x2v2[3]);

        String result = kangaroo(x1, v1, x2, v2);
        bw.write(result);
        bw.newLine();
        bw.close();
        scanner.close();
    }
}
