package programmers.폰켓몬;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by SeEun Kim.
 * Date: 2019-04-19
 * Time: 15:18
 */
public class SolutionTest {
    @Test
    public void success() {
        Solution s = new Solution();
        int[] arr = {3, 1, 2, 3};
        assertThat(s.solution(arr)).isEqualTo(2);
    }
    public void success1() {
        Solution s = new Solution();
        int[] arr = {3, 3, 3, 2, 2, 4};
        assertThat(s.solution(arr)).isEqualTo(3);
    }
    public void success2() {
        Solution s = new Solution();
        int[] arr = {3, 3, 3, 2, 2, 2};
        assertThat(s.solution(arr)).isEqualTo(2);
    }
}