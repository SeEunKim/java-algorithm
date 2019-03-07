package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());


        Mapping m = new Mapping();

        Month month = m.getMonth(num);
        month.create(num);
    }
}
