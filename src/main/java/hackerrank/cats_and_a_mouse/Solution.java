package hackerrank.cats_and_a_mouse;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution {
    static String canAndMouse(int x, int y, int z) {
        String result;
        int distanceBetweenCatAAndMouse = Math.abs(x - z);
        int distanceBetweenCatBAndMouse = Math.abs(y - z);

        if (distanceBetweenCatAAndMouse < distanceBetweenCatBAndMouse) {
            result = "Cat A";
        } else if (distanceBetweenCatAAndMouse > distanceBetweenCatBAndMouse) {
            result = "Cat B";
        } else {
            result = "Mouse C";
        }
        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");
            int x = Integer.parseInt(xyz[0]);
            int y = Integer.parseInt(xyz[1]);
            int z = Integer.parseInt(xyz[2]);
            String result = canAndMouse(x, y, z);
            bw.write(result);
            bw.newLine();
        }
        bw.close();
        scanner.close();
    }

}
