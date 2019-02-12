package programmers.problem12947;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        boolean result = s.solution(13);
        System.out.println(result);
    }
}

class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int tmp = x;
        while (tmp > 0) {
             sum += tmp % 10;
             tmp = tmp / 10;
        }
        System.out.println(sum);
        return x % sum == 0;
    }
}