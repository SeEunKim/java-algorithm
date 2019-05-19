package programmers.점프와순간이동;

/**
 * Created by SeEun Kim.
 * Date: 2019-05-19
 * Time: 23:07
 */
public class Solution {
    public int solution(int n) {
        int ans = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
                ans++;
            }
        }

        return ans;
    }
}
