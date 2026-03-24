//Crie a classe Aluno (nome, nota). Use Scanner + for para cadastrar 3 alunos.
//Com if-else, exiba "Aprovado" (nota ≥ 7) ou "Reprovado".

import java.util.Scanner;

public class Main {
    public static final int QTD_ALUNOS = 3;
    public static void main(String[] args) {

        //criando um scanner
        Scanner entrada = new Scanner(System.in);

        //vetor de alunos
        Aluno[] alunos = new Aluno[QTD_ALUNOS];

        for(int i = 0; i< alunos.length; i++){
            System.out.println("Digite o nome do aluno: ");
            alunos[i].nome = entrada.nextLine();
            System.out.println("Nota: ");
            alunos[i].nota = entrada.nextFloat();
        }

        for(int i = 0; i< alunos.length; i++){
            System.out.println("Situação do aluno "+alunos[i].nome+": "+(alunos[i].estaAprovado()?"Aprovado":"Reprovado"));
        }





    }
}