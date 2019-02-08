package codeforces.A.A1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int b = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        String[] ss = br.readLine().split(" ");
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(ss[i]);
        }

        double n = 0;
        double result = 0;
        for (int i = 0; i < k; i++) {
            result = arr[i] * Math.pow(b, k - i -1);
            if (result % 2 == 1) {
                n += 1;
            } else {
                n += 0;
            }
        }

        System.out.println(n % 2 == 1 ? "odd" : "even");
    }
}
