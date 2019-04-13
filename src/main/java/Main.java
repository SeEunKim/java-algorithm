import com.sun.tools.jdi.IntegerValueImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-12
 * Time: 16:34
 */


public class Main {
    public static LinkedList<Integer> graph[]; // 인접 리스트 그래프
    public static int n, indegree[]; // 진입차수를 세기 위한 배열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line[] = sc.nextLine().split(" ");
        int from, to, m;
        n = Integer.parseInt(line[0]);
        m = Integer.parseInt(line[1]);

        indegree = new int[n];
        graph = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new LinkedList<>();
        }
        for (int i = 0; i < m; i++) {
            line = sc.nextLine().split(" ");

            from = Integer.parseInt(line[0]) - 1; // 인덱스 - 1
            to = Integer.parseInt(line[1]) - 1;
            graph[from].add(to); // 인접리스트를 이용해 from -> to 표현
            indegree[to]++; // 진입 차수를 계산해야 하므로 to의 진입차수 + 1;
        }

        topologicalSort(); // 위상 정렬
        sc.close();
    }

    private static void topologicalSort() {
        Queue<Integer> searchQ = new LinkedList<>(); // 탐색 큐
        Queue<Integer> resultQ = new LinkedList<>(); // 결과 큐

        // 초기 진입차수가 0인 노드 탐색 후 탐색 큐에 삽입
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                searchQ.offer(i);
            }
        }

        // 탐색 큐가 빌 때까지 계속 탐색
        while (!searchQ.isEmpty()) {
            // 진입노드가 0인 노드와 연결된 노드를 탐색하기 위해 저장
            int zeroIndegreeNode = searchQ.poll();
            resultQ.offer(zeroIndegreeNode); // 진입노드 0 = 정렬 완료 ->  결과 큐에 삽입

            for(int linkedNode : graph[zeroIndegreeNode]) {
                indegree[linkedNode]--;

                // 연결된 노드 진입차수 수정 결과가 0이면
                if (indegree[linkedNode] == 0) {
                    searchQ.offer(linkedNode); // 추후 탐색을 위해 탐색 큐에 삽입
                }
            }

            while(!resultQ.isEmpty()) {
                System.out.print((resultQ.poll() + 1) + " ");
            }
       }
    }

}
