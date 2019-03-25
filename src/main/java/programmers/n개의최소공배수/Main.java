package programmers.n개의최소공배수;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};
        Solution s = new Solution();
        int result = s.solution(arr);
        System.out.println(result);
    }
}
class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }

        return answer;
    }

    public int gcd(int a, int b) {
        System.out.println("a["+a+"]b["+b+"]");
        while(b > 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
            System.out.println("a["+a+"]b["+b+"]c["+tmp+"]");
        }
        System.out.println(a);
        return a;
    }

    public int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}
