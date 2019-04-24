package programmers.콜라츠추측;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by SeEun Kim.
 * Date: 2019-04-24
 * Time: 23:03
 */
public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void success1() {
        assertThat(s.solution(6)).isEqualTo(8);
    }

    @Test
    public void success2() {
        assertThat(s.solution(16)).isEqualTo(4);
    }

    @Test
    public void success3() {
        assertThat(s.solution(626331)).isEqualTo(-1);

    }
}