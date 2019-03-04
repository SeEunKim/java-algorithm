package programmers.탑;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {7, 6, 5, 4, 3,2,1};
        int[] result = s.solution(arr);
        System.out.println(Arrays.toString(result));
    }
}

class Solution {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        for (int i = heights.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (heights[i] < heights[j]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        return answer;
    }
}
