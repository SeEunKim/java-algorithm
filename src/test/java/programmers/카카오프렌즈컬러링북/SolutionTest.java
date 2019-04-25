package programmers.카카오프렌즈컬러링북;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-25
 * Time: 14:32
 */
public class SolutionTest {
    @Test
    public void success1() {
        int m = 6;
        int n = 4;
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        Solution s = new Solution();
        int[] result = s.solution(m, n, picture);

        assertThat(result[0]).isEqualTo(4);
        assertThat(result[1]).isEqualTo(5);
    }
}