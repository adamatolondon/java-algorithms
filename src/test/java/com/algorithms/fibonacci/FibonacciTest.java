package com.algorithms.fibonacci;

import org.junit.Assert;
import org.junit.Test;


public class FibonacciTest {

  @Test
  public void testSimple() {
    Fibonacci fibonacci=new Fibonacci();
    Assert.assertEquals(1,fibonacci.value(0));
    Assert.assertEquals(1,fibonacci.value(1));
    Assert.assertEquals(2,fibonacci.value(2));
    Assert.assertEquals(3,fibonacci.value(3));
    Assert.assertEquals(5,fibonacci.value(4));
    Assert.assertEquals(8,fibonacci.value(5));
  }


  @Test(expected=IllegalArgumentException.class)
  public void testException() {
    Fibonacci fibonacci=new Fibonacci();
    fibonacci.value(-1);
  }
}
