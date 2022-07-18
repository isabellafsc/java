// Aula 14 – Vetores

package com.curso;

import java.util.Arrays;

public class Aula14 {
  public static void main(String[] args) {
    //Exemplo 1
    int n[] = {3, 2, 8, 7, 5, 4};
    for(int c=0; c<=n.length-1; c++ ){
      System.out.println("Na posição " + c + " temos o valor " + n[c]);
    }

    //Exemplo 2
    String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
    Integer total[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    for(int c=0; c < mes.length; c++) {
      System.out.println("O mês de " + mes[c] + " tem " + total[c] + " dias.");
    }

    //Exemplo 3 foreach
    double v[] = {3.5, 2.75, 9, -4.4};
    for (double valor : v) {
      System.out.print(valor+ " ");
    }
     System.out.println("");

    // Organizar vetor
    Arrays.sort(v);
    for (double valor2 : v) {
      System.out.print(valor2+ " ");
    }
     System.out.println("");
  
    // Busca binária
    int vet[] = {3, 7, 6, 1, 9, 4, 2};
    for (int i : vet) {
      System.out.print(i + " ");
    }
    System.out.println("");
    int p = Arrays.binarySearch(vet, 1);
    System.out.println("Encontrei o valor na posição " + p);

    // Preencher o vetor
    int[] y = new int[20];
    Arrays.fill(y, 0);
    for (int vy : y) {
      System.out.print(vy + " ");
    }
  }
}
