package com.qaagility.controller;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import com.qaagility.controller.Calculator;

public class AppTest {
  

Calculator myCalc = new Calculator();

  
 @Before
  
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
  assertEquals("Result",9,myCalc.add());
  }
  @After
  public void testCalc() {
  System.out.println("fast-updated");  }

  
  }
