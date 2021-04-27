package com.tduyve.examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestRectangleType {

   @Test
   public void rectangleTest() {
      assertNotNull(new RectangleType());
   }

   @Test
   public void triangleTestInv() {
      assertEquals(RectangleType.rectangle(0, 1), Rectangle.INVALID);
      assertEquals(RectangleType.rectangle(1, 0), Rectangle.INVALID);
      assertEquals(RectangleType.rectangle(0, 0), Rectangle.INVALID);
   }

   @Test
   public void RectangleTestRectangle() {
      assertEquals(RectangleType.rectangle(1, 2), Rectangle.RECTANGLE);
   }

   @Test
   public void rectangleTestSquare() {
      assertEquals(RectangleType.rectangle(1, 1), Rectangle.SQUARE);
   }
}
