package Cursojava.executavel;

public class EstruturaWhile {
	public static void main(String[] args) {
		/*Estrutura de repetição while*/
		
		int numero = 0;
		while(numero <= 10) {/*Verifica e depois executa o código*/
			
			System.out.println("O numero atual é " + numero);
			numero++;
		}
		/*--------------------------------------------------------*/
		int numero2 = 0;
		do {/*primeiro executa depois verifica*/
			
			System.out.println("O numero atual é " + numero2);
			numero2++;
			
		}while(numero2 <= 10); {
			
		}
}
}