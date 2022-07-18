package com.example;

public class Primo {
  
  public static void main(String[] args) 
  {
    int contador = 0;
    int x = 11;

    for (int k = 1; k <= x; k++) {
        if (x % k == 0) ++contador;
    }
    if (contador == 2) {
        System.out.println(x + " é primo");
    }else{
      System.out.println(x + " não é primo");
    }
  }
}
