import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by SeEun Kim.
 * Date: 2019-04-12
 * Time: 16:34
 */


/**
 * 8 9  // 노드 갯수와 간선의 갯수
 */
public class Main {
    public static LinkedList<Integer> graph[]; // 인접 리스트 그래프
    public static int n, indegree[]; // 진입차수를 세기 위한 배
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line[] = sc.nextLine().split(" ");
        int i, from, to, m;
        n = Integer.parseInt(line[0]);
        m = Integer.parseInt(line[1]);

        indegree = new int[n];

    }
}
