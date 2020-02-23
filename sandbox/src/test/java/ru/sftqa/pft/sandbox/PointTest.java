package ru.sftqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

  public PointTest() {

  }

  @Test
  public void pointDistance() {
    int x1, x2, y1, y2;
    double d;
    x1 = 10;
    x2 = 8;
    y1 = 6;
    y2 = 4;
    d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    Assert.assertTrue(
            2.82842712474619030000 == d);
    System.out.print("Distance between to points is ");
    System.out.printf("%.20f", d);

  }


}


