package boj.problem10871;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * X보다 작은 수
 *
 * 10 5
 * 1 10 4 9 2 3 8 5 7 6
 *
 * 1 4 2 3
 */
public class LessThanX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int standard = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        List<Integer> answers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        for (Integer integer : list) {
            if (integer < standard) {
                answers.add(integer);
            }
        }

        for (int i = 0; i < answers.size(); i++) {
            bw.write(String.valueOf(answers.get(i)));
            bw.write(" ");
        }
        bw.flush();

        bw.close();
        br.close();
    }
}


