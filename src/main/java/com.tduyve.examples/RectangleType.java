package com.tduyve.examples;

public class RectangleType {

  public static Rectangle rectangle(int s1, int s2) {
     Boolean fail = false;
     if (s1 <= 0 || s2 <= 0 ) {
        return (Rectangle.INVALID);
     }
     if (s1 == s2) {
        return (Rectangle.SQUARE);
     }
        
     return Rectangle.RECTANGLE;
  }

}