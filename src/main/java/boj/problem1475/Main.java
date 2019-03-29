package boj.problem1475;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace("9", "6");
        String[] splited = input.split("");
        int[] numbersCount = new int[9];

        for (int i = 0; i < splited.length; i++) {
            int tmp = Integer.parseInt(splited[i]);
            int count = numbersCount[tmp];
            numbersCount[tmp] = count + 1;
        }

        int tmp = numbersCount[6];
        numbersCount[6] = (int) Math.ceil(tmp / 2.0);

        int result = 0;
        for (int i = 0; i < numbersCount.length; i++) {
            result = Math.max(result, numbersCount[i]);
        }

        System.out.println(result);
    }
}
