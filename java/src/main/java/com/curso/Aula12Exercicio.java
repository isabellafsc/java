package com.curso;

import javax.swing.JOptionPane;

public class Aula12Exercicio {
  public static void main(String[] args) {
    Integer num, 
            soma = 0, 
            total = -1, 
            par = -1, 
            impar = 0, 
            acima = 0;
    float media = 0f;
    do{
      num = Integer.parseInt(JOptionPane.showInputDialog(null, 
          "<html>Informe um número: <br> <em>(valor 0 interrompe)</em></html>"));
      soma += num;
      total ++;
      if (num % 2 == 0) {
        par ++;
      } else {
        impar ++;
      }
      if (num > 100) {
        acima ++;
      }     
    } while (num != 0);
    media = (float) soma/total;
    JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + "<br> Somátorio: " + soma + "<br> Total de Valores: " + total + "<br> Total de Pares: " + par + "<br> Total de Ímpares: " + impar + "<br> Acima de 100: " + acima + "<br> Média dos Valores: " + media + "</html>");
  }
}
