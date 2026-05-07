import java.util.Scanner;

public class ContaBancaria {
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	protected void mostrarMensagem() {
		System.out.println("Operação realizada com sucesso!");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria c1 = new ContaBancaria();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Saldo atual: "+c1.getSaldo());
		
		System.out.println("Digite o valor para o primeiro depósito: ");
		double deposito = sc.nextDouble();
		
		c1.setSaldo(deposito);
		c1.mostrarMensagem();
		
		System.out.println("Saldo atual: "+c1.getSaldo());

	}

}
