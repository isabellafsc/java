package com.example.contacorrente;

public class ContaClienteEspecial extends ContaCorrente{

  public ContaClienteEspecial(Double saldo){
    super(saldo);
  }

  @Override
  public void sacar(Double valor){
    if(saldo >= valor * (1 + 0.1/100)) {
      saldo -= valor * (1 + 0.1/100);
      System.out.println("Sacado com sucesso! Saldo atual: R$ "+ saldo);
    }else{
      System.out.println("Saldo insuficiente. POBRE!");
    }
  }
  @Override
  public void transferir(Double valor, ContaCorrente destino){
    if(saldo >= valor * (1 + 0.05/100)) {
      saldo -= valor * (1 + 0.05/100);
      destino.depositar(valor);
      System.out.println("Transferido com sucesso! Saldo atual: R$ "+ (String.format("%.2f", saldo)));
      System.out.println("Valor atual conta destino: R$ " + (String.format("%.2f", destino.obterSaldo())));
    }else{
      System.out.println("Saldo insuficiente. POBRE!");
    }
  }
}
