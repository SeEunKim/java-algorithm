package boj.problem11066;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-09
 * Time: 22:04
 */
public class MainTest {

    @Test
    public void success1() {
        int[] arr = {40, 30, 30, 50};
        int result = Main.solution(arr);
        assertThat(result).isEqualTo(300);
    }

    @Test
    public void success2() {
        int[] arr = {1, 21, 3, 4, 5, 35, 5, 4, 3, 5, 98, 21, 14, 17, 32};
        int result = Main.solution(arr);
        assertThat(result).isEqualTo(864);
    }

    @Test
    public void success3() {
        int[] arr = {10, 20, 30, 40, 50};
        int result = Main.solution(arr);
        assertThat(result).isEqualTo(430);
    }
}