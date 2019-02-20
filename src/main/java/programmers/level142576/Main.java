package programmers.level142576;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] arr1 = {"leo", "kiki", "eden"};
        String[] arr2 = {"kiki", "eden"};
        String result = s.solution(arr1, arr2);
    }
}
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            if (!map.containsKey(participant[i])) {
                map.put(participant[i], 1);
            } else {
                int num = map.get(participant[i]);
                map.put(participant[i], num + 1);
            }
        }

        for (int i = 0; i < completion.length; i++) {
            int num = map.get(completion[i]);
            map.put(completion[i], num - 1);
        }

        for (String s : map.keySet()) {
            int num = map.get(s);
            if (num == 1) {
                answer = s;
                break;
            }
        }
        return answer;
    }
}