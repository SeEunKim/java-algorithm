package codeforces.A.A1100;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/contest/1100/problem/A
 * A. Roman and Browser
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int test = 0, social = 0;

        int[] arr = new int[count];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            arr[i] = (Integer.parseInt(st.nextToken()));
        }
        List<Integer> answers = new ArrayList<>();
        int[] tmp = new int[count];

        for (int i = 0; i < b; i++) {
            tmp = Arrays.copyOf(arr, arr.length);

            for (int j = i; j < count; j = j + b) {
                tmp[j] = 0;
            }

            for (int k = 0; k < tmp.length; k++) {
                if (tmp[k] == -1) {
                    social = social + 1;
                } else if (tmp[k] == 1){
                    test = test + 1;
                }
            }

            answers.add(Math.abs(social - test));
            test = social = 0;
        }

        int result = answers.stream().max(Comparator.comparing(Integer::valueOf)).orElse(0);
        bw.write(String.valueOf(result));
        bw.flush();

        bw.close();
        br.close();
    }
}
