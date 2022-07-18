package com.example.areaeperimetro;

public class Retangulos extends Quadrilateros implements FormaGeometrica{
  private Double b;
  private Double h;
  private String nome = "Retangulo";

  public Retangulos(){
    super();
  }
  
  public Retangulos(Double b, Double h){
    this.b = b;
    this.h = h;
  }
  
  public Double calcularArea(){
    return (b * h);
  }
  public Double calcularPerimetro(){
    return (2*(b + h));
  }
  
  @Override
  public String toString(){
    return "Base = " + this.b + ", Altura = " + this.h;
  }

  public Double getB() {
    return this.b;
  }
  
  public void setB(Double b) {
    this.b = b;
  }
  
  public Double getH() {
    return this.h;
  }
  
  public void setH(Double h) {
    this.h = h;
  }
  
  public String getNome() {
    return this.nome;
  }

}
