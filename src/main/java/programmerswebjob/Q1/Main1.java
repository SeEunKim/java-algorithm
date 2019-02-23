package programmerswebjob.Q1;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 33;
        int result = s.solution(n);
        System.out.println(result);

    }
}
class Solution {
    public int solution(int n) {
        final int MAX = 10000;

        boolean[] isDecimal = new boolean[MAX];
        for (int i = 0; i < isDecimal.length; i++) {
            isDecimal[i] = true;
        }

        int loopCount = (int)Math.sqrt(MAX);

        for (int i = 2; i < loopCount; i++) {
            for (int j = i; j * i < MAX ; j++) {
                isDecimal[i * j] = false;
            }
        }

        List<Integer> lowerDecimalthanN = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            if (isDecimal[i]) {
                lowerDecimalthanN.add(i);
            }
        }

        Set<Numbers> numbers = new HashSet<>();

        for (int i = 0; i < lowerDecimalthanN.size(); i++) {
            for (int j = i + 1; j < lowerDecimalthanN.size(); j++) {
                for (int k = + 1; k < lowerDecimalthanN.size(); k++) {
                    int sum = lowerDecimalthanN.get(i) + lowerDecimalthanN.get(j) + lowerDecimalthanN.get(k) ;
                    if (sum > n) {
                        break;
                    }

                    if (sum == n) {
                        if (!lowerDecimalthanN.get(i).equals(lowerDecimalthanN.get(j)) && !lowerDecimalthanN.get(j).equals(lowerDecimalthanN.get(k))
                                && !lowerDecimalthanN.get(k).equals(lowerDecimalthanN.get(i))) {
                            int[] a = new int[3];
                            a[0] = lowerDecimalthanN.get(i);
                            a[1] = lowerDecimalthanN.get(j);
                            a[2] = lowerDecimalthanN.get(k);
                            Arrays.sort(a);
                            Numbers num = new Numbers(a[0], a[1], a[2]);
                            numbers.add(num);
                        }

                    }
                }
            }
        }
        return numbers.size();
    }
}

class Numbers {
    int x;
    int y;
    int z;

    public Numbers(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numbers numbers = (Numbers) o;
        return x == numbers.x &&
                y == numbers.y &&
                z == numbers.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}