package codeforces.A.A1097;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * https://codeforces.com/contest/1097/problem/A
 * A. Gennady and a Card Game
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String my = br.readLine();
        List<String> list = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            list.add(stringTokenizer.nextToken());
        }

        boolean result = false;

        for (String s : list) {
            if(s.charAt(0) == my.charAt(0)) {
                result = true;
            }

            if(s.charAt(1) == my.charAt(1)) {
                result = true;
            }
        }

        if (result) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        br.close();
        bw.close();
    }
}
