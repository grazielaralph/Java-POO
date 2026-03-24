public class Pessoa {
    //atributos
    String nome;
    int idade;
    String email;


    //metodos
    void apresentar(){
        System.out.println("Olá, sou " + nome+", tenho "+idade+" anos.");
    }

    boolean maiorDeIdade(){
        return idade>=18;
    }
}
