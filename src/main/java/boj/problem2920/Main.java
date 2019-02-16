package boj.problem2920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int[] numbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }

        int cnt = 0;
        for (int i = 1; i < arr.length; i++) {
            int n1 = numbers[i - 1];
            int n2 = numbers[i];

            if (n1 == 8) {
                if ((n1 - n2) == 7) {
                    cnt++;
                }
            } else if (n1 == 1) {
                if ((n2 - n1) == 7) {
                    cnt--;
                }
            }

            int result = Math.abs(n2 - n1);

            if (result == 1 && (n2 > n1)) {
                cnt++;

            } else if (result == 1 && n1 > n2) {
                cnt--;
            }
        }

        if (cnt == 7) {
            System.out.println("ascending");
        } else if (cnt == -7) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
