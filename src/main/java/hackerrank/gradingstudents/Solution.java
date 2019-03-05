package hackerrank.gradingstudents;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution {
    static int[] gradingStudents(int[] grades) {
        int[] answer = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            int tmp = (grades[i] / 5);
            int nextGrade = (tmp + 1) * 5;
            int gap = nextGrade - grades[i];

            if (gap < 3) {
                tmp = gap + grades[i];
                if (tmp >= 40) {
                    answer[i] = tmp;
                }
            } else {
                answer[i] = grades[i];
            }
        }
        return answer;
    }
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(scan.nextLine().trim());
        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int [] result = gradingStudents(grades);
        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();
        bw.close();
    }
}
