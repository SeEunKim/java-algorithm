package programmers.TargetNumber;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1};
        int targetNumber = 3;

        Solution s = new Solution();
        int result = s.solution(arr, targetNumber);
        System.out.println(result);

    }
}

class Solution {
    int[] arr;
    int targetNumber;
    int cnt;
    public int solution(int[] numbers, int target) {
        arr = numbers;
        targetNumber = target;
        int answer = 0;

        DFS(0, 0);
        return cnt;
    }

    public void DFS(int number, int sum) {
        if (number == arr.length) {
            if (sum == targetNumber) {
                cnt = cnt + 1;
            }
            return;
        }

        DFS(number + 1, sum + arr[number]);
        DFS(number + 1, sum - arr[number]);
    }
}
