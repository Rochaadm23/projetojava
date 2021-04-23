package cursojava.modulos_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava2 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2022");

		Date dataHoje = simpleDateFormat.parse("23/04/2021");
		
		//after : se data 1 é maior que data 2
		//before : se data 1 é menor que data 2
		
		
		if (dataVencimentoBoleto.after(dataHoje)) {/* after = POSTERIOR OU MAIOR A DATA ATUAL */
			System.out.println("Atenção seu boleto vencerá em " + simpleDateFormat.format(dataVencimentoBoleto));

		} else {
			System.out.println(" URGENTE - Seu boleto está vencido ");
		}

	}
}
