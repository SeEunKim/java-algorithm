package boj.problem2941;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] replceStr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < replceStr.length; i++) {
            input = input.replace(replceStr[i], "a");
        }
        System.out.println(input.length());
    }
}
