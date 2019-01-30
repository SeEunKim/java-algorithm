package programmers.problem12940;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.solution(3, 12);
        System.out.println(Arrays.toString(result));
    }
}

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};

        int val1 = n;
        int val2 = m;

        if (n < m) {
            int tmp = val1;
            val1 = val2;
            val2 = tmp;
        }

        int aa = 0;
        while (0 > aa) {
            int aaa = val1 % val2;
            val1 = val2;
            val2 = aaa;
        }

        System.out.println(aa);



        return answer;
    }
}
