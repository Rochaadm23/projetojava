package cursojava.modulos_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {
	public static void main(String[] args) throws ParseException {

		Date date = new Date();
		System.out.println("Data em milisegundos " + date.getTime());
		System.out.println("Dia do mês " + date.getDate());
		System.out.println("Dia da semana " + date.getDay());
		System.out.println("Hora do dia " + date.getHours());
		System.out.println("Minuto da hora " + (date.getMinutes()));
		System.out.println("Segundos " + date.getSeconds());
		System.out.println("Ano " + (date.getYear() + 1900));

		/*------------------Simple Date Format------------------------------*/
		System.out.println("------------------------------------------------");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.println("Data atual em formato padrão e String " + simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		System.out.println("Data em formato de banco de dados " + simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("1990-11-27 01:40:55"));
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("27/11/1990"));
		
	}
}
