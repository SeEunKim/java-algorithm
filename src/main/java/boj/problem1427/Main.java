package boj.problem1427;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] str = input.split("");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            list.add(Integer.parseInt(str[i]));
        }
        list.sort(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(list.get(i));
        }

        System.out.println(sb.toString());
    }
}
