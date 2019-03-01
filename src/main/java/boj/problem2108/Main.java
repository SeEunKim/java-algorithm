package boj.problem2108;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer size = Integer.parseInt(sc.nextLine());
        Map<Integer, Integer> map = new HashMap<>();

        int[] arr = new int[size];
        double sum = 0;
        int max = 0;

        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(sc.nextLine());
            if (map.get(num) == null) {
                map.put(num, 0);
            } else {
                int count = map.get(num);
                map.put(num, count + 1);
                max = count + 1;
            }
            arr[i] = num;
            sum += num;
        }

        Arrays.sort(arr);

        System.out.println(Math.round(sum / size.doubleValue()));
        System.out.println(arr[size/2]);

        List<Integer> list = new ArrayList<>();

        if (max == 0) {
            if (size == 1) {
                System.out.println(arr[0]);
            } else {
                System.out.println(arr[1]);
            }
        } else {
            for (Integer integer : map.keySet()) {
                int tmp = map.get(integer);
                if (tmp == max) {
                    list.add(integer);
                }
            }
            Collections.sort(list);
            System.out.println(list.get(1));
        }
        System.out.println(arr[size-1] - arr[0]);
        //todo 실패
    }
}
