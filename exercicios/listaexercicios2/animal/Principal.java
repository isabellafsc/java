package com.example.animal;

public class Principal {
  public static void main( String[] args )
  {
      Animal humano = new Humano();
      humano.comunicar();

      Animal gato = new Gato();
      gato.comunicar();

      Animal cachorro = new Cachorro();
      cachorro.comunicar();
  }
}
