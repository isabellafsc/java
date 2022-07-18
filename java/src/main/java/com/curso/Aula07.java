//Aula 7 – Operadores Aritméticos e Classe Math

package com.curso;

public class Aula07 {
  public static void main(String[] args) {

    /* OPERADORES ARITMÉTICOS
     *  + -> Adição
     *  - -> Subtração
      *  * -> Multiplicação
      *  / -> Divisão
      *  % -> Resto
      */
      Integer n1 = 3;
      Integer n2 = 5;
      Float m = (n1 + n2)/2f;
      System.out.println("A média é " + m);
      
    /*CLASSE MATH
     * PI   | Constante pi  | Math.PI       | 3,1415...
     * pow  | Exponenciação | Math.pow(5,2) | 25
     * sqrt | Raiz Quadrada | Math.sqrt(25) | 5
     * cbrt | Raiz Cúbica   | Math.cbrt(27) | 3
     */
      Integer n3 = 49;
      System.out.println("A raiz quadrada de " + n3 + " é " + Math.sqrt(n3));
  
    /* ARREDONDAMENTOS
     * abs   | Valor Absoluto       | Math.abs(-10)   | 10
     * floor | Arredonda para baixo | Math.floor(3.9) | 3
     * ceil  | Arredonda para cima  | Math.ceil(4,2)  | 5
     * round | Arredonda aritmetico | Math.round(5.6) | 6 
    */  
      Float v = 8.3f;
      Integer ar = (int) Math.round(v);
      System.out.println(ar);
  
    /* GERADOR DE NÚMEROS
     * Math.random() -> gera número entre 0 e 1
     * Ex: um número entre 5 e 10:
     * (int)(5 +  Math.random() * (10 - 5))
     */
    }
}
