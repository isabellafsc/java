// Aula 8 – Operadores Lógicos e Relacionais

package com.curso;

public class Aula08 {
  public static void main(String[] args) {
    Integer n1, n2, r;
    n1 = 14;
    n2 = 8;
    r = (n1 > n2)?0:1; //?Se n1 for maior mostra 0, :senão mostra 1;
    System.out.println(r);

    Integer n3, n4, r2;
    n3 = 14;
    n4 = 8;
    r2 = (n3 > n4)?n3+n4:n3-n4; //?Se n1 for maior mostra 0, :senão mostra 1;
    System.out.println(r2);

  /* OPERADORES RELACIONAIS
   * | >  | Maior que      | 5 > 2  | true
   * | <  | Menor que      | 4 < 1  | false
   * | >= | Maior ou igual | 8 >= 3 | true
   * | <= | Menor ou igual | 6 <= 6 | true
   * | == | Igual a        | 9 == 8 | false
   * | != | Diferente de   | 4 != 5 | true
   */

   // COMPARANDO STRINGS
   String nome1 = "Gustavo";
   String nome2 = "Gustavo";
   String nome3 = new String("Gustavo");
   String resultado;

   resultado = (nome1==nome2)?"igual":"diferente";
   System.out.println(resultado);

   resultado = (nome1==nome3)?"igual":"diferente";//o nome3 não tem a mesma estrutura dos outros
   System.out.println(resultado);

   resultado = (nome1.equals(nome3))?"igual":"diferente";
   System.out.println(resultado);

   //OPERADORES LÓGICOS
   /* | && | E   |
    * | || | OU  |
    * |  ^ | XOU |
    * |  ! | NÃO |
    */
    Integer x, y, z;
    x = 4;
    y = 7;
    z = 12;
    boolean res;
    res = (x < y && y < z)?true:false;
    System.out.println(res);
  }
}
