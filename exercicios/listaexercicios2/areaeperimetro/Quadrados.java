package com.example.areaeperimetro;

public class Quadrados extends Quadrilateros implements FormaGeometrica{
  private Double l;
  private String nome = "Quadrado";

  public Quadrados(){
    super();
  }

  public Quadrados(Double l){
    this.l = l;
  }

  public Double calcularArea(){
    return (l*l);
  }
  public Double calcularPerimetro(){
    return (4*l);
  }

  @Override
  public String toString(){
    return "Lados = " + this.l;
  }

  public Double getL() {
    return this.l;
  }

  public void setL(Double l) {
    this.l = l;
  }

  public String getNome() {
    return this.nome;
  }
}
