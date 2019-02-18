package programmers.problem42746;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *https://programmers.co.kr/learn/courses/30/lessons/42746?language=java
 */

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {6, 10, 2};
        int[] arr1 = {3, 30 ,300, 34, 5, 9, 300};
        String result = s.solution(arr1);
        System.out.println(result);
    }

    // 9 300
    // 3009
    // 9300
    // 30030
    // 30300
}


class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        List<String> list = new ArrayList<>();
        int length = numbers.length;

        for (int i = 0; i < length; i++) {
            list.add(Integer.toString(numbers[i]));
        }

        int size = list.size();

        Collections.sort(list, (num1, num2) -> (num2+num1).compareTo(num1+num2));

        if (list.get(0).equals("0")) {
            return "0";
        }

        for (int i = 0; i < size; i++) {
            answer = answer + list.get(i);
        }
        return answer;
    }
}