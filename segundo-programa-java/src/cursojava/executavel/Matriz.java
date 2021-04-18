package cursojava.executavel;

public class Matriz {
	public static void main(String[] args) {
		
		/* MATRIZ COM 1 POSIÇÃO + 3 ELEMENTOS*/
		int notas[][] = new int[2][3];
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;
		
		notas[1][0] = 40;
		notas[1][1] = 50;
		notas[1][2] = 70;
		
		
		//System.out.println(notas);
		/*percorre as linhas*/
		for (int i = 0; i < notas.length; i++) {
			/*Percorre as colunas*/
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Linha " + i + " Coluna " + j + " Valor : "+ notas[i][j]);
			}
		}
		
	}
}
