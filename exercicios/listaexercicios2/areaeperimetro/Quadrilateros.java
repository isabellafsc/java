package com.example.areaeperimetro;

public class Quadrilateros{
  private Double l1;
  private Double l2;
  private Double l3;
  private Double l4;

public Quadrilateros(){

}
  public Quadrilateros(Double l1, Double l2,Double l3, Double l4){
    this.l1 = l1;
    this.l2 = l2;
    this.l3 = l3;
    this.l4 = l4;
  }
  @Override
  public String toString(){
    return "Lado 1 = " + this.l1 + ", Lado 2 = " + this.l2 + ", Lado 3 = " + this.l3 + ", Lado 4 = " + this.l4;
  }

  public Double getL1() {
    return this.l1;
  }

  public void setL1(Double l1) {
    this.l1 = l1;
  }

  public Double getL2() {
    return this.l2;
  }

  public void setL2(Double l2) {
    this.l2 = l2;
  }

  public Double getL3() {
    return this.l3;
  }

  public void setL3(Double l3) {
    this.l3 = l3;
  }

  public Double getL4() {
    return this.l4;
  }

  public void setL4(Double l4) {
    this.l4 = l4;
  }

}
