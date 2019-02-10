package programmers.problem49993;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/49993
 */

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] strs = {"CBAD", "QWER", "CBA"};
        int result = s.solution("CBDA", strs);
        System.out.println(result);
    }
}
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int index = 0;
        int cnt = 0;

        for (int i = 0; i < skill_trees.length; i++) {
            for (int j = 0; j < skill_trees[i].length(); j++) {
                int tmp = skill.indexOf(skill_trees[i].charAt(j));

                if (tmp > index) {
                    index = 0;
                    break;
                } else if (tmp != -1) {
                    index++;
                } else {
                    cnt++;
                }


            }

            if (index > 0 || cnt == skill_trees[i].length()) {
                answer++;
            }

            index = 0;
            cnt = 0;
        }

        return answer;
    }
}