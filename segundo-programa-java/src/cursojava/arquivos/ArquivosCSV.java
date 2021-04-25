package cursojava.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArquivosCSV {

	public static void main(String[] args) throws IOException {

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

		/* Pode vir do banco de dados ou qualquer fonte de dados */

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);

		File arquivo = new File("/home/rocha/git/repository/segundo-programa-java/src/cursojava/arquivos/arquivo.csv");

		if (!arquivo.exists()) {
			arquivo.createNewFile();

		}
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);

		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome() + ";" + p.getIdade() + ";" + p.getEmail() + ";\n");
		}
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();

	}

}
