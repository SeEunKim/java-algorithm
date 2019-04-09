package programmers.최대공약수와최소공배수;

import java.util.Arrays;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-09
 * Time: 23:22
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.solution(3, 12);
        System.out.println(Arrays.toString(result));
    }
}

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        return answer;
    }
    private int gcd(int a, int b) {
        while (b > 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    private int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}
