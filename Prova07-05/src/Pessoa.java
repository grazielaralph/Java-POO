
public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void print() {
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade+" anos");
	}

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Graziela", 20);
		Pessoa p2 = new Pessoa("Gabriela", 33);
		
		p1.print();
		p2.print();

	}

}
