package boj.problem10798;

import java.util.Scanner;

/**
 * Created by SeEun Kim.
 * Date: 2019-05-14
 * Time: 23:08
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] input = new String[5][];

        for (int i = 0; i < 5; i++) {
            input[i] = sc.nextLine().split("");
        }

        int maxLength = 0;
        for (int i = 0; i < 5; i++) {
            maxLength = Math.max(maxLength, input[i].length);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (input[j].length > i) {
                    if (input[j][i] != null) {
                        sb.append(input[j][i]);
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }
}
