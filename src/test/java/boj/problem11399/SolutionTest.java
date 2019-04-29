package boj.problem11399;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-29
 * Time: 17:47
 */
public class SolutionTest {

    @Test
    public void success() {
        Solution s = new Solution();
        int[] arr = {3, 1, 4, 3, 2};
        int result = s.solution(arr);
        assertThat(result).isEqualTo(32);
    }
}