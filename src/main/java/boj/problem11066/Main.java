package boj.problem11066;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-09
 * Time: 19:00
 *
 * https://www.acmicpc.net/problem/11066
 * 파일 합치
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

    }
    static int sum = 0;
    public static int solution(int[] arr) {
        Arrays.sort(arr);
        int index = 0;
        if (arr.length % 2 == 1) {
            index = arr.length / 2 + 1;
        } else {
            index = arr.length / 2;
        }
        System.out.println("index : " + index);
        int[] newD = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(newD));

        while(index > 1) {
            newD = calc(newD, index);
            System.out.println(Arrays.toString(newD));
            if (newD.length == 2) {
                break;
            }
            if (newD.length% 2 == 1) {
                index = newD.length/ 2 + 1;
            } else {
                index = newD.length / 2;
            }
        }
        System.out.println("!!!1");
        System.out.println(Arrays.toString(newD));
        for (int i = 0; i < newD.length; i++) {
            sum += newD[i];
        }
        System.out.println("sum : " + sum);
        return 0;
    }

    public static int[] calc(int[] origin, int index) {
        System.out.println("index : " + index);




        int[] d = new int[index];
        for (int i = 0; i < index - 1; i++) {
            d[i] = origin[2 * i] + origin[2 * i + 1];
            System.out.println("d[i : " + d[i]);
            System.out.println("sum : " + sum);
            sum += d[i];
        }

        d[index - 1] = origin[origin.length - 1];
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));
        return d;
    }
}
