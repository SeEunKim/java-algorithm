package programmers.방문길이;

import org.junit.Before;
import org.junit.Test;


import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by SeEun Kim.
 * Date: 2019-05-02
 * Time: 22:19
 */
public class SolutionTest {
    private Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void success() {
        int result = s.solution("ULURRDLLU");
        assertThat(result).isEqualTo(7);
    }

    @Test
    public void success1() {
        int result = s.solution("LULLLLLLU");
        assertThat(result).isEqualTo(7);
    }

    @Test
    public void success2() {
        int result = s.solution("RRRRRUUUUU");
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void success3() {
        int result = s.solution("UDUDUDUD");
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void success4() {
        int result = s.solution("RLRLRLRLRL");
        assertThat(result).isEqualTo(1);
    }
}