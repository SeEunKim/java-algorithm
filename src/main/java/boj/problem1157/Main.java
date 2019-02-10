package boj.problem1157;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        HashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < 26; i++) {
            map.put(i, 0);
        }

        str = str.toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            int c3 = str.charAt(i) - 'A';
            int n = map.get(c3);
            map.replace(c3, n + 1);
        }

        int max = 0;
        for (int i = 0; i < map.size(); i++) {
            max = Math.max(max, map.get(i));
        }

        int cnt = 0;
        int result = 0;
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i) == max) {
                cnt++;
                result = i;
            }
        }

        if (cnt != 1) {
            System.out.println("?");
        } else {
            System.out.println(Character.toChars(result + 'A'));
        }
    }
}
