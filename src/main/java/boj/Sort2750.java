package boj;

import java.io.*;

public class Sort2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int indexMin, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }
            temp = arr[indexMin];
            arr[indexMin] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < count; i++) {
            bw.write(String.valueOf(arr[i]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

}
