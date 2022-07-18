//SORT SIMPLES - Supondo que existem 3 variáveis de números inteiros, exiba esses números em ordem crescente.

package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class SortSimples {
  public static void main(String[] args) 
  {
    try (Scanner numeros = new Scanner(System.in)) {
      int[] lista = new int[3];
        for (int i = 0; i < lista.length; i++) {
          System.out.println("Digite um número: ");
          lista[i] = (numeros.nextInt());
        }
        Arrays.sort(lista);
        System.out.println("Ordem crescente: ");
        for (int i = 0; i < lista.length; i++) {
          System.out.println(lista[i]);
        }
    }
  }
}
