
// Aula 13 – Estruturas de Repetição (Parte 3)

package com.curso;

public class Aula13 {
  public static void main(String[] args) {
    //Exemplo 1
    for(int cc = 0; cc < 4; cc++) {
      System.out.println("cambalhota" + cc);
    }
    //Exemplo 2
    for(int n = 0; n <= 100; n += 10){
      System.out.println(n);
    }
    //Exemplo Laços Aninhados
    for(int i = 1; i <= 3; i++) {
      for(int j = 0; j <= 2; j+= 2){
        System.out.println("i = " + i + "  ------  j = " + j);
      }
    }
  }
}
