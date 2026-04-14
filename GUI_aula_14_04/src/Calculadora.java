import javax.swing.*;
import java.awt.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame ("Calculadora simples");
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(1,4,5,5));
		
		//Campos de texto
		JTextField campo1 = new JTextField();
		JTextField campo2 = new JTextField();
		JTextField resultado = new JTextField();
		resultado.setEditable(false); //torna o campo de texto nao funcional pro usuario
		
		JPanel painelBotoes = new JPanel(new GridLayout(1, 4, 5, 5));
		String[] ops = {"+", "-", "*", "/"}; //operacoes
		
		for(String op:ops) {
			JButton btn = new JButton(op);
			btn.addActionListener(e->{
				try {
					double a = Double.parseDouble(campo1.getText());
					double b = Double.parseDouble(campo2.getText());
					double res = switch(op) {
					case "+" -> a+b;
					case "-" -> a-b;
					case "*" -> a*b;
					case "/" -> a/b;
					default -> 0;
					};
				resultado.setText(String.valueOf(res));
			}catch(NumberFormatException ex) {
				resultado.setText("Erro: entrada invalida");
			}
			});
			painelBotoes.add(btn);
		}
		frame.setVisible(true);
		
	}
	
	
}
