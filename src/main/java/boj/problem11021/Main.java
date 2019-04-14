package boj.problem11021;

import java.util.Scanner;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-14
 * Time: 22:45
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= t; i++) {
            String[] line = sc.nextLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);

            System.out.println("Case #" + i + ": " + (a + b));
        }
    }
}
