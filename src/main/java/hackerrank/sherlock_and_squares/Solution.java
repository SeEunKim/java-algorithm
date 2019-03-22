package hackerrank.sherlock_and_squares;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution {
    static int squares(int a, int b) {
        int sqrtA = (int)Math.ceil(Math.sqrt(a));
        int sqrtB = (int)Math.floor(Math.sqrt(b));
        return sqrtB - sqrtA + 1;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = scanner.nextLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            int result = squares(a, b);
            bw.write(String.valueOf(result));
            bw.newLine();
        }
        bw.close();
        scanner.close();

    }

}
