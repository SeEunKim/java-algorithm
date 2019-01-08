package programmers;

import java.util.Arrays;

public class CreateMinimum12941 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {1, 4, 2};
        int[] b = {5, 4, 4};
        int result = s.solution(a, b);
        System.out.println(result);
    }
}

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length -1 - i];
        }

        return answer;
    }
}
