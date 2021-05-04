package com.conta;

public abstract class Conta {

    private Cliente cliente;
    private long numeroConta;
    private double saldo;


    public Conta( Cliente cliente, long numeroConta){
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public long getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double valor){
        this.saldo = valor;
    }
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("saldo insuficiente para saque");
        }
    }

    public void depositar(double valor) {

        this.saldo = this.saldo + valor;
    }

    public abstract void pix(double valor, Conta contaDestino);
}
