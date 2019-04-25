package boj.problem2667;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-25
 * Time: 15:51
 */
public class SolutionTest {
    @Test
    public void success1() {
        int[][] map = {{0, 1, 1, 0, 1, 0, 0}, {0, 1, 1, 0, 1, 0, 1}, {1, 1, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 1, 1}, {0, 1, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 1, 0}, {0, 1, 1, 1, 0, 0, 0}};

        Solution s = new Solution();
        int[] result = s.solution(map, map[0].length);

        assertThat(result.length - 1).isEqualTo(3);
        assertThat(result[0]).isEqualTo(7);
        assertThat(result[1]).isEqualTo(8);
        assertThat(result[2]).isEqualTo(9);
    }
}