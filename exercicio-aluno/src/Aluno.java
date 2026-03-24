//Crie a classe Aluno (nome, nota). Use Scanner + for para cadastrar 3 alunos.
//Com if-else, exiba "Aprovado" (nota ≥ 7) ou "Reprovado".

public class Aluno {


    String nome;
    float nota;

    boolean estaAprovado(){
        return nota>=7;
    }
}
