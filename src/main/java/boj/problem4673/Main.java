package boj.problem4673;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-22
 * Time: 23:11
 */
public class Main {
    public static void main(String[] args) {
        boolean[] isSelfNumber = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
           int tmp = i + addEachDigit(i);
           if (tmp <= 10000) {
               isSelfNumber[tmp] = true;
           }
        }

        for (int i = 1; i < 10001; i++) {
            if (!isSelfNumber[i]) {
                System.out.println(i);
            }
        }
    }

    private static int addEachDigit(int number) {
        int divisionNumber = number;
        int sum = 0;

        while (divisionNumber > 0) {
            sum += divisionNumber % 10;
            divisionNumber = divisionNumber / 10;
        }
        return sum;
    }
}
