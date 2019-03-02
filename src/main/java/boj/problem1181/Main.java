package boj.problem1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            set.add(br.readLine());
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        list.sort(Comparator.comparingInt(String::length));

        for (String s : list) {
            System.out.println(s);
        }
    }
}
