package com.example.curso;

import java.util.ArrayList;
import java.util.List;

public class Principal {
  public static void main(String[] args) {
    Double valorTotal = 0.00;

    Cursos curso1 = new Cursos();
    curso1.setId(1);
    curso1.setNome("Analise");
    curso1.setCusto(652.50);

    Cursos curso2 = new Cursos();
    curso2.setId(2);
    curso2.setNome("Engenharia");
    curso2.setCusto(666.66);

    Cursos curso3 = new Cursos();
    curso3.setId(3);
    curso3.setNome("Matemática");
    curso3.setCusto(253.34);

    List<Cursos> listaCursos = new ArrayList<>();
    listaCursos.add(curso1);
    listaCursos.add(curso2);
    listaCursos.add(curso3);

    System.out.println("\n\nExibir o custo de todos os cursos da lista, individualmente:");

    for (Cursos cursos : listaCursos) {
      System.out.println(cursos.getNome() + ": R$" + cursos.getCusto());
      valorTotal = valorTotal + cursos.getCusto();
    }
    System.out.println("\nExibir o custo total dos cursos (todos os cursos da lista):");

    System.out.printf("Valor total dos cursos: R$ " + String.format("%.2f", valorTotal));

    System.out.println("\n\nExibir o custo e nome de um curso a partir de seu ID:");

    for (Cursos cursos : listaCursos) {
      if (cursos.getId() == 1) {
        System.out
            .println("Nome curso " + cursos.getId() + ": " + cursos.getNome() + "\nCusto: R$ " + cursos.getCusto());
      }
    }

  }
}
