package cursojava.modulos_data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava10 {

	public static void main(String[] args) {

		LocalDate dataBase = LocalDate.parse("2021-01-15");
		/*
		 * Atulizar a data dentro da váriávelç é necessário atribuir o valor para ele
		 * System.out.println("Mais 5 dias " + (dataBase = dataBase.plusDays(5)));
		 * System.out.println("Mais 5 semanas " + (dataBase = dataBase.plusWeeks(5)));
		 * System.out.println("Mais 2 meses " + (dataBase = dataBase.plusMonths(2)));
		 * System.out.println("Mais 2 Anos " + (dataBase = dataBase.plusYears(2)));
		 * System.out.
		 * println("\n---------------------------------------------------- \n");
		 * 
		 * System.out.println("Menos 5 dias " + (dataBase = dataBase.minusDays(5)));
		 * System.out.println("Menos 5 meses " + (dataBase = dataBase.minusMonths(5)));
		 * System.out.println("Menos 2 semanas " + (dataBase = dataBase.minusWeeks(2)));
		 * System.out.println("Menos 2 Anos " + (dataBase = dataBase.minusYears(2)));
		 */

		System.out.println("------------------GERAR BOLETO------------------");
		for (int mes = 1; mes <= 12; mes++) {
			dataBase = dataBase.plusMonths(1);
			System.out.println("Data do vencimento do boleto : "
					+ dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do mês " + mes);
		}

	}

}
