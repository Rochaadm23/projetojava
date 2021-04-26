package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditandoPlanilhas {

	public static void main(String[] args) throws IOException {

		File file = new File(
				"/home/rocha/git/repository/segundo-programa-java/src/cursojava/arquivos/arquivo_excel.xls");

		FileInputStream entrada = new FileInputStream(file);

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);/* Prepara a entrada do arquivo xls */
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);/* Pegando a planilha */

		Iterator<Row> linhaIterator = planilha.iterator();

		while (linhaIterator.hasNext()) {
			Row linha = linhaIterator.next();
			/* Saber o numero de células da planilha */
			int numeroCelulas = linha.getPhysicalNumberOfCells();

			Cell cell = linha.createCell(numeroCelulas);
			cell.setCellValue("5.487,20");

		}
		entrada.close();
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();

		System.out.println("Planilha atualizada");
	}

}
