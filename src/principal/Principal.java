package principal;

import javax.swing.*;

public class Principal {
	public static void main(String[] args) {
		
		String opcao = JOptionPane.showInputDialog(null,
				//Mensagem exibida
				"Escolha uma opção ",
				//Título
				"Menu",
				// Tipo de mensagem
				JOptionPane.PLAIN_MESSAGE, null,
				// Opções para o usuário escolher
				new Object[]{"Conversor de Moeda", "Conversor de Temperatura"},
				// valor padrão
				"Escolha")
				.toString();
		
		String input = JOptionPane.showInputDialog("Insira um valor");
		// validar input para aceitar somente numero
		
		
		
		
		
	}
}
