import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Produto [] estoque = new Produto [4];
		
		for (int i=0; i<4; i++) {
			estoque[i] = new Produto();
			
			System.out.println("Nome do produto: ");
			estoque[i].nome = sc.nextLine();
			System.out.println("Valor: ");
			estoque[i].preco = sc.nextFloat();
			System.out.println("Quantidade: ");
			estoque[i].qtd = sc.nextInt();
			
			sc.nextLine(); //limpeza do buffer
		}
		
		//verificando quais produtos estao abaixo do necessario
		for(int i=0; i<4; i++) {
			if(estoque[i].verificaEstoque()) {
				System.out.println(estoque[i].nome+ " - ESTOQUE BAIXO!");
			}
		}
		
		sc.close();

	}

}
