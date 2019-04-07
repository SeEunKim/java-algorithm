package programmers.정수삼각형;

import java.util.Arrays;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-07
 * Time: 23:14
 *
 * https://programmers.co.kr/learn/courses/30/lessons/43105
 * 정수 삼각형
 */
public class Main {
    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        Solution s = new Solution();
        int result = s.solution(triangle);
        System.out.println(result);

    }
}
class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;

        int[][] d = new int[triangle.length][triangle.length];

        d[0][0] = triangle[0][0];

        for (int i = 1; i < triangle.length; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    d[i][j] += triangle[i][j] + d[i - 1][j - 1];
                } else {
                    d[i][j] += Math.max(d[i - 1][j - 1], d[i - 1][j]) + triangle[i][j];
                }
            }
            d[i][0] += triangle[i][0] + d[i - 1][0];
        }

        answer = Arrays.stream(d[triangle.length - 1]).max().getAsInt();
        return answer;
    }
}