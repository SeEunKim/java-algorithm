package joonggo.Q2;

import java.io.*;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] ab = br.readLine().split(" ");
        int aLength = Integer.parseInt(ab[0]);
        int bLength = Integer.parseInt(ab[1]);

        int[] a = new int[aLength];
        int[] b = new int[bLength];

        String[] aItems = br.readLine().split(" ");
        for (int i = 0; i < aLength; i++) {
            a[i] = Integer.parseInt(aItems[i]);
        }

        String[] bItems = br.readLine().split(" ");
        for (int i = 0; i < bLength; i++) {
            b[i] = Integer.parseInt(bItems[i]);
        }

        int[] result = new int[aLength + bLength];

        int aIndex = 0;
        int bIndex = 0;
        for (int i = 0; i < aLength + bLength; i++) {
            if (aIndex < aLength && bIndex < bLength) {
                if (a[aIndex] < b[bIndex]) {
                    result[i] = a[aIndex++];
                } else {
                    result[i] = b[bIndex++];
                }
            } else if (aIndex == aLength) {
                result[i] = b[bIndex++];
            } else if (bIndex == bLength) {
                result[i] = a[aIndex++];
            }
        }

        for (int i = 0; i < result.length ; i++) {
            bw.write(String.valueOf(result[i]));
        }

        bw.newLine();
        bw.close();
        br.close();
    }
}
