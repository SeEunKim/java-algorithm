package joonggo.Q3;

import java.io.*;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numbers = br.readLine().split(" ");
        Point point = new Point(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]));
        bw.write(String.valueOf(point.findQuadrant()));
        bw.newLine();
        br.close();
        bw.close();
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int findQuadrant() {
        int quadrant = 0;
        if (x > 0 && y > 0) {
            quadrant = 1;
        }

        if (x < 0 && y > 0) {
            quadrant = 2;
        }

        if (x < 0 && y < 0) {
            quadrant = 3;
        }

        if (x > 0 && y < 0) {
            quadrant = 4;
        }

        return quadrant;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}