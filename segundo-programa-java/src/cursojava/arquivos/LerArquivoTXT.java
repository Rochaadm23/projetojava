package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoTXT {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream entradaArquivo = new FileInputStream(
				new File("/home/rocha/git/repository/segundo-programa-java/src/cursojava/arquivos/arquivo.txt"));

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

		while (lerArquivo.hasNext()) {
			String linha = lerArquivo.nextLine();

			if (linha != null && !linha.isEmpty()) {
				String[] dados = linha.split("\\;");

				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setIdade(Integer.parseInt(dados[1]));
				pessoa.setEmail(dados[2]);

				pessoas.add(pessoa);

			}
		}

		for (Pessoa pessoa : pessoas) {/*
										 * Poderia gravar no banco de dados, enviar e-mail, gerar boleto, fazer qualquer
										 * coisa
										 */
			System.out.println(pessoa);
		}
	}
}
