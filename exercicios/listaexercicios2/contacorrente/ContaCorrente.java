package com.example.contacorrente;

public class ContaCorrente {
  protected Double saldo = 0.0;

  public ContaCorrente(Double saldo){
    this.saldo = saldo;
  }

  public void depositar(Double valor){
    this.saldo += valor;
  }
  public void sacar(Double valor){
    if(this.saldo >= valor * (1 + 0.5/100)) {
      this.saldo -= valor * (1 + 0.5/100);
      System.out.println("Sacado com sucesso! Saldo atual: R$ "+ saldo);
    }else{
      System.out.println("Saldo insuficiente. POBRE!");
    }
  }
  public void transferir(Double valor, ContaCorrente destino){
    if(this.saldo >= valor * (1 + 0.25/100)) {
      this.saldo -= valor * (1 + 0.25/100);
      destino.depositar(valor);
      System.out.println("Transferido com sucesso! Saldo atual: R$ "+ (String.format("%.2f", saldo)));
      System.out.println("Valor atual conta destino: R$ " + (String.format("%.2f", destino.obterSaldo())));
    }else{
      System.out.println("Saldo insuficiente. POBRE!");
    }
  }
  public Double obterSaldo(){
    return this.saldo;
  }

  
}
