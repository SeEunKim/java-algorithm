package programmers.방문길이;

import java.util.*;

/**
 * Created by SeEun Kim.
 * Date: 2019-05-02
 * Time: 22:18
 */
class Solution {
    private static Point current;
    private static Set<Line> set;
    public int solution(String dirs) {
        String[] dirsArr = dirs.split("");
        current = new Point(0,0);
        set = new HashSet<>();

        for (String s : dirsArr) {
            moveCharacter(s);
        }

        return set.size();
    }
    private void moveCharacter(String dir) {
        Point tmp = Point.copyOf(current);
        switch (dir) {
            case "U":
                tmp.move(0, 1);
                break;
            case "D":
                tmp.move(0, -1);
                break;
            case "R":
                tmp.move(1, 0);
                break;
            case "L":
                tmp.move(-1, 0);
                break;
        }

        if (isRange(tmp)) {
            Point[] points = {current, tmp};
            set.add(new Line(points));
            current = tmp;
        }
    }

    private boolean isRange(Point p) {
        return ((-5 <= p.getX()) && (p.getX() <= 5) && (-5 <= p.getY()) && (p.getY() <= 5));
    }

}
class Point implements Comparable<Point>{
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static Point copyOf(Point p) {
        return new Point(p.getX(), p.getY());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    void move(int _x, int _y) {
        this.x += _x;
        this.y += _y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public int compareTo(Point o) {
        int ret = 0;
        if (this.getX() > o.getX()) {
            ret = -1;
        }
        if (this.getX() == o.getX()) {
            if (this.getY() > o.getY()) {
                ret = 1;
            } else if (this.getY() == o.getY()) {
                ret = 0;
            } else {
                ret =-1;
            }
        }
        if (this.getX() < o.getX()) {
            ret = 1;
        }
        return ret;
    }
}

class Line {
    private Point start;
    private Point end;

    Line(Point[] points) {
        Arrays.sort(points);
        this.start = points[0];
        this.end = points[1];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(start, line.start) &&
                Objects.equals(end, line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }
}