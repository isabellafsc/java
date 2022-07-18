package com.example;

public class SeisNumerosImpares {
  public static void main(String[] args) 
  {
    Integer x, qtd;
    x = 3;
    qtd = 0;

    for (int i = x; qtd < 6; i++) {
      if (i%2 == 1){
        System.out.println(i);
        qtd++;
      }
    }
  }
}
