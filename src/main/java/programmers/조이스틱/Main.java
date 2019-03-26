package programmers.조이스틱;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String name = "ABAAAAAAAAABB";
        Solution s = new Solution();
        int result = s.solution(name);
        System.out.println("##### " + result);
    }
}

class Solution {
    public int solution(String name) {
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();
        char c = 'A';
        for (int i = 0; i < 13; i++) {
            map.put(c++, i);
        }
        c = 'Z';
        for (int i = 1; i <= 13; i++) {
            map.put(c--, i);
        }

        String[] alphabet = name.split("");
        int index = 0;



        while (!isAllAlphabetA(alphabet)) {
            int count = map.get(alphabet[index].charAt(0));
            alphabet[index] = "A";
            answer += count;

            if (!isAllAlphabetA(alphabet)) {
                //answer += move.getDistance();
            }

            System.out.println("11count : " + count);
            System.out.println("11 answer : " + answer);
            System.out.println(Arrays.toString(alphabet));

            System.out.println();

            Point move = moveRightLeft(alphabet, index);
            if (move.getDirection().equals("right")) {
                index = index + move.getDistance();
            } else {
                index = alphabet.length - move.getDistance() + index;
            }

            if (index >= alphabet.length) {
                index = index - alphabet.length;
            }

            //answer += count + move.getDistance();
//            if (!isAllAlphabetA(alphabet)) {
//                answer += move.getDistance();
//            }
            System.out.println("count : " + count);
            System.out.println("answer : " + answer);
            System.out.println(Arrays.toString(alphabet));
            System.out.println(move);
            System.out.println();
        }

        return answer;
    }

    public boolean isAllAlphabetA (String[] names) {
        for (int i = 0; i < names.length; i++) {
            if (!names[i].equals("A")) {
                return false;
            }
        }
        return true;
    }

    public Point moveRightLeft(String[] names, int index) {
        int right = 0;
        int left = 0;
        int count = index + 1;

        System.out.println("index : " + index);
        while (count < names.length + index) {
            //System.out.println("right");
            if (count == names.length) {
                count = 0;
            }

            if (names[count].equals("A")) {
                right++;
            } else {
                break;
            }
            count++;
        }

        count = names.length - 1;
        while (count > 0) {
            System.out.println("left");
            if (names[count].equals("A")) {
                left++;
            } else {
                break;
            }
            count--;
        }

        left = left + 1 + index;
        if (left > names.length) {
            left = left - names.length;
        }

        System.out.println("right : " + (right + 1));
        System.out.println("left : " + left);

        String direction = (right + 1) >= (left) ? "left" : "right";
        return new Point(direction, Math.min((right + 1) , left));
    }
}

class Point {
    private String direction;
    private int distance;

    public Point(String direction, int distance) {
        this.direction = direction;
        this.distance = distance;
    }

    public String getDirection() {
        return direction;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Point{" +
                "direction='" + direction + '\'' +
                ", distance=" + distance +
                '}';
    }
}