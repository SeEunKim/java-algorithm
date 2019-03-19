package hackerrank.drawing_book;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution {
    static int pageCount(int n, int p) {
       int beginning = (p / 2);
       int end = 0;
       if (n % 2 == 1) {
           end = (n - p) / 2;
       } else {
           end = (int)Math.ceil((n - p) / 2.0);
       }
       return Math.min(beginning, end);
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
