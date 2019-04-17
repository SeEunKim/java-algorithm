package boj.problem10951;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.stream.Stream;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-17
 * Time: 22:48
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(!br.readLine().isEmpty()) {
            int[] line = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(line[0] + line[1]);
        }
    }
}
