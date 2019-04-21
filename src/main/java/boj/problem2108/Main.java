package boj.problem2108;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Solution s = new Solution();
        Result result = s.solution(arr);
        System.out.println(result.getArithmeticMean());
        System.out.println(result.getMedian());
        System.out.println(result.getMode());
        System.out.println(result.getRange());
    }
}
class Solution {
    public Result solution(int[] arr) {
        Result result = new Result();

        if (arr.length == 1) {
            result.setArithmeticMean(arr[0]);
            result.setMode(arr[0]);
            result.setMedian(arr[0]);
            result.setRange(0);
            return result;
        }

        int arithmeticMean = (int)Math.round(Arrays.stream(arr).average().getAsDouble());
        result.setArithmeticMean(arithmeticMean);

        Arrays.sort(arr);
        result.setMedian(arr[arr.length / 2]);

        Map<Integer, Integer> map = new HashMap<>();
        for (int number : arr) {
            if (map.get(number) == null) {
                map.put(number, 0);
            } else {
                int count = map.get(number);
                map.put(number, count + 1);
            }
        }
        int mode = 0;
        for (Integer value : map.values()) {
            mode = Math.max(mode, value);
        }

        List<Integer> modes = new ArrayList<>();
        if (mode == 0) {
            result.setMode(arr[1]);
        } else {
            for (Integer integer : map.keySet()) {
                int tmp = map.get(integer);
                if (tmp == mode) {
                    modes.add(integer);
                }
            }
            Collections.sort(modes);
            result.setMode(modes.get(1));
        }

        result.setRange(Math.abs(arr[0] - arr[arr.length - 1]));

        return result;
    }
}

class Result {
    // 산술평균. 소수점 이하 첫째 자리에서 반올림한 값을 출력
    private int arithmeticMean;

    // 중앙값
    private int median;

    // 최빈값, 여러개 있을 때에는 최빈값 중 두번째로 작은 값을 출력
    private int mode;

    // 범위
    private int range;

    public int getArithmeticMean() {
        return arithmeticMean;
    }

    public int getMedian() {
        return median;
    }

    public int getMode() {
        return mode;
    }

    public int getRange() {
        return range;
    }

    public void setArithmeticMean(int arithmeticMean) {
        this.arithmeticMean = arithmeticMean;
    }

    public void setMedian(int median) {
        this.median = median;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
