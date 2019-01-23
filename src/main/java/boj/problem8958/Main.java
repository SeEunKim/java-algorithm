package boj.problem8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countOfgames = Integer.parseInt(br.readLine());

        int sum = 0;
        int count = 1;
        for (int i = 0; i <  countOfgames; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
               char x = str.charAt(j);
               if (x == 'O') {
                   sum += count;
                   count++;
               } else {
                   count = 1;
               }
            }
            System.out.println(sum);
            count = 1;
            sum = 0;
        }

    }
}
