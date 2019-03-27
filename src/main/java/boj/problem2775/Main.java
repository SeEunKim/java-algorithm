package boj.problem2775;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[][] people = new int[15][15];

            for (int j = 0; j < 15; j++) {
                people[0][j] = j;
            }

            for (int j = 1; j < 15; j++) {
                for (int l = 1; l < 15; l++) {
                    people[j][l] = people[j - 1][l] + people[j][l - 1];
                }
            }

            bw.write(String.valueOf(people[k][n]));
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
