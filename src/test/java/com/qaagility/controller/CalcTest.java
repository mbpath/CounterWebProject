package com.qaagility.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalcTest {

  public void testSlow() {
    System.out.println("slow");
  }
  public void testSlower() {
    System.out.println("slower");
  }
  public void testFast() {
    System.out.println("fast-updated");
  }
  
 @Test  
    public void testCalc() {
      assertsquals("Result",9,9);
}
}
