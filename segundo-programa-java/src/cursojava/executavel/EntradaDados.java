package cursojava.executavel;

import javax.swing.JOptionPane;

public class EntradaDados {

	public static void main(String[] args) {
		// entrada de dados

		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros: ");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de Pessoas: ");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoaNumero);
		int resto = (int) (carroNumero % pessoaNumero);

		JOptionPane.showMessageDialog(null,
				"Divisão por pessoas deu " + divisao + " carros e sobrou " + resto + " carro(s)");

	}

}
