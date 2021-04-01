package Cursojava.executavel;

import javax.swing.JOptionPane;

public class EntradaDadosConfirm {
	public static void main(String[] args) {
		// entrada de dados

		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros: ");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de Pessoas: ");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoaNumero);
		int resto = (int) (carroNumero % pessoaNumero);

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESULTADO da divisão? ");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão por pessoas deu " + divisao + " carros");

		}
		int resposta1 = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divisão? ");
		if (resposta1 == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divisão é " + resto + " carro(s)");

		} else {
			JOptionPane.showMessageDialog(null, "Não quiz ver o resultado. Volte sempre!!");
		}

	}
}
