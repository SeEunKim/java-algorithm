package boj.problem1159;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-26
 * Time: 15:25
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = br.readLine().substring(0, 1);

            if (map.get(name) == null) {
                map.put(name, 1);
            } else {
                int count = map.get(name);
                map.put(name, count + 1);
            }
        }

        StringBuffer sb = new StringBuffer();

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            int count = stringIntegerEntry.getValue();
            if (count >= 5) {
                sb.append(stringIntegerEntry.getKey());
            }
        }

        String sorted = sb
                .toString()
                .chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        if (sorted.isEmpty()) {
            sorted = "PREDAJA";
        }
        System.out.println(sorted);
    }
}
