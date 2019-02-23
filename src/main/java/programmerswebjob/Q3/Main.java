package programmerswebjob.Q3;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] healths = {200,120,150};
        int[][] items = {{30,100},{500,30},{100,400}};
        Solution s = new Solution();
        int[] result = s.solution(healths, items);
        System.out.println(Arrays.toString(result));
    }
}
class Solution {
    public int[] solution(int[] healths, int[][] items) {
        int[] answer = {};

        Arrays.sort(healths);

        System.out.println(Arrays.toString(healths));
        Arrays.sort(items, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int time1 = o1[1];
                int time2 = o2[1];

                return Integer.compare(time2, time1);
            }
        });
        for (int i = 0; i < items.length; i++) {

            System.out.println(Arrays.toString(items[i]));
        }
        return answer;
    }
}