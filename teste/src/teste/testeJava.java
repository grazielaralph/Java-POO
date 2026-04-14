package teste;

import java.util.Scanner;

public class testeJava {

	public static void main(String[] args) {
		System.out.println("Hello world é meu peru!");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a name: ");
		String name = sc.nextLine();
		
		System.out.println("HI, "+name);
		
		sc.close();

	}

}
