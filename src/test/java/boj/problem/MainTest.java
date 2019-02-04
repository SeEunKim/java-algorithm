package boj.problem;

import org.junit.Test;

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


}