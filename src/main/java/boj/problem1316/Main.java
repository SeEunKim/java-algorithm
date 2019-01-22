package boj.problem1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://www.acmicpc.net/problem/1316
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfwords = Integer.parseInt(br.readLine());

        String[] list = new String[numberOfwords];

        for (int i = 0; i < numberOfwords; i++) {
            list[i] = br.readLine();
        }


        int pre = 0;
        List<Character> checkList = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < numberOfwords; i++) {
            for (int j = 0; j < list[i].length(); j++) {
                if (pre != list[i].charAt(j)) {
                    if (!checkList.contains(list[i].charAt(j))) {
                        checkList.add(list[i].charAt(j));
                    } else {
                        break;
                    }
                }
                pre = list[i].charAt(j);
                if (j == list[i].length() - 1) {
                    count++;
                }
            }
            checkList.clear();
            pre = 0;
        }
        System.out.println(count);
    }
}
