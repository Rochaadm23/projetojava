package cursojava.executavel;

public class EstruturaForeContinue {

	public static void main(String[] args) {
		// Estrutura de repetição FOR e continue
		//Melhor utilizado em uma lista de produtos
		for(int numero = 0; numero <=10; numero++ ) {
			if(numero == 3 || numero == 6 || numero == 9) {
				System.out.println("Oba encontrei o numero : " + numero);
				continue;
				
			}System.out.println("Processando laço de repetição");
		}
		
	}

}
