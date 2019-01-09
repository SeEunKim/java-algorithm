package boj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TheAverageIsOver4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int cycle = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[5];
        for (int i = 0; i < cycle; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            for (int j = 0; j < count; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            double average = list.stream().mapToInt(a -> a).average().orElse(0);
            long overAverageCount = list.stream().filter(x -> x > average).count();
            double result = ((double)overAverageCount / count) * 100;

            bw.write(String.format("%.3f", result) + "%");
            bw.newLine();
            bw.flush();

            list.clear();
        }


        br.close();
        bw.close();
    }
}
