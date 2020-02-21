package ru.sftqa.pft.sandbox;

public class Point3 {
  public static void main(String arg[]) {

    Point p = new Point(2,6,4,8);

    System.out.printf("Distance between 2 points: " + "%.2f", p.distance());
  }
}

