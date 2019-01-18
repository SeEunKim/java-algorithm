package codeforces.B.B1100;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * https://codeforces.com/contest/1100/problem/B
 * B. Build a Contest
 */


// 못품 세번째에서 실패
public class BuildaContest1100B {
    public static void main(String[] args) throws IOException {
        //todo 실패
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int difficultyLevels = Integer.parseInt(st.nextToken());
        int numberOfProblems = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        List<Integer> answers= new ArrayList<>();
        List<Integer> checkAnswer = new ArrayList<>();
        for (int i = 0; i < difficultyLevels; i++) {
            checkAnswer.add(0);
        }

        for (int i = 0; i < numberOfProblems; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < numberOfProblems; i++) {
            checkAnswer.set(list.get(i) - 1, 1);

            if (!checkAnswer.contains(0)) {
                answers.add(1);
                checkAnswer.clear();
                for (int j = 0; j < difficultyLevels; j++) {
                    checkAnswer.add(0);
                }
            } else {
                answers.add(0);
            }

        }

        for (int i = 0; i < answers.size(); i++) {
            bw.write(String.valueOf(answers.get(i)));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}

