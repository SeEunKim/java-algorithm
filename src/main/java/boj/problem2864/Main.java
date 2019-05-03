package boj.problem2864;

import java.util.Scanner;

/**
 * Created by SeEun Kim.
 * Date: 2019-05-03
 * Time: 23:19
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Solution s = new Solution();
        int[] result = s.solution(a, b);
        System.out.println(result[0] + " " + result[1]);
    }
}
class Solution {
    public int[] solution(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        int[] answer = new int[2];

        String minA = strA.replace("6", "5");
        String minB = strB.replace("6", "5");

        answer[0] = Integer.parseInt(minA) + Integer.parseInt(minB);

        String maxA = strA.replace("5", "6");
        String maxB = strB.replace("5", "6");

        answer[1] = Integer.parseInt(maxA) + Integer.parseInt(maxB);
        return answer;
    }
}
