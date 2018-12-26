package boj;

import java.io.*;

public class Sort2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int indexMin, temp;

        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }
            temp = arr[indexMin];
            arr[indexMin] = arr[i];
            arr[i] = temp;
        }

        //bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }




        for (int i = 0; i < count; i++) {
            bw.write(String.valueOf(arr[i]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    public static void InsertionSort(int[] arr) {
        //insertion sort
        int temp, aux;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            aux = i - 1;

            while (aux >= 0 && arr[aux] > temp) {
                arr[aux+1] = arr[aux];
                aux--;
            }
            arr[aux+1] = temp;
        }
    }
}
