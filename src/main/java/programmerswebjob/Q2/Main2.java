package programmerswebjob.Q2;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] people = {1,1,1,1};
        int[] tshirts = {1,1,1};
        Solution s = new Solution();
        int result = s.solution(people, tshirts);
        System.out.println(result);
    }
}
class Solution {
    public int solution(int[] people, int[] tshirts) {
        int answer = 0;

        Arrays.sort(people);
        Arrays.sort(tshirts);

        int index = 0;
        boolean[] isExistTshirts = new boolean[tshirts.length];

        for (int i = 0; i < people.length; i++) {
            if(index >= tshirts.length) {
                break;
            }

            while (people[i] > tshirts[index]) {
                index++;

                if(index >= tshirts.length) {
                    break;
                }
            }

            if(index >= tshirts.length) {
                break;
            }

            if (people[i] <= tshirts[index]) {
                if(!isExistTshirts[index]) {
                    answer++;
                    isExistTshirts[index] = true;
                }
                index++;
            }
        }
        return answer;
    }
}
