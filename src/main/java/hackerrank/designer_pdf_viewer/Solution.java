package hackerrank.designer_pdf_viewer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution {
    static int designedPdfViewer(int[] h, String word) {
        int max = 0;
        for (int wordItr = 0; wordItr < word.length(); wordItr++) {
            int index = word.charAt(wordItr) - 'a';
            int height = h[index];
            max = Math.max(height, max);
        }
        return max * word.length();

    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] h = new int[26];
        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designedPdfViewer(h, word);

        bw.write(String.valueOf(result));
        bw.newLine();
        bw.close();
        scanner.close();
    }
}
