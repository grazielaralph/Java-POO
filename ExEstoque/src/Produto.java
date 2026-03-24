
public class Produto {
	 //atributos
    String nome;
    float preco;
    int qtd;

    boolean verificaEstoque(){
        return qtd<5;
    }

}
