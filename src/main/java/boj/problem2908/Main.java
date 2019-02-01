package boj.problem2908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb1.append(sc.next()).reverse();
        sb2.append(sc.next()).reverse();

        int result = Math.max(Integer.parseInt(sb1.toString()), Integer.parseInt(sb2.toString()));
        System.out.println(result);
    }
}
