package boj.problem5543;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        int hamburger = arr[0];
        for (int i = 0; i < 3; i++) {
            hamburger = Math.min(hamburger, arr[i]);
        }

        int drink = arr[3];
        for (int i = 3; i < 5; i++) {
            drink = Math.min(drink, arr[i]);
        }

        System.out.println(hamburger + drink - 50);
    }
}
