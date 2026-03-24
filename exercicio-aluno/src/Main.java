//Crie a classe Aluno (nome, nota). Use Scanner + for para cadastrar 3 alunos.
//Com if-else, exiba "Aprovado" (nota ≥ 7) ou "Reprovado".

import java.util.Scanner;

public class Main {
    public static final int QTD_ALUNOS = 3;
    public static void main(String[] args) {

        //criando um scanner
        Scanner entrada = new Scanner(System.in);

        //vetor de alunos
        Aluno[] alunos = new Aluno[3];

        for(int i = 0; i<3; i++){
            alunos[i] = new Aluno();
            System.out.println("Digite o nome e nota do aluno: ");
            alunos[i].nome = entrada.nextLine();
            alunos[i].nota = entrada.nextFloat();
            entrada.nextLine(); //limpeza do buffer
        }

        for(int i = 0; i< alunos.length; i++){
            System.out.println("Situação do aluno "+alunos[i].nome+": "+(alunos[i].estaAprovado()?"Aprovado":"Reprovado"));
        }

        entrada.close();



    }
}