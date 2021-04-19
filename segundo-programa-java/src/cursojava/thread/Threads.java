package cursojava.thread;

import javax.swing.JOptionPane;

public class Threads {

	public static void main(String[] args) throws InterruptedException {

		/* Thread processando em paralelo do envio do e-maill */
		Thread threadEmail = new Thread(thread1);

		threadEmail.start();

		/************** DIVISÃO DA THREADS ******************/

		/* Thread processando em paralelo do envio do e-maill */
		Thread threadNF = new Thread(thread2);/* Start liga a Thread que fica processando paralelamente por trás */
		threadNF.start();

		
		
		/* Código do sistema do usuário continua o fluxo de trabalho */
		System.out.println("Processo finalizado!!");
		/* Fluxo do sistema, cadastro de venda, uma emissão de nota fiscal */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			/* Executa o que queremos */

			/* Código da rotina que eu quero executar em paralelo */
			for (int pos = 0; pos < 10; pos++) {

				/*
				 * QUERO EXECUTAR ESSE ENVIO COM O TEMPO DE PARADA, OU COM O TEMPO DETERMINADO
				 */
				System.out.println("Executando alguma rotina de envio de NOTA FISCAL");
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}

		}
	};
	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			/* Executa o que queremos */

			/* Código da rotina que eu quero executar em paralelo */
			for (int pos = 0; pos < 10; pos++) {

				/*
				 * QUERO EXECUTAR ESSE ENVIO COM O TEMPO DE PARADA, OU COM O TEMPO DETERMINADO
				 */
				System.out.println("Executando alguma rotina de envio de e-mail!");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}

			// TODO Auto-generated method stub

		}
	};
}
