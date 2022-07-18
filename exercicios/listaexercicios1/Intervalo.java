package com.example;

public class Intervalo {
  public static void main(String[] args) 
  {
    Integer x;

    x = 85;

    if ((x >= 0) && (x <= 25)){
      System.out.println("Intervalo entre 0 e 25");
    }else if(x > 25 && x <= 50){
      System.out.println("Intervalo entre 25 e 50");
    }else if(x > 50 && x <= 75){
      System.out.println("Intervalo entre 50 e 75");
    }else if(x > 75 && x <= 100){
      System.out.println("Intervalo entre 75 e 100");
    }else{
      System.out.println("Fora de intervalo");
    }
  }
}
