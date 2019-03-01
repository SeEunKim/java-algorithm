package boj.problem10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        Queue q = new Queue();

        for (int i = 0; i < size; i++) {
            String[] order = br.readLine().split(" ");

            switch (order[0]) {
                case "push":
                    q.push(Integer.parseInt(order[1]));
                    break;
                case "front":
                    q.front();
                    break;
                case "back":
                    q.back();
                    break;
                case "size":
                    q.size();
                    break;
                case "empty":
                    q.empty();
                    break;
                case "pop":
                    q.pop();
                    break;
            }
        }
    }
}

class Queue {
    private int front;
    private int back;
    private int[] arr = new int[10001];

    void push(int x) {
        arr[back++] = x;
    }

    void pop() {
        if (isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(arr[front]);
            arr[front++] = 0;
        }
    }

    public void size() {
        System.out.println(back - front);
    }

    void empty() {
        if (isEmpty()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    void front() {
        if (isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(arr[front]);
        }
    }

    void back() {
        if (isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(arr[back-1]);
        }
    }

    private boolean isEmpty() {
        return (back - front) == 0;
    }
}