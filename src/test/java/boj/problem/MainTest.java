package boj.problem;

import org.junit.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MainTest {
    @Test
    public void test1() {
        int a = (9 | 30);
        System.out.println(a);
    }

    @Test
    public void test2() {
        String a = "1";
        System.out.println(a.charAt(0));;

        String aa ="A";
        System.out.println(aa.charAt(0) - 32);

    }

    @Test
    public void test3() {
        String a = "1q2w3e4r55t";
        String answer = "qwert";

        a = a.replaceAll("\\d", "");
        System.out.println(a);
    }

    @Test
    public void test4() {
        String a = "abd";
        System.out.println(a.charAt(0));
    }

    @Test
    public void test5() {
        String target = "ABAABAB";
        int M = target.length();
        int[] pi = new int[M];


        int[] failed = new int[M];
        for (int i = 1, j = 0; i < M; i++) {
            while (j > 0 && target.charAt(i) != target.charAt(j))
                j = failed[j - 1];
            if (target.charAt(i) == target.charAt(j))
                failed[i] = ++j;
        }


        int j = 0;
        for (int i = 1; i < M; i++) {
            System.out.println("j " + j);
            System.out.println(Arrays.toString(pi));

            while (j > 0 && target.charAt(i) != target.charAt(j)) {
                j = pi[j - 1];
                System.out.println("while?");
            }

            if (target.charAt(i) == target.charAt(j)) {
                pi[i] = ++j;
                System.out.println("if?");
            }
        }

        System.out.println(Arrays.toString(pi));


    }

    @Test
    public void test6() {
        int[] answer = {1, 2, 3};

        Set<Integer> s = new TreeSet<>();

        int[] arr = {1, 2, 3, 4, 1};


        for (int i : arr) {
            s.add(i);
        }

        System.out.println(s);

        Integer[] arrs = s.toArray(new Integer[s.size()]);
        System.out.println(Arrays.toString(arrs));

    }


}