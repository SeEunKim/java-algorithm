package hackerrank.timeconversion;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution {

    static String timeConversion(String s) {
        String tmp = s.substring(s.length()-2);

        String answer;
        int hour = Integer.parseInt(s.substring(0, 2));
        if (tmp.equals("PM")) {
            hour += 12;
            if (hour == 24) {
                hour = 12;
            }
        } else {
            if (hour == 12) {
                hour = 0;
            }
        }
        answer = String.format("%02d", hour) + s.substring(2, s.length() - 2);
        return answer;
    }

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = scan.nextLine();
        String result = timeConversion(s);
        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
