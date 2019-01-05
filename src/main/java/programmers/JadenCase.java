package programmers;


import java.util.Arrays;

/**
 * 문제 설명
 * JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
 * 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * s는 길이 1 이상인 문자열입니다.
 * s는 알파벳과 공백문자(" ")로 이루어져 있습니다.
 * 첫 문자가 영문이 아닐때에는 이어지는 영문은 소문자로 씁니다. ( 첫번째 입출력 예 참고 )
 *
 * 입출력 예
 * s	                    return
 * 3people unFollowed me	3people Unfollowed Me
 * for the last week	    For The Last Week
 */
public class JadenCase {
    public static void main(String[] args) {
        SolutionJadeCase s = new SolutionJadeCase();
        String result = s.solution("3people   o ");
        System.out.println(result);
    }
}

class SolutionJadeCase {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] ss = s.split(" ");

        for (String s1 : ss) {
            if (!s1.equals("")) {
                sb.append(s1.substring(0, 1).toUpperCase());
                sb.append(s1.substring(1).toLowerCase());
                sb.append(" ");
            } else {
                sb.append(" ");
            }
        }

        if (sb.length() != s.length()) {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }
}


