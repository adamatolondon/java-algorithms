package com.algorithms.fibonacci;

/**
 * Fibonacci sequence: F(1)=1, F(2)=1, F(n)=F(n-1) + F(n-2). <br>
 * Calculate the value for a given index.
 */
public class Fibonacci {
  public int value(int index) {
    if(index < 0) throw new IllegalArgumentException();

    if(index == 0) return 1;

    int n_1=0, n_2=0, value=0;
    for(int i=0; i < index; ++i) {
      if(i == 0)
        n_1=1;
      else if(i == 1) n_2=1;

      value=n_1 + n_2;
      n_2=n_1;
      n_1=value;
    }

    return value;
  }

}
