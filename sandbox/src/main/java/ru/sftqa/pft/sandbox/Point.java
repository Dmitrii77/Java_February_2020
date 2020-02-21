package ru.sftqa.pft.sandbox;

public class Point {
  public Point(int p, int p1, int p2, int p3) {

  }

  public static void main(String arg[]) {
    int x1, x2, y1, y2;
    double d;
    x1 = 10;
    x2 = 8;
    y1 = 6;
    y2 = 4;
    d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    System.out.printf("%.20f", d);
  }

  public Object distance() {
    return null;
  }
}

