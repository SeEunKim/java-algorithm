package boj.problem2579;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-04
 * Time: 14:06
 */
public class MainTest {
    @Test
    public void success() {
        int[] input = {0, 10, 20, 15, 25, 10, 20};
        int result = Main.solution(input);
        assertThat(result).isEqualTo(75);
    }
}