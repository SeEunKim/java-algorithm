package boj.problem2581;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = Integer.parseInt(sc.nextLine());
        int N = Integer.parseInt(sc.nextLine());

        boolean[] primeNumbers = new boolean[10_000 + 1];
        for (int i = 0; i < primeNumbers.length; i++) {
            primeNumbers[i] = true;
        }

        primeNumbers[0] = false;
        primeNumbers[1] = false;

        int sqrt = (int)Math.sqrt(primeNumbers.length);
        for (int i = 2; i < sqrt; i++) {
            for (int j = i; j * i < primeNumbers.length; j++) {
                if (primeNumbers[i * j]) {
                    primeNumbers[i * j] = false;
                }
            }
        }

        for (int i = 0; i < primeNumbers.length; i++) {
            if (primeNumbers[i]) {
                System.out.println(i);
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            if (primeNumbers[i]) {
              list.add(i);
            }
        }

        if (list.size() == 0) {
            System.out.println(-1);
        } else {
            long sum = 0;
            for (Integer integer : list) {
                sum += integer;
            }
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
    //todo 실패

}
