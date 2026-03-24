public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "Gustavo";
        p1.idade = 15;
        p1.email = "gustavinhogameplays@outlook.com";

        Pessoa p2 = new Pessoa();
        p2.nome = "Joazinho";
        p2.idade = 30;
        p2.email = "joaocosta@hotmail.com";

        p1.apresentar();
        System.out.println((p1.maiorDeIdade()?"é maior de idade":"é menor de idade"));
        //System.out.println(p1.maiorDeIdade());

        p2.apresentar();
        System.out.println((p1.maiorDeIdade()?"é maior de idade":"é menor de idade"));
        //System.out.println(p2.maiorDeIdade());
    }
}