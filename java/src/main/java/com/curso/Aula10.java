// Aula 10 – Estruturas Condicionais (Parte 2)

package com.curso;

import java.util.Scanner;

public class Aula10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o ano em que nasceu:");
    Integer nasc = teclado.nextInt();
    Integer i = 2022 - nasc;
    if (i < 16) {
      System.out.println("Não vota");
    } else if (i >=70 || i < 18) {
      System.out.println("Voto opcional");
    } else {
      System.out.println("Voto obrigatório");
    }
    teclado.close();

    //CONDIÇÃO DE MÚLTIPLA ESCOLHA
    Scanner teclado2 = new Scanner(System.in);
    System.out.println("Quantas pernas?");
    Integer pernas = teclado2.nextInt();
    String tipo;
    switch (pernas){
      case 1:
        tipo = "Saci";
        break;
      case 2:
        tipo = "Bípede";
        break;
      case 4:
        tipo = "Quadrúpede";
        break;
      case 6:
        tipo = "Inseto";
        break;
      case 8:
        tipo = "Aranha";
        break;
      default:
        tipo = "ET";
    }
    teclado2.close();
    System.out.println(tipo);
  }
}
