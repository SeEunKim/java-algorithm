package boj.problem2864;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by SeEun Kim.
 * Date: 2019-05-03
 * Time: 23:21
 */
public class SolutionTest {
    @Test
    public void success() {
        Solution s = new Solution();
        int[] result = s.solution(1430, 4862);
        assertThat(result[0]).isEqualTo(6282);
        assertThat(result[1]).isEqualTo(6292);
    }
}