package codeforces.B.B1108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * https://codeforces.com/contest/1108/problem/B
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countOfNumbers = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < countOfNumbers; i++) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }

        numbers.sort(Collections.reverseOrder());

        int max = numbers.get(0);

        List<Integer> arr = new ArrayList<>();
        for (int a = 1; a <= max; a++) {
            if ((max%a == 0)) {
                arr.add(a);
            }
        }

        arr.sort(Collections.reverseOrder());

        System.out.println(numbers);
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
            System.out.println(numbers.get(i));
            if (arr.get(i) != numbers.get(i)) {
                System.out.println(max + " " +numbers.get(i));
                break;
            }
        }

    }
}
