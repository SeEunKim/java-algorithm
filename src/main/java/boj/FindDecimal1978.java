package boj;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


/**
 * 백준 1978, 소수찾기
 *
 * 문제 : 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 * 입력 : 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 * 출력 : 주어진 수들 중 소수의 개수를 출력한다.
 *
 * 예제입력 :
 * 4
 * 1 3 5 7
 *
 * 예제출력 :
 * 3
 *
 */
public class FindDecimal1978 {
    public static void main(String[] args) throws IOException {
        final int MAX = 1000;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int decimalCount = 0;

        int numbersCount = Integer.parseInt(st.nextToken());
        int[] numbers = new int[numbersCount];


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numbersCount; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);

        // 소수찾기
        boolean[] arr = new boolean[MAX];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }

        int loopCount = (int) Math.sqrt(MAX);

        for (int i = 2; i < loopCount; i++) {
            for (int j = i; j * i < MAX; j++) {
                arr[j*i] = false;
            }
        }

        for (int i = 1; i < numbersCount; i++) {
            if (arr[numbers[i]] == true) {
                decimalCount++;
            }
        }

        bw.write(String.valueOf(decimalCount));

        bw.flush();
        bw.close();
    }
}
