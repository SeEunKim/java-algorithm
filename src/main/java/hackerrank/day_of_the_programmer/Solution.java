package hackerrank.day_of_the_programmer;

import java.io.*;

public class Solution {
    static String dayOfProgrammer(int year) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum = 0;
        int month = 0;
        for (int i = 0; i < months.length; i++) {
            sum += months[i];
            if (sum > 256) {
                sum -= months[i];
                month = i;
                break;
            }
        }

        if ((year < 1918 && year % 4 == 0) || (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            sum += 1;
        }

        int day = 256 - sum;
        String result = day + "." + String.format("%02d", month + 1) + "." + year;
        if (year == 1918) {
            result = 26 + "." + String.format("%02d", month + 1) + "." + year;;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine().trim());

        String result = dayOfProgrammer(year);
        bw.write(result);
        bw.newLine();
        br.close();
        bw.close();
    }
}
