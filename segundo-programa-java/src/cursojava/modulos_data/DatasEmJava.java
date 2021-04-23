package cursojava.modulos_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		
		Date date = new Date();
		
		
		/*------------------OBJETO DATE------------------------------*/
		System.out.println("Data em milisegundos " + date.getTime());
		System.out.println("Dia do mês " + date.getDate());
		System.out.println("Dia da semana " + date.getDay());
		System.out.println("Hora do dia " + date.getHours());
		System.out.println("Minuto da hora " + (date.getMinutes()));
		System.out.println("Segundos " + date.getSeconds());
		System.out.println("Ano " + (date.getYear() + 1900));
		System.out.println("-------------------------------------------");
		/*------------------OBJETO CALENDAR--------------------------*/
		
		
		

		System.out.println("Calendar em milisegundos " + calendar.getTimeInMillis());
		System.out.println("Calendar dia do mês " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Calendar dia da semana " + (calendar.get(Calendar.DAY_OF_WEEK) - 1));
		System.out.println("Calendar Hora do dia " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Calendar Minuto da Hora " + calendar.get(Calendar.MINUTE));
		System.out.println("Calendar Segundos " + calendar.get(Calendar.SECOND));
		System.out.println("Calendar Ano " + calendar.get(Calendar.YEAR));
		
		/*------------------Simple Date Format------------------------------*/
		
		System.out.println("------------------------------------------------");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.println("Data atual em formato padrão e String " + simpleDateFormat.format(date));
		
		System.out.println("------------------CALENDAR-----------------------");
		System.out.println("CALENDAR Data atual em formato padrão e String " + simpleDateFormat.format(calendar.getInstance().getTime()));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		System.out.println("Data em formato de banco de dados " + simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("1990-11-27 01:40:55"));
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("27/11/1990"));
		
		
		
	}
}
