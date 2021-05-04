package com.conta;

public class Main {

    public static void main(String[] args) {

        Cliente cliente_one = new Cliente ("Nicoli juliana neres Mendes",123456789,40028922);
        Cliente cliente_two = new Cliente ("Luis Inacio Lula da Silva",91753327,476433230);
        //Cliente cliente_three = new Cliente ("Karl Marx",365287547, 976665536);

        Conta contaOrigem = new ContaCorrente(cliente_one,258748965);
        Conta contaDestino= new ContaPoupanca (cliente_two,324567891);

        contaOrigem.depositar(5000);
        contaDestino.depositar(10000);

        System.out.println(contaOrigem.getSaldo());
        System.out.println(contaDestino.getSaldo());
    }



}


