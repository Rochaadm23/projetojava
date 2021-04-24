
package cursojava.modulos_data;

import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava9 {

	public static void main(String[] args) {

		LocalDate dataAntiga = LocalDate.of(1990, 11, 27);

		LocalDate dataNova = LocalDate.of(2021, 11, 27);
		
		/*utilizando isafter e is before*/
		System.out.println("Data antiga é maior que a data nova? " + dataAntiga.isAfter(dataNova));

		System.out.println("Data antiga é menor que a data nova? " + dataAntiga.isBefore(dataNova));

		System.out.println("Data antiga é igual a data nova? " + dataAntiga.isEqual(dataNova));
		
		/*utilizando between*/
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias entre a Data antiga e a data nova? " + periodo.getDays());
		System.out.println("Quantos meses entre a Data antiga e a data nova? " + periodo.toTotalMonths());
		System.out.println("Quantos Anos entre a Data antiga e a data nova? " + periodo.getYears());
		
		
		System.out.println("Quantos o tempo entre a Data antiga e a data nova? " + periodo.getYears() + " Anos "
				+ periodo.getMonths() + " Meses " + periodo.getDays() + " dias ");

	}

}
