package boj.problem2108;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-21
 * Time: 22:31
 */
public class SolutionTest {
    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void success1() {
        int[] arr = {1, 3, 8, -2, 2};
        Result result = s.solution(arr);
        assertThat(result.getArithmeticMean()).isEqualTo(2);
        assertThat(result.getMedian()).isEqualTo(2);
        assertThat(result.getMode()).isEqualTo(1);
        assertThat(result.getRange()).isEqualTo(10);
    }

    @Test
    public void success2() {
        int[] arr = {4000};
        Result result = s.solution(arr);
        assertThat(result.getArithmeticMean()).isEqualTo(4000);
        //assertThat(result.getMedian()).isEqualTo(4000);
        //assertThat(result.getMode()).isEqualTo(4000);
        //assertThat(result.getRange()).isEqualTo(0);
    }

    @Test
    public void success3() {
        int[] arr = {-1, -2, -3, -1, -2};
        Result result = s.solution(arr);
        assertThat(result.getArithmeticMean()).isEqualTo(-2);
        assertThat(result.getMedian()).isEqualTo(-2);
        assertThat(result.getMode()).isEqualTo(-1);
        assertThat(result.getRange()).isEqualTo(2);
    }
}