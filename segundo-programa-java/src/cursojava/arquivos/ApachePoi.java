package cursojava.arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws IOException {

		File file = new File(
				"/home/rocha/git/repository/segundo-programa-java/src/cursojava/arquivos/arquivo_excel.xls");

		if (!file.exists()) {/* Se o arquivo não existir ele será criado */
			file.createNewFile();
		}

		Pessoa pessoa1 = new Pessoa();

		pessoa1.setEmail("pessoa1@gmail.com");
		pessoa1.setNome("Fernando Rocha");
		pessoa1.setIdade(25);

		Pessoa pessoa2 = new Pessoa();

		pessoa2.setEmail("pessoa2@gmail.com");
		pessoa2.setNome("Luis Rocha");
		pessoa2.setIdade(29);

		Pessoa pessoa3 = new Pessoa();

		pessoa3.setEmail("pessoa3@gmail.com");
		pessoa3.setNome("Daiane Rocha");
		pessoa3.setIdade(50);

		Pessoa pessoa4 = new Pessoa();

		pessoa4.setEmail("pessoa4@gmail.com");
		pessoa4.setNome("Samuel Rocha");
		pessoa4.setIdade(30);
		/* Pode vir do banco de dados ou qualquer fonte de dados */
		/* ciando uma lista de pessoas */
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		/* Adicionando o objeto na lista de pessoas */
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); /* Vai ser usado para escrever na planilha */
		HSSFSheet linhaPessoa = hssfWorkbook.createSheet("Planilha de pessoas Jdev Treinamentos");/* Cria a planilha */

		int numeroLinha = 0;
		for (Pessoa p : pessoas) {
			Row linha = linhaPessoa.createRow(numeroLinha++);/* Criando a linha na planilha */

			int celula = 0;

			Cell celulaNome = linha.createCell(celula++);/* Celula 1 */
			celulaNome.setCellValue(p.getNome());

			Cell celulaIdade = linha.createCell(celula++);/* Celula 2 */
			celulaIdade.setCellValue(p.getIdade());

			Cell celulaEmail = linha.createCell(celula++);/* Celula 3 */
			celulaEmail.setCellValue(p.getEmail());
		} /* Termino de montar a planilha */

		FileOutputStream saida = new FileOutputStream(file);

		hssfWorkbook.write(saida);/* Escreve planilha em arquivo */
		saida.flush();
		saida.close();

		System.out.println("Planilha Criada");
	}

}
