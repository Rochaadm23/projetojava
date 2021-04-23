package cursojava.modulos_data;

import java.time.Duration;
import java.time.Instant;

public class DatasEmJava8 {

	public static void main(String[] args) throws InterruptedException {

		Instant inicio = Instant.now();

		Thread.sleep(2000);

		Instant ifinal = Instant.now();

		Duration duracao = Duration.between(inicio, ifinal);

		System.out.println("Duração em nanos segundos " + duracao.toNanos());
		System.out.println("Duração em minutos " + duracao.toMinutes());
		System.out.println("Duração em Horas " + duracao.toHours());
		System.out.println("Duração em Dias " + duracao.toDays());
		System.out.println("Duração em nanos segundos " + duracao.toNanos());
		System.out.println("Duração em nanos segundos " + duracao.toNanos());

	}
}
