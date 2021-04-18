package cursojava.thread;

import javax.swing.JOptionPane;

public class Threads {

	public static void main(String[] args) throws InterruptedException {

		/*Thread processando em paralelo*/
		new Thread() {

			public void run() {/* Executa o que queremos */

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

			};

		}.start();/* Start liga a Thread que fica processando paralelamente por trás */

		/* Código do sistema do usuário continua o fluxo de trabalho */
		System.out.println("Processo finalizado!!");
		/* Fluxo do sistema, cadastro de venda, uma emissão de nota fiscal */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}
}
