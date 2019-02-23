package programmers.level112915;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        Solution s = new Solution();
        String[] result = s.solution(strings, 2);
        System.out.println(Arrays.toString(result));
    }
}
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Arrays.sort(strings);

        List<Pair> list = new ArrayList<>();


        for (int i = 0; i < strings.length; i++) {
            list.add(new Pair(strings[i], strings[i].charAt(n)));
        }

        list.sort(Comparator.comparingInt(Pair::getC));

        for (int i = 0; i < strings.length; i++) {
            answer[i] = list.get(i).getS();
        }

        return answer;
    }
}

class Pair {
    private String s;
    private char c;

    public String getS() {
        return s;
    }

    public char getC() {
        return c;
    }

    public Pair(String s, char c) {
        this.s = s;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "s='" + s + '\'' +
                ", c=" + c +
                '}';
    }
}

class Solution1 {

    public String[] solution(String[] strings, int n) {

        String[] answer = strings;

        Arrays.sort(answer, (o1, o2) -> {
            if (o1.charAt(n) < o2.charAt(n)) {
                return -1;
            } else if (o1.charAt(n) > o2.charAt(n)) {
                return 1;
            } else {
                return o1.compareTo(o2);
            }

        });
        return answer;
    }
}