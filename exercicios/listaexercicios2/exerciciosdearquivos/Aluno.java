package com.example.exerciciosdearquivos;

import java.util.Date;

public class Aluno {
  Integer id;
  String nome;
  Date dataDeMatricula;
  Double notaFinal;

  public Aluno(Integer id, String nome, Date dataDeMatricula, Double notaFinal){
    this.id = id;
    this.nome = nome;
    this.dataDeMatricula = dataDeMatricula;
    this.notaFinal = notaFinal;
  }
}


