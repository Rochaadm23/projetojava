package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi2 {

	public static void main(String[] args) throws IOException {

		FileInputStream entrada = new FileInputStream(
				new File("/home/rocha/git/repository/segundo-programa-java/src/cursojava/arquivos/arquivo_excel.xls"));

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);/* Prepara a entrada do arquivo Excel para ler */

		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);/* Pega a primeira planilha do nosso arquivo excel */

		Iterator<Row> linhaIterator = planilha.iterator();

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		while (linhaIterator.hasNext()) {
			Row linha = linhaIterator.next();
			Iterator<Cell> celulas = linha.iterator();

			Pessoa pessoa = new Pessoa();

			while (celulas.hasNext()) {
				Cell cell = celulas.next();

				switch (cell.getColumnIndex()) {
				case 0:
					pessoa.setNome(cell.getStringCellValue());
					break;
				case 1:
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
				case 2:
					pessoa.setEmail(cell.getStringCellValue());
					break;
				}
			}/*Fim das celulas das linha*/
			
			pessoas.add(pessoa);
		}
		entrada.close();/*Terminou de ler o arquivo Excel*/
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		
		}
	}
}
