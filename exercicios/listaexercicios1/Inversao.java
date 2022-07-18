package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inversao {
  public static void main(String[] args) 
  {
    Integer a, b, c, d;
    
    a = 2;
    b = 6;
    c = 4;
    d = 8;

    List<Integer> menor = new ArrayList<>();
    menor.add(a);
    menor.add(b);
    menor.add(c);
    menor.add(d);

    Collections.sort(menor);
    for (int i = menor.size()-1; i >= 0; i--) {
      System.out.println(menor.get(i));
    }
  }
}
