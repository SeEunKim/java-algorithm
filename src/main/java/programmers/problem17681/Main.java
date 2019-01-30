package programmers.problem17681;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};

        Solution s = new Solution();
        String[] result =  s.solution(n, arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = String.format("%"+n+"s", Integer.toBinaryString(arr1[i] | arr2[i]));
            System.out.println(answer[i]);
            answer[i] = answer[i].replace('1', '#');
            answer[i] = answer[i].replace('0', ' ');
        }
        return answer;
    }
}