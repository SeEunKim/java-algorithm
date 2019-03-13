package hackerrank.migratory_birds;

import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    static int migratoryBirds(List<Integer> arr) {
        int[] types = new int[5];

        for (Integer integer : arr) {
            int index = integer;
            types[index - 1] = types[index - 1] + 1;
        }

        int max = 0;
        int result = 0;
        for (int i = 0; i < types.length; i++) {
            if (max < types[i]) {
                result = i + 1;
                max = types[i];
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr = Stream
                .of(bufferedReader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
