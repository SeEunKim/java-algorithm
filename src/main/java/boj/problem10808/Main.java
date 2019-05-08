package boj.problem10808;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by SeEun Kim.
 * Date: 2019-05-08
 * Time: 22:42
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split("");

        Map<String, Integer> map = new HashMap<>();
        char alphabet = 'a';
        for (int i = 0; i < 26; i++) {
            map.put(Character.toString(alphabet), 0);
            alphabet++;
        }

        for (String word : words) {
            int count = map.get(word);
            map.put(word, count + 1);
        }

        for (Integer value : map.values()) {
            System.out.print(value);
            System.out.print(" ");
        }
    }
}
