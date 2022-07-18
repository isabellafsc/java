package com.example.contacorrente;

import java.util.ArrayList;
import java.util.List;

public class Principal {
  public static void main( String[] args )
  {
    ContaCorrente c1 = new ContaCorrente(300.0);
    ContaCorrente c2 = new ContaCorrente(-2.50);
    ContaCorrente c3 = new ContaClienteEspecial(10000.00);

    List<ContaCorrente> contaCorrentes = new ArrayList<>();

    contaCorrentes.add(c1);      
    contaCorrentes.add(c2);      
    contaCorrentes.add(c3);      
    
    System.out.println("DEPOSITOS:");
    for (ContaCorrente contas: contaCorrentes ) {
      contas.depositar(10.0);
      System.out.println("Depositado com sucesso! Saldo atual: R$ "+ contas.obterSaldo());
    }

    System.out.println("\nSAQUES:");
    for (ContaCorrente contas: contaCorrentes ) {
      contas.sacar(50.0);
    }

    System.out.println("\nTRANSFERENCIAS:");
    c2.transferir(5.0, c3);
    c3.transferir(5.0, c2);    

    System.out.println("\nSALDOS FINAIS:");

    for (ContaCorrente contas: contaCorrentes ) {
      System.out.println("R$ " + String.format("%.2f", contas.obterSaldo()));
    }
  }
}
