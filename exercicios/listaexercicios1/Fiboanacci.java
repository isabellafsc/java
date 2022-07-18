package com.example;

public class Fiboanacci {
  public static void main(String[] args) 
  {
    Integer n1, n2, x;
    n1 = 1;
    n2 = 0;
    x = 10;
    System.out.println(n2);
    System.out.println(n1);

    for (int i = 0; i < x; i++) {
      n1 = n1 + n2;
      n2 = n1 - n2;
      System.out.println(n1);
    }
  }
}
