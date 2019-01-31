package kakaocodingtest.problem25294;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr1 = {4, 2, 2, 5, 3};
        int[] arr2 = {100, 1, 50, 1, 1};
        //int[] result = s.solution(3, arr1);
        int[] result = s.solution(1, arr2);
        System.out.println(Arrays.toString(result));
        //2 3 1 5 4
    }

}

class Solution {
    public int[] solution(int N, int[] coffee_times) {
        int[] answer = new int[coffee_times.length];

        Queue<Order> q1 = new LinkedList<>();
        for (int i = 0; i < coffee_times.length; i++) {
            q1.add(new Order(i, coffee_times[i]));
        }

        List<Order> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(q1.poll());
        }

        int cnt = 0;
        while (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                Order old = list.get(i);
                old.setTime(old.getTime() - 1);

                if (list.get(i).getTime() == 0) {
                    answer[cnt] = list.get(i).getIndex() + 1;
                    cnt++;
                    list.remove(i);

                    if (!q1.isEmpty()) {
                        list.add(i, q1.poll());
                    }
                }
            }
        }
        return answer;
    }
}

class Order {
    private int index;
    private int time;

    public Order(int index, int time) {
        this.index = index;
        this.time = time;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "index=" + index +
                ", time=" + time +
                '}';
    }
}
