package icreamedu.Q1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-03
 * Time: 15:04
 */



public class Main {
    public static void main(String[] args) {
        int[] input = {101, 2, 3, 4, 102, 3, 1, 2, 3, 101, 1, 5};
        int index = 0;

        Map<Integer, int[]> map = new HashMap<>();

        while (index < input.length) {
            int idNumber = input[index];
            index += 1;
            int size = input[index];
            int[] arr;
            index += 1;
            arr = Arrays.copyOfRange(input, index, index + size);
            index += size;

            if (map.get(idNumber) == null) {
                map.put(idNumber, arr);
            } else {
                int[] saveArr = map.get(idNumber);
                int[] newArr = new int[saveArr.length + arr.length];
                System.arraycopy(saveArr, 0, newArr, 0, saveArr.length);
                System.arraycopy(arr, 0, newArr, saveArr.length, arr.length);

                map.put(idNumber, newArr);
            }
        }

        for (Integer integer : map.keySet()) {
            int[] arr = map.get(integer);
            double average = Arrays.stream(arr).average().getAsDouble();
            int sum = Arrays.stream(arr).sum();

            System.out.print("ID : [" + integer + "]");
            System.out.print(" 평균 : [" + average + "]");
            System.out.println(" 합 : [" + sum + "]");
        }
    }
}


