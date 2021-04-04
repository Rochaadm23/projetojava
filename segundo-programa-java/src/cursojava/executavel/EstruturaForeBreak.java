package cursojava.executavel;

public class EstruturaForeBreak {

	public static void main(String[] args) {
		/*Estrutura for com BREAK*/
		for(int numero = 0; numero <=10; numero++) {
			if(numero == 2) {
				System.out.println("Numero atual é: " + numero);
				break;
			}
		}

	}

}
