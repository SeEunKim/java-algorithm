package programmers;

import java.util.*;

/**
 * 정수 내림차순으로 배치하기
 * 문제 설명
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 *
 * 제한 조건
 * n은 1이상 8000000000 이하인 자연수입니다.
 * 입출력 예
 * n	return
 * 118372	873211
 */

public class IntegerDescending12933 {
    public static void main(String[] args) {
        SolutionIntegerDescending12933 s = new SolutionIntegerDescending12933();
        System.out.println(s.solution(118372));
    }
}

class SolutionIntegerDescending12933 {
    public long solution(long n) {
        long answer = 0;
        List<Long> arr = new ArrayList<>();

        while (n > 0) {
            arr.add(n % 10);
            n = n / 10;
        }

        Collections.sort(arr, Collections.reverseOrder());

        int index = 0;
        for (int i = arr.size() - 1; i > 0; i--) {
            answer += arr.get(index++) * Math.pow(10, i);
        }
        answer += arr.get(arr.size() - 1);
        return answer;
    }
}