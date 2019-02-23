package boj.problem5622;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        Character c = 'A';
        for (int i = 2; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                map.put(c.toString(), i);
                c++;
            }
        }
        for (int i = 0; i < 4; i++) {
            map.put(c.toString(), 7);
            c++;
        }
        for (int i = 8; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                map.put(c.toString(), i);
                c++;
            }
        }
        map.put(c.toString(), 9);

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("");

        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            int n = map.get(input[i]);
            sum += n + 1;
        }
        System.out.println(sum);
    }
}
