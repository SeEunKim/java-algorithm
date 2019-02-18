package programmers.level142862;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,3,4};
        int[] reserve = {3,4,5};
        Solution s = new Solution();
        int result = s.solution(n, lost, reserve);
        System.out.println(result);
    }

}
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int index = 0;
        int cnt = 0;

        boolean[] isExist = new boolean[reserve.length];

        for (int i = 0; i < lost.length; i++) {
            while (index < reserve.length) {
                int gap = Math.abs(lost[i] - reserve[index]);
                if (gap <= 1) {
                    if (!isExist[index]) {
                        isExist[index] = true;
                        cnt++;
                        break;
                    }
                }
                index++;
            }
            index = 0;
        }

        return cnt + (n - lost.length);
    }
}