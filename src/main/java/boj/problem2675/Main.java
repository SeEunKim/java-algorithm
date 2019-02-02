package boj.problem2675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < count; i++) {
            String[] strs = sc.nextLine().split(" ");
            int num = Integer.parseInt(strs[0]);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < strs[1].length(); j++) {
                for (int k = 0; k < num; k++) {
                    sb.append(strs[1].charAt(j));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
