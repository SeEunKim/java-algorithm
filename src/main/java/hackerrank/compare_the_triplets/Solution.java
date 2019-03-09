package hackerrank.compare_the_triplets;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                countA++;
            } else if (a.get(i) < b.get(i)) {
                countB++;
            }
        }
        return Arrays.asList(countA, countB);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> a = Stream.of(bufferedReader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = compareTriplets(a, b);
        bufferedWriter.write(result.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")) + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}
