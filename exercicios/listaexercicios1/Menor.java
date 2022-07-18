package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Menor {
  public static void main(String[] args) 
  {
    List <Integer> num = new ArrayList<>();
    num.add(5);
    num.add(12);
    num.add(8);
    num.add(3);

    Collections.sort(num);
    System.out.println(num.get(0));
  }
}
