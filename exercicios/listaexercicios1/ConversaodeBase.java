package com.example;

public class ConversaodeBase {
  public static void main(String[] args) 
  {
    converterParaBinario(100);
  }
  private static void converterParaBinario(int n) {
    if (n > 0){
      converterParaBinario(n/2);
      System.out.print(+ n %2);
    }
  }
}
