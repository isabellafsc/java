//Aula 6 – Tipos Primitivos e Manipulação de Dados

/*|TIPO PRIMITIVO|CLASSE INVÓLUCRO|  TAMANHO  | EXEMPLO  |
 *| boolean      | Boolean        | 1 bit     | true     |
 *| char         | Character      | 1 byte    | 'A'      |
 *| ---          | String         | 1byte/cada| 'JAVA'   |
 *| byte         | Byte           | 1 byte    | 127      |
 *| short        | Short          | 2 byte    | 32776    |
 *| int          | Integer        | 4 byte    | 2147483  |
 *| long         | Long           | 8 byte    | 2^63     |
 *| float        | Float          | 4 byte    | 3.4e^+38 |
 *| double       | Double         | 8 byte    | 1.8e^+308|
 */

package com.curso;

import java.util.Scanner;

public class Aula06 {
  public static void main(String[] args) {
    String nome = "Gustavo";
    float nota = 8.5f;
    System.out.println("A nota de " + nome + " é " + nota); 
    System.out.printf("A nota de %s é %.2f\n", nome, nota); 
    System.out.format("A nota de %s é %.2f\n\n", nome, nota); 

    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o nome do aluno:");
    String nome2 = teclado.nextLine();
    System.out.println("Digite a nota:");
    float nota2 = teclado.nextFloat();
    System.out.printf("A nota de %s é %.2f\n", nome2, nota2); 
    teclado.close();

    //INCOMPATIBILIDADES NÚMEROS <-> STRING
    int idade = 30;
    String valor = Integer.toString(idade);
    System.out.println(valor);

    String valor2 = "30";
    int idade2 = Integer.parseInt(valor2);
    System.out.println(idade2);
    
    String valor3 = "30.5";
    Float idade3 = Float.parseFloat(valor3);
    System.out.println(idade3);
  }
}
