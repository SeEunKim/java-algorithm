package boj.problem2292;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        int number = 1;
        int count = 1;

        while (number < input) {
            number += count * 6;
            count++;
        }
        System.out.println(count);
    }
}
