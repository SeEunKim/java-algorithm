package codeforces.B.B1105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * https://codeforces.com/contest/1105/problem/B
 * B. Zuhair and Strings
 */

/**
 * 53 3
 * aaabbbaabbbzzzzzzzzzzzzzzzzxxxxxxxxxxxxxxxxxxxxxxxxxx
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        String str = br.readLine();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            hashMap.put(i, 0);
        }

        //int a = str.charAt(0) - 'a';

        int pre = 30;
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i) - 'a';
            System.out.println(a);
            if (a == pre) {
                cnt ++;
                if (cnt == k) {
                    hashMap.put(a, cnt);
                    cnt = 0;
                }

            } else {
                if (cnt == k) {
                    hashMap.put(a, cnt);
                }
                cnt = 0;
            }
            pre = a;
        }
        int answer = 0;
        for (int i = 0; i < hashMap.size(); i++) {
            answer = Math.max(hashMap.get(i), answer);
        }

        if (k == 1) {
            answer = 1;
        }
        System.out.println(answer);
    }
}

