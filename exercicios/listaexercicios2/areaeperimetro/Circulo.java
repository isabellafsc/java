package com.example.areaeperimetro;

public class Circulo implements FormaGeometrica{
  private Double r;
  private String nome = "Circulo";

  public Circulo(Double r){
    this.r = r;
  }

  public Double calcularArea(){
    return (Math.PI*(r * r));
  }
  public Double calcularPerimetro(){
    return (2 * Math.PI * r);
  }

  @Override
  public String toString(){
    return "Raio = " + this.r;
  }

  public Double getR() {
    return this.r;
  }

  public void setR(Double r) {
    this.r = r;
  }

  public String getNome() {
    return this.nome;
  }
}
