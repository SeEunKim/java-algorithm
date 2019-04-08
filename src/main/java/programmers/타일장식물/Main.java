package programmers.타일장식물;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-08
 * Time: 14:09
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution s = new Solution();
        long result = s.solution(scanner.nextInt());
        System.out.println(result);
    }

}
class Solution {
    static long[] d;
    public long solution(int N) {
        d = new long[N + 1];
        fibo(N);

        return (d[N] * 4) + (d[N-1] * 2);
    }

    private long fibo(int n) {
        if (n == 0) {
            d[n] = 0;
            return 0;
        }

        if (n == 1) {
            d[n] = 1;
            return 1;
        }

        if (d[n] != 0) {
            return d[n];
        }
        d[n] = fibo(n-1) + fibo(n-2);
        return d[n];
    }
}