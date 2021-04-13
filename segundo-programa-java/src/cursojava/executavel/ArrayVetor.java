package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
	public static void main(String[] args) {
		String posicoes = JOptionPane.showInputDialog(" Quantas posições o Array deve ter? ");
		
		/* Array pode ser de todos os tipos de dados e objetos */
		/* Array sempre deve ter a quantidade de posições definidas */
		double notas[] = new double[Integer.parseInt(posicoes)];
		
		for (int pos = 0; pos < notas.length; pos++) {
		String valor = JOptionPane.showInputDialog(" Qual o  Valor da posição " + pos);
			notas[pos] = Double.valueOf(valor);
		}

		for (int i = 0; i < notas.length; i++) {

			System.out.println("Nota " + (i + 1) + " é = " + notas[i]);

		}

	}
}
