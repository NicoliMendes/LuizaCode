package com.conta;

public class Cliente {

    private String nome;
    private long cpf;
    private long rg;

    public  Cliente(String nome, long cpf, long  rg){
       this.nome = nome;
       this.cpf = cpf;
       this.rg = rg;
    }

    public String getNome(){
        return nome;
    }

    public long getCpf(){
        return cpf;
    }

    public long getRg(){
        return rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }
}

