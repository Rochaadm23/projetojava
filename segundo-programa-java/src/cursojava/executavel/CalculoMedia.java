package cursojava.executavel;

import javax.swing.JOptionPane;

public class CalculoMedia {
	public static void main(String[] args) {
		/* Solicitando ao usuário que insira dados no sistema*/
		String nota1 = JOptionPane.showInputDialog("Informe a Nota1 ");
		String nota2 = JOptionPane.showInputDialog("Informe a Nota2 ");
		String nota3 = JOptionPane.showInputDialog("Informe a Nota3 ");
		String nota4 = JOptionPane.showInputDialog("Informe a Nota4 ");
		/*Convertendo os dados de string para double*/
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		/*Calculando a média das notas */
		double mediaNotas = (double)(dNota1 + dNota2 + dNota3 + dNota4) / 4; 
		
		/*Exibindo a media*/
		/*Média para aprovação é 70*/
		if(mediaNotas >= 50) {
			if(mediaNotas >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno está APROVADO com média de : " + mediaNotas);
			}else {
				JOptionPane.showMessageDialog(null, "Aluno em RECUPERAÇÃO com media de : " + mediaNotas);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Aluno está REPROVADO com média : " + mediaNotas);
		}
	}
}
