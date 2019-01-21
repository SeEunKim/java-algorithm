package codeforces.A.A1105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * https://codeforces.com/contest/1105/problem/A
 * A. Salem and Sticks
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }

        int sum = 0;
        int answer = 0;
        int min = 2147483647;
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < list.size(); j++) {
                int result = 0;
                if (list.get(j) > i) {
                     result = Math.abs(list.get(j) - i - 1);
                } else if (list.get(j) == i) {

                } else {
                     result = Math.abs(list.get(j) - i + 1);
                }
                sum += result;
            }
            min = Math.min(sum, min);
            if (min == sum) {
                answer = i;
            }
            sum = 0;
        }
        System.out.println(answer + " " + min);
    }
}
