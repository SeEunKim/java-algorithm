package hackerrank.bon_appetit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                sum += bill.get(i);
            }
        }

        int payForBrian = sum / 2;
        if (payForBrian == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - payForBrian);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        List<Integer> bill = Stream
                .of(bufferedReader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());
        bonAppetit(bill, k, b);
        bufferedReader.close();
    }
}
