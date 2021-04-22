package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_filha.add(objetoFilaThread);
	}

	@Override
	public void run() {

		System.out.println("Fila rodando");


		while (true) {
			
			
			Iterator iteracao = pilha_filha.iterator();

			synchronized (iteracao) {/*
										 * Bloquear o acesso a esta lista por outros processos Garante que apenas esta
										 * THREAD Acesse esta LISta
										 */

				while (iteracao.hasNext()) {/* Enquanto conter dados na lista irá processar */

					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();

					/* Ex: Processar 10 mil notas fiscais */
					/* Gerar uma lista enorme de PDF */
					/* Gerar um envio em massa de e-mail */
					System.out.println("---------------------------------------------");
					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());

					iteracao.remove();

					try {
						Thread.sleep(100);/* Dar um tempo para a descarga de memória */
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}

			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) { /* Precessou toda a lista dá um tempo para limpeza de memória */

				e.printStackTrace();
			}
		}

	}

}
