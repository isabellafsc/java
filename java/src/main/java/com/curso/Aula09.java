// Aula 9 – Estruturas Condicionais (Parte 1)

package com.curso;

import java.util.Scanner;

public class Aula09 {
  public static void main(String[] args) {

    //CONDIÇÃO SIMPLES
    Scanner teclado = new Scanner(System.in);
    System.out.println("Primeira nota:");
    float n1 = teclado.nextFloat();
    System.out.println("Segunda nota:");
    float n2 = teclado.nextFloat();
    float m = (n1 + n2)/2;
    System.out.println("Sua média foi " + m);
    if (m > 9){
      System.out.println("Parabéns!");
    }
    teclado.close();

    //CONDIÇÃO COMPOSTA
    Scanner teclado2 = new Scanner(System.in);
    System.out.println("Em que ano você nasceu?");
    Integer nasc = teclado2.nextInt();
    Integer i = 2022 - nasc;
    if (i >= 18) {
      System.out.println("Maior de idade");
    } else {
      System.out.println("Menor de idade");
    }
    teclado2.close();

    Scanner teclado3 = new Scanner(System.in);
    System.out.println("Digite um número:");
    Integer n = teclado3.nextInt();
    if (n%2 == 0){
      System.out.println("Número par");
    } else {
      System.out.println("Número impar");
    } 
    teclado3.close();
  }
}
