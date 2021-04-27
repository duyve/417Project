package com.tduyve.examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class TestTriangleType {

   @Test
   public void triangleTest() {
      assertNotNull(new TriangleType());
   }

   @Test
   public void triangleTestInv() {
      assertEquals(TriangleType.triangle(0, 1, 2), Triangle.INVALID);
      assertEquals(TriangleType.triangle(1, -1, 2), Triangle.INVALID);
      assertEquals(TriangleType.triangle(1, 1, 0), Triangle.INVALID);
      assertEquals(TriangleType.triangle(1, 1, 2), Triangle.INVALID);
      assertEquals(TriangleType.triangle(2, 1, 1), Triangle.INVALID);
      assertEquals(TriangleType.triangle(1, 3, 1), Triangle.INVALID);

   }

   @Test
   public void triangleTestEqui() {
      assertEquals(TriangleType.triangle(7, 7, 7), Triangle.EQUILATERAL);
   }

   @Test
   public void triangleTestIsos() {
      assertEquals(TriangleType.triangle(2, 2, 1), Triangle.ISOSCELES);
      assertEquals(TriangleType.triangle(1, 2, 2), Triangle.ISOSCELES);
      assertEquals(TriangleType.triangle(2, 1, 2), Triangle.ISOSCELES);

   }

   @Test
   public void triangleTestScalene() {
      assertEquals(TriangleType.triangle(3, 4, 5), Triangle.SCALENE);
   }

}
