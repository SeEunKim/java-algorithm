package codeforces.A.A1108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countOfCase = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] arr = new int[4];


        for (int i = 0; i < countOfCase; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 4; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            if (arr[0] == arr[2]) {
                System.out.println(arr[0] + " " + (arr[2] + 1));
            } else {
                System.out.println(arr[0] + " " + arr[2]);
            }
        }
    }
}
