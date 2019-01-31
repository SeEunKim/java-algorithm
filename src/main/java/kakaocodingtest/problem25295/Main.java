package kakaocodingtest.problem25295;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int k = 3;
        String[] user_scores = {"alex111 100", "cheries2 200", "coco 150", "luna 100", "alex111 120", "coco 300", "cheries2 110"};
        Solution s = new Solution();
        int result = s.solution(k, user_scores);
        System.out.println("result " + result);

    }
}

class Solution {
    static HashMap<String, Integer> map;
    static List<Integer> scores;
    public int solution(int k, String[] user_scores) {
        int answer = 0;

        int index = 0;

        scores = new ArrayList<>();
        map = new LinkedHashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(user_scores[index].split(" ")[0], Integer.parseInt(user_scores[index].split(" ")[1]));
            scores.add(Integer.parseInt(user_scores[index].split(" ")[1]));
            index++;
            answer++;
        }

        for (int i = 0; i < user_scores.length - k; i++) {
            int score = Integer.parseInt(user_scores[index].split(" ")[1]);
            int min = min();

            if (min < score) {
                String userId = user_scores[index].split(" ")[0];
                System.out.println("user id : " + userId);
                System.out.println("score : " + score);
                if (map.containsKey(userId)) {
                    map.replace(userId, score);
                } else {
                    answer++;
                    System.out.println("answer ++ ");
                }
            }

            index++;

        }

        System.out.println(map);

        return answer;
    }

    public int min() {
        int min = scores.get(0);
        for (int i = 0; i < scores.size(); i++) {
            min = Math.min(min, scores.get(i));
        }
        return min;
    }
}
