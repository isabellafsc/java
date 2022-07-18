package com.example;

public class Fatorial {
  public static void main(String[] args) 
  {
    Integer n, fat;
    n = fat = 6;
  
    for (int i = fat-1; i != 0; i--) {
      fat = fat * i;
    }
    System.out.println(n+ "! = "+ fat);
  }
}
