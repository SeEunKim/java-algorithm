package programmers.problem42888;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        Solution s = new Solution();
        String[] result = s.solution(record);
        System.out.println(Arrays.toString(result));

    }
}

class Solution {
    public String[] solution(String[] record) {


        HashMap<String, String> map = new LinkedHashMap<>();

        int cnt = 0;
        for (int i = 0; i < record.length; i++) {
            String[] tmp = record[i].split(" ");
            //System.out.println(Arrays.toString(tmp));

            if (!map.containsKey(tmp[1])) {
                map.put(tmp[1], tmp[2]);
                cnt++;
            } else if (tmp.length == 3) {
                map.replace(tmp[1], tmp[2]);
                cnt++;
            }

        }

        String[] answer = new String[cnt];

        for (int i = 0; i < record.length; i++) {
            String[] tmp = record[i].split(" ");
            StringBuilder sb = new StringBuilder();
            if (tmp[0].equals("Enter")) {
                answer[i] = (map.get(tmp[1]) + "님이 들어왔습니다.");
            } else if (tmp[0].equals("Leave")) {
                answer[i] = (map.get(tmp[1]) + "님이 나갔습니다.");
            }

        }
        //System.out.println(map);;

        return answer;
    }
}
