package boj.problem1920;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-11
 * Time: 21:01
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        Map<Integer, Integer> map = new HashMap<>();
        String[] numbers = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(numbers[i]);
            map.put(number, 0);
        }

        int M = Integer.parseInt(scanner.nextLine());
        String[] checkNumbers = scanner.nextLine().split(" " );
        for (int i = 0; i < M; i++) {
            int number = Integer.parseInt(checkNumbers[i]);
            if (map.get(number) == null) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}
