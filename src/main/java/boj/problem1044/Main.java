package boj.problem1044;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SeEun Kim.
 * Date: 2019-05-06
 * Time: 18:59
 */
public class Main {
    private static long[] originteamA;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int playerNumber = Integer.parseInt(br.readLine());
        long[] evaluationOfTeamA = new long[playerNumber];
        long[] evaluationOfTeamB = new long[playerNumber];
        originteamA = new long[playerNumber];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < playerNumber; i++) {
            evaluationOfTeamA[i] = Long.parseLong(input[i]);
            originteamA[i] = Integer.parseInt(input[i]);
        }

        input = br.readLine().split(" ");
        for (int i = 0; i < playerNumber; i++) {
            evaluationOfTeamB[i] = Long.parseLong(input[i]);
        }

        permutation(evaluationOfTeamA, evaluationOfTeamB);

    }
    private static void permutation(long[] teamA, long[] teamB) {
        permutation(teamA, teamB, 0);

        int indexA = 0;
        for (int i = 0; i < teamA.length; i++) {
            if (originteamA[i] == teamA[indexA]) {
                System.out.print("1");
                indexA++;
            } else {
                System.out.print("2");
            }
            System.out.print(" ");
        }
    }

    private static long permutation(long[] teamA, long[] teamB, int current) {
        if (current == teamA.length) {
            long sumA = 0;
            long sumB = 0;

            for (int i = 0; i < teamA.length/2; i++) {
                sumA += teamA[i];
            }

            for (int i = teamA.length / 2; i < teamA.length; i++) {
                sumB += teamB[i];
            }

            if (sumA == sumB) {
                return sumA;
            }
        }

        for (int i = 0; i + current < teamA.length ; i++) {
            swap(teamA, current, current+i);
            swap(teamB, current, current+i);

            long result = permutation(teamA, teamB, current+1);
            if (result != -1) {
                return result;
            }

            swap(teamA, current, current+i);
            swap(teamB, current, current+i);
        }

        return -1;
    }

    private static void swap(long[] arr, int a, int b) {
        long tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}

