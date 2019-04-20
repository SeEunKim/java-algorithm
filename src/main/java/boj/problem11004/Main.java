package boj.problem11004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-20
 * Time: 22:55
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int[] arr = new int[n];
        input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int result = quickSort(arr, 0, arr.length - 1, k- 1);
        System.out.println(result);
    }


    private static int quickSort(int[] arr, int start, int end, int k) {
            int pivot = partition(arr, start, end);

            if (pivot == k) {
                return arr[k];
            } else if (pivot > k){
                return quickSort(arr, start, pivot - 1, k);
            } else {
                return quickSort(arr, pivot + 1, end, k);
            }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int idx = start - 1;
        for (int i = start; i < end; i++) {
            if(arr[i] < pivot) {
                swap(arr, ++idx, i);
            }
        }
        swap(arr, ++idx, end);
        return idx;
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
