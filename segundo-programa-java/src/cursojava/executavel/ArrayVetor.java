package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
	public static void main(String[] args) {
		
		
		String valores[] = {"Fernando", "98,5", "Curso Java", "rsecinformation@gmail.com"};
		
		
		
		

		/* Array pode ser de todos os tipos de dados e objetos */
		/* Array sempre deve ter a quantidade de posições definidas */
		
		
		for (int pos = 0; pos < valores.length; pos++) {
		
			System.out.println("Valor da posição " + pos + " é igual " + valores[pos]);
		}

		

	}
}
