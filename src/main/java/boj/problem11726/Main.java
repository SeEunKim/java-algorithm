package boj.problem11726;

import java.util.Scanner;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-18
 * Time: 17:15
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 10007;
        }

        System.out.println(arr[n]);
    }
}
