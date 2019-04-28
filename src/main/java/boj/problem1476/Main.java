package boj.problem1476;

import java.util.Scanner;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-28
 * Time: 21:59
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] esm = sc.nextLine().split(" ");
        int e = Integer.parseInt(esm[0]);
        int s = Integer.parseInt(esm[1]);
        int m = Integer.parseInt(esm[2]);

        int result = 1;
        while(true) {
            if (((result - e) % 15 == 0) && ((result - s) % 28 == 0) && ((result - m) % 19 == 0)) {
                System.out.println(result);
                break;
            }
            result++;
        }
    }
}
