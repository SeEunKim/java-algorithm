package programmers.모의고사;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] answers = {1, 3, 2, 4, 2};
        Solution s = new Solution();
        int[] results = s.solution(answers);
        System.out.println(Arrays.toString(results));
    }
}
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];

        int[] case1 = {1, 2, 3, 4, 5};
        int[] case2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] case3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int case1AnswerCnt = 0;
        int case2AnswerCnt = 0;
        int case3AnswerCnt = 0;

        for (int i = 0; i < answers.length; i++) {
            int tmp = i;
            if (tmp >= case1.length) {
                tmp = tmp % case1.length;
            }
            if (answers[i] == case1[tmp]) {
                case1AnswerCnt++;
            }
        }
        answer[0] = case1AnswerCnt;

        for (int i = 0; i < answers.length; i++) {
            int tmp = i;
            if (tmp >= case2.length) {
                tmp = tmp % case2.length;
            }
            if (answers[i] == case2[tmp]) {
                case2AnswerCnt++;
            }
        }
        answer[1] = case2AnswerCnt;

        for (int i = 0; i < answers.length; i++) {
            int tmp = i;
            if (tmp >= case3.length) {
                tmp = tmp % case3.length;
            }
            if (answers[i] == case3[tmp]) {
                case3AnswerCnt++;
            }
        }
        answer[2] = case3AnswerCnt;

        int max = (int)DoubleStream.of(case1AnswerCnt, case2AnswerCnt, case3AnswerCnt).max().getAsDouble();

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (max == answer[i]) {
                resultList.add(i + 1);
            }
        }
        return resultList.stream().mapToInt(i -> i).toArray();
    }
}