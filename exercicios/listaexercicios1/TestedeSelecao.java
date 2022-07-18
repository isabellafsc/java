

package com.example;

public class TestedeSelecao {
  public static void main(String[] args) 
  {
    Integer a, b, c, d;
    
    a = 2;
    b = 6;
    c = 4;
    d = 8;

    if(b > c && d > a && ((c + d) > (a + b)) && c > 0 && d > 0 && ((a%2) == 0)){
      System.out.println("Valores aceitos");
    }else{
      System.out.println("Valores não aceitos");
    }
  }
}
