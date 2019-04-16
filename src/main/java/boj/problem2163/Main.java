package boj.problem2163;

import java.util.Scanner;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-16
 * Time: 23:17
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        System.out.println((n * m) - 1);
    }
}
