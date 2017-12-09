package com.qaagility.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalcTest {

  public viod testSlow() {
    System.out.println("slow");
  }
  public viod testSlower() {
    System.out.println("slower");
  }
  public viod testFast() {
    System.out.println("fast-updated");
  }
  
 @Test  
    public void testCalc() {
      assertsquals("Result",9,9);
}
}
