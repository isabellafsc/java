package com.example.provas;

import java.util.ArrayList;
import java.util.List;

public class Listaprovas {
  public static void main(String[] args) 
  {

    Double total = 0.0;

    Aluno aluno1 = new Aluno();
    aluno1.setNome("Astolfo");
    Aluno aluno2 = new Aluno();
    aluno2.setNome("Creuza");
    Aluno aluno3 = new Aluno();
    aluno3.setNome("Jefiter");

    Prova p1 = new Prova();
    p1.setAluno(aluno1);
    p1.setNota(3.0);

    Prova p2 = new Prova();
    p2.setAluno(aluno1);
    p2.setNota(5.0);

    Prova p3 = new Prova();
    p3.setAluno(aluno1);
    p3.setNota(7.0);

    Prova p4 = new Prova();
    p4.setAluno(aluno2);
    p4.setNota(7.5);

    List<Prova> listaProvas = new ArrayList<>();
    listaProvas.add(p1);
    listaProvas.add(p2);
    listaProvas.add(p3);
    listaProvas.add(p4);

    
    System.out.println("Exiba a média das notas das provas:");

    for (Prova prova : listaProvas) {
      total += prova.getNota();
    }
    System.out.println(String.format("%.2f", (total/listaProvas.size())));

    System.out.println("\nExiba a média das provas de um determinado aluno, por seu nome:");

    String nomeAluno = "Astolfo";
    total = 0.0;
    Integer cont = 0;

    for (Prova prova : listaProvas) {
      if(prova.getAluno().getNome() == nomeAluno){
          total += prova.getNota();
          cont ++;
      }
    }
    System.out.println(String.format("%.2f", (total/cont)));

    System.out.println("\nExiba se o aluno foi aprovado na prova ou não:");
      if (total/cont >= 7){
        System.out.println(nomeAluno + " foi aprovado!");
      }else{
        System.out.println(nomeAluno + " foi reprovado! Seu burro!!!");
      }
  }
}
