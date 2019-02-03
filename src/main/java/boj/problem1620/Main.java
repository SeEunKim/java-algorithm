package boj.problem1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int cnt = Integer.parseInt(strings[0]);
        int questionCnt = Integer.parseInt(strings[1]);

        String[] arr = new String[cnt + 1];
        HashMap<String, Integer> map = new LinkedHashMap<>();

        for (int i = 1; i < cnt + 1; i++) {
            arr[i] = br.readLine();
            map.put(arr[i], i);
        }

        for (int i = 0; i < questionCnt; i++) {
            String a = br.readLine();
            if ((a.charAt(0) - 65) < 0) {
                int num = Integer.parseInt(a);
                System.out.println(arr[num]);
            } else {
                System.out.println(map.get(a));
            }
        }
    }
}
