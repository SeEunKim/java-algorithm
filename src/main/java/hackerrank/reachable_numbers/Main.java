package hackerrank.reachable_numbers;

import java.util.*;

/**
 * Created by SeEun Kim.
 * Date: 2019-05-10
 * Time: 23:10
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = Integer.parseInt(sc.nextLine());

        List<Long> results = new ArrayList<>();
        while (!results.contains(input)) {
            results.add(input);
            long result = (input + 1);

            while (result % 10 == 0) {
                result = result / 10;
            }
            input = result;
        }

        System.out.println(results.size());
    }
}
