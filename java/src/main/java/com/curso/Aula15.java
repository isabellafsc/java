package com.curso;

public class Aula15 {
  static void soma(int a, int b) {
    int s = a + b;
    System.out.println("A soma é " + s);
  }

  static int soma2(int a, int b) {
    int s = a + b;
    return s;
  }

  public static void main(String[] args) {
    System.out.println("Começou o programa");
    //Exemplo 1
    soma (5, 2);

    //Exemplo 2
    int sm = soma2(3, 6);
    System.out.println("A soma é " + sm);

    //Exemplo objeto
    System.out.println("Vai começar a contagem");
    System.out.println(Aula15Operacoes.contador(1, 5));
  }
}
