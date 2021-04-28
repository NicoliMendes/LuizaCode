package com.company;
import java.util.Scanner;

public class calculadoraDesafio {

    public static void main(String[] args) {

        int opcao;
        float valor1;
        float valor2;
        float resultado;

        Scanner scan = new Scanner(System.in);
        System.out.println("Calculadora em Java");
        System.out.println("-------------------");
        System.out.println("1- Adição");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        System.out.println("5- Sair");
        System.out.println("-------------------");

        System.out.println("Digite  a opção desejada para realizar o calculo: ");
        opcao = scan.nextInt();

        if (opcao == 5){
            System.out.println("Saindo...");
            System.exit(0);
        }
        System.out.println("Digite o primeiro Valor: ");
        valor1 = scan.nextFloat();

        System.out.println("Digite o segundo Valor: ");
        valor2 = scan.nextFloat();

        if (opcao == 1){
            resultado = valor1 + valor2;
            System.out.println(" o resultado da soma é: " + resultado);
            System.out.println("Pressione Enter para voltar ao inicio");
        }else if (opcao == 2){
            resultado = valor1 - valor2;
            System.out.println(" o resultado da subtração é: " + resultado);
            System.out.println("Pressione Enter para voltar ao inicio");
        }else if (opcao == 3){
            resultado = valor1 * valor2;
            System.out.println(" o resultado da multiplicação é: " + resultado);
            System.out.println("Pressione Enter para voltar ao inicio");
        }else if (opcao == 4){
            resultado = valor1 / valor2;
            System.out.println(" o resultado da divisão é: " + resultado);
            System.out.println("Pressione Enter para voltar ao inicio");
        }else{
            System.out.println("Opcao invalida, favor entrar com uma opcao valida entre 1 a 4 !!!");
        }
    }
}
