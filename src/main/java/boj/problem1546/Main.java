package boj.problem1546;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[cnt];
        String[] inputs = sc.nextLine().split(" ");

        for (int i = 0; i < cnt; i++) {
            numbers[i] = Integer.parseInt(inputs[i]);
        }

        double max = numbers[0];
        for (int number : numbers) {
            max = Math.max(number, max);
        }

        double sum = 0;
        for (int number : numbers) {
            sum += (number / max) * 100;
        }

        double result = sum / cnt;
        System.out.println(String.format("%.2f", result));
    }
}
