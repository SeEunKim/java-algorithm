package programmers.점프와순간이동;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


/**
 * Created by SeEun Kim.
 * Date: 2019-05-19
 * Time: 23:07
 */
public class SolutionTest {
    @Test
    public void success1() {
        Solution s = new Solution();
        int result = s.solution(5);
        assertThat(result).isEqualTo(2);
    }
    @Test
    public void success2() {
        Solution s = new Solution();
        int result = s.solution(6);
        assertThat(result).isEqualTo(2);
    }
    @Test
    public void success3() {
        Solution s = new Solution();
        int result = s.solution(5000);
        assertThat(result).isEqualTo(5);
    }
}