import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

public class JanelaSimples extends JFrame {
	//construtor
	public JanelaSimples() {
		setTitle("Minha primeira Janela");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JLabel lblMessage = new JLabel("Ola mundo!");
		add(lblMessage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JFrame
		JFrame frame = new JFrame("Minha primeira Janela");
		frame.setSize(350,200); //unidade de medida em pixels
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new java.awt.FlowLayout()); /*Posiciona componentes em linha, um após o outro, quebrando
		quando necessário. Padrão do JPanel.*/
		
		//Criando os componentes
		JLabel label = new JLabel("Aguardando o clique...");
		//frame.add(label, BorderLayout.NORTH); //definindo local onde vai o label vai ficar
		JButton button = new JButton("Clique aqui!");
		frame.add(label);
		frame.add(button);
		//frame.add(button, BorderLayout.CENTER); //definindo local onde o botao vai ficar
		
		//Eventos do botao
		button.addActionListener(e->{label.setText("Botão clicado!");});
		
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		/*SwingUtilities.invokeLater(()->{
			new JanelaSimples().setVisible(true);
		});*/

	}

}
