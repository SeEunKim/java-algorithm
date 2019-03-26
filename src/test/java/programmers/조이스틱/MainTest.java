package programmers.조이스틱;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    @Test
    public void moveRightLeft() {
        Solution s = new Solution();
        String[] input = "ABAAAC".split("");
        int result = s.moveRightLeft(input, 1);
        assertThat(result).isEqualTo(2);
    }
}