package programmers.조이스틱;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    @Test
    public void moveRightLeft() {
        Solution s = new Solution();
        String[] input = "ABAAAC".split("");
        Point result = s.moveRightLeft(input, 1);
        assertThat(result.getDistance()).isEqualTo(2);
    }

    @Test
    public void moveRight() {
        Solution s = new Solution();
        String[] input = "AAAA".split("");
        Point result = s.moveRightLeft(input, 3);
        assertThat(result.getDistance()).isEqualTo(0);
    }
}