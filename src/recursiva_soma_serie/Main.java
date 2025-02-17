package recursiva_soma_serie;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String input;
		int numero = -1;

		while (numero < 1) {
			input = JOptionPane.showInputDialog("Digite um número inteiro positivo:");
			numero = Integer.parseInt(input);

			if (numero < 1) {
				JOptionPane.showMessageDialog(null, "Número inválido.");
			}
		}

		double resultado = SomarSerie.somar(numero);

		JOptionPane.showMessageDialog(null, "O resultado da somatória é: " + resultado);

	}

}
