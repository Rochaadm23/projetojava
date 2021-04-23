package cursojava.modulos_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DataEmJava4 {

	public static void main(String[] args) throws ParseException {

//		Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2020");
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2020-01-01"), LocalDate.now());
	
		System.out.println("Possui " + dias + " dias entre a faixa de Data");
		
		long semanas = ChronoUnit.WEEKS.between(LocalDate.parse("2021-04-01"), LocalDate.now());
		
		System.out.println("Possui " + semanas + " semanas entre a faixa de Data");
		
		long horas = ChronoUnit.WEEKS.between(LocalDate.parse("2021-04-01"), LocalDate.now());
		
		System.out.println("Possui " + semanas + " semanas entre a faixa de Data");
		
		
	}
}
