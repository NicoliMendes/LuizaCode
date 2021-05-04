package com.conta;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente, long numeroConta) {
        super(cliente, numeroConta);
    }

    @Override
    public void pix(double valor, Conta contaDestino){
        if (valor <= super.getSaldo()) {
            super.setSaldo(super.getSaldo() - (valor + 0.1));
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência");
        }
    }

}
