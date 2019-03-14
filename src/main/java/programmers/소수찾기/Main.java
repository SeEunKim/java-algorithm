package programmers.소수찾기;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String input = "17";
        int result = s.solution(input);
        System.out.println(result);
    }
}
class Solution {
    boolean[] primeNumbers;
    int count = 0;
    public int solution(String numbers) {
        final int MAX = 10000000;

        primeNumbers = new boolean[MAX];

        primeNumbers[0] = true;
        primeNumbers[1] = true;

        int arrCount = (int)Math.sqrt(MAX);
        for (int i = 2; i < arrCount; i++) {
            if (!primeNumbers[i]) {
                for (int j = i * i; j < MAX; j += i) {
                    primeNumbers[j] = true;
                }
            }
        }

        char[] list = numbers.toCharArray();

        Set<Integer> primeInputNumbers = new HashSet<>();;
        for (int i = 1; i <= list.length; i++) {
            perm(list, 0, i, primeInputNumbers);
        }

        for (Integer primeInputNumber : primeInputNumbers) {
            if (!primeNumbers[primeInputNumber]) {
                count++;
            }
        }
        return count;
    }

    private void perm(char[] arr, int depth, int k, Set primeInputNumbers) {
        if (depth == k) {
            print(arr, k, primeInputNumbers);
            return;
        } else {
            for (int i = depth; i < arr.length; i++) {
                swap(arr, i, depth);
                perm(arr, depth + 1, k, primeInputNumbers);
                swap(arr, i, depth);
            }
        }
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void print(char[] arr, int k, Set primeInputNumbers) {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < k; i++) {
            //System.out.print(arr[i]);
            a.append(arr[i]);
            primeInputNumbers.add(Integer.parseInt(a.toString()));
        }
        System.out.println();
    }
}