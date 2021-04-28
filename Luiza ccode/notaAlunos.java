
//notas alunos

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float nota1, nota2, nota3;
        int faltas;
        int aulas = 68;
        double percentual = 0.25 * aulas;

        System.out.println("Digite a primeira nota: ");
        nota1 = input.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = input.nextFloat();

        System.out.println("Digite a terceira nota: ");
        nota3 = input.nextFloat();

        System.out.println("Digite o número de faltas: ");
        faltas = input.nextInt();

        float media = (nota1 + nota2 + nota3) / 3;

        if(faltas > percentual){
            System.out.println("Reprovado por falta");
        }else if(media < 7){
            System.out.printf("Reprovado por nota %.1f",  media);
        }else{
            System.out.printf("Aprovado %.1f",  media);
        }

    }
}