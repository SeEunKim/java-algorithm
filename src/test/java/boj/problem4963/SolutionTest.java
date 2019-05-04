package boj.problem4963;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by SeEun Kim.
 * Date: 2019-05-04
 * Time: 11:59
 */
public class SolutionTest {

    private Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void success1() {
        int[][] arr = {{1, 1, 1}, {1, 1, 1}};
        int result = s.solution(arr);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void success2() {
        int[][] arr = {{0}};
        int result = s.solution(arr);
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void success3() {
        int[][] arr = {{0, 1}, {1, 0}};
        int result = s.solution(arr);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void success4() {
        int[][] arr = {{1, 0, 1, 0, 0}, {1, 0, 0, 0, 0}, {1, 0, 1, 0, 1},
                {1, 0, 0, 1, 0}};
        int result = s.solution(arr);
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void success5() {
        int[][] arr = {{1, 1, 1, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1}};
        int result = s.solution(arr);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void success6() {
        int[][] arr = {{1, 0, 1, 0, 1}, {0, 0, 0, 0, 0}, {1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0}, {1, 0, 1, 0, 1}};
        int result = s.solution(arr);
        assertThat(result).isEqualTo(9);
    }


}