package com.example.areaeperimetro;

import java.util.ArrayList;
import java.util.List;

public class Principal {
  public static void main( String[] args )
  {

    FormaGeometrica retangulo = new Retangulos(2.0, 5.0); 
    FormaGeometrica quadrado = new Quadrados(5.0); 
    FormaGeometrica circulo = new Circulo(2.0); 
    
    List<FormaGeometrica> listaForma = new ArrayList<>();

    listaForma.add(retangulo);
    listaForma.add(quadrado);
    listaForma.add(circulo);

    for (FormaGeometrica formaGeometrica : listaForma) {
      System.out.println("\n" + formaGeometrica.getNome() + ":\nÁrea = " + (String.format("%.2f", formaGeometrica.calcularArea())) + "\nPerímetro = " + (String.format("%.2f", formaGeometrica.calcularPerimetro())));
      System.out.println(formaGeometrica.toString());
    }
  }
}
