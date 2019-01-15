package boj;

//4 6
//        101111
//        101010
//        101011
//        111011


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ExploreTheMaze2178 {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int N = Integer.parseInt(strings[0]);
        int M = Integer.parseInt(strings[1]);

        int[][] arr = new int[N][M];
        visited = new boolean[N][M];

        String string;
        for (int i = 0; i < N; i++) {
            string = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j]= Integer.parseInt(String.valueOf(string.charAt(j)));
                visited[i][j] = false;
            }
        }
        bfs(arr, N, M);
    }

    static void bfs(int maze[][], int N, int M){
        int distance[][] = new int[N][M];
        Queue<Point2178> queue = new LinkedList<>();
        int x[] = {0,-1,0,1}; // ---- 1
        int y[] = {1,0,-1,0}; // ---- 1

        queue.add(new Point2178(0,0));
        distance[0][0] = 1;

        while(!queue.isEmpty()){
            Point2178 point = queue.poll();
            int pointX = point.x;
            int pointY = point.y;
            if(pointX == N-1 && pointY == M-1){
                break;
            }
            for(int i = 0; i < 4; i++){
                int toVisitX = pointX + x[i];
                int toVisitY = pointY + y[i];
                if(toVisitX >= 0 && toVisitX < N && toVisitY >=0 && toVisitY < M){
                    if(maze[toVisitX][toVisitY] != 0 && visited[toVisitX][toVisitY] != true){
                        visited[toVisitX][toVisitY] = true; // ---- 2
                        queue.add(new Point2178(toVisitX, toVisitY)); // ---- 3
                        distance[toVisitX][toVisitY] = distance[pointX][pointY] + 1; // ---- 4
                    }
                }
            }
        }
        System.out.println(distance[N-1][M-1]);
    }
}

class Point2178 {
    int x;
    int y;

    public Point2178(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
