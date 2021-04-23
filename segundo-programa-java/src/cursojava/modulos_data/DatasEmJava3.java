package cursojava.modulos_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasEmJava3 {

	public static void main(String[] args) throws ParseException {
		/* O objeto calendar não precisa do new para instancia-lo */
		Calendar calendar = Calendar.getInstance();/* Pega a data atual */

		/* Simular que a data vem do banco de dados */

		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));

		calendar.add(Calendar.DAY_OF_MONTH, 40);/* data de hoje mais 40 dias */

		System.out.println("Somando o dia do Mês " + new SimpleDateFormat("dd-MM-yy").format(calendar.getTime()));
		
		
		
		calendar.add(Calendar.MONTH, 2);
		System.out.println("Somando o mês " + new SimpleDateFormat("dd-MM-yy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 2);
		System.out.println("Somando o mês " + new SimpleDateFormat("dd-MM-yy").format(calendar.getTime()));
	}

}
