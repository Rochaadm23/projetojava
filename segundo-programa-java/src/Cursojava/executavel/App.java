package Cursojava.executavel;

import cursojava.classes.Aluno;

public class App {
	public static void main(String[] args) throws Exception {
		/* Objeto na memória */
		/* new Aluno(); é uma Instancia, ((criação de Objeto)) */
		/* aluno1 é uma referência para o objeto Aluno() */
		Aluno aluno1 = new Aluno();/* João */
		Aluno aluno2 = new Aluno();/* Pedro */
		Aluno aluno3 = new Aluno();/* Fernando */
		Aluno aluno4 = new Aluno("Maria");

		/* SET inserindo o dado no objeto */
		aluno1.setNome("João da Silva");
		aluno1.setIdade(30);
		aluno1.setDataNascimento("28/11/1990");
		aluno1.setRegistroGeral("588565566-2");
		aluno1.setNumeroCpf("138.658.759-98");
		aluno1.setNomeMae("Maria Silva");
		aluno1.setNomePai("Getulio Silva");
		aluno1.setDataMatricula("10/01/2021");
		aluno1.setSerieMatriculado("6");
		aluno1.setNomeEscola("Escola Municipal Rubens Berardo");

		System.out.println("\tO nome do aluno é " + aluno1.getNome() + " e nasceu em " + aluno1.getDataNascimento()
				+ "\n tem " + aluno1.getIdade() + " anos de idade, " + "possui RG nº " + aluno1.getRegistroGeral()
				+ " e CPF nº, " + aluno1.getNumeroCpf() + "\n Filho de " + aluno1.getNomePai() + " e "
				+ aluno1.getNomeMae() + ", foi matriculado no dia " + aluno1.getDataMatricula() + " \n na "
				+ aluno1.getSerieMatriculado() + "º Série do ensino fundamental " + "na " + aluno1.getNomeEscola()
				+ ".\n");
		
		System.out.println(
				"---------------------------------------------------------------------------------------------------");
		System.out.println(
				"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println(
				"---------------------------------------------------------------------------------------------------\n");
		
		aluno2.setNome("Pedro da Silva");
		aluno2.setIdade(30);
		aluno2.setDataNascimento("28/11/1990");
		aluno2.setRegistroGeral("588565566-2");
		aluno2.setNumeroCpf("138.658.759-98");
		aluno2.setNomeMae("Maria Silva");
		aluno2.setNomePai("Getulio Silva");
		aluno2.setDataMatricula("10/01/2021");
		aluno2.setSerieMatriculado("6");
		aluno2.setNomeEscola("Escola Municipal Rubens Berardo");

		System.out.println("\tO nome do aluno é " + aluno2.getNome() + " e nasceu em " + aluno2.getDataNascimento()
				+ "\n tem " + aluno2.getIdade() + " anos de idade, " + "possui RG nº " + aluno2.getRegistroGeral()
				+ " e CPF nº, " + aluno2.getNumeroCpf() + "\n Filho de " + aluno2.getNomePai() + " e "
				+ aluno2.getNomeMae() + ", foi matriculado no dia " + aluno2.getDataMatricula() + " \n na "
				+ aluno2.getSerieMatriculado() + "º Série do ensino fundamental " + "na " + aluno2.getNomeEscola()
				+ ".\n");
		
		System.out.println(
				"---------------------------------------------------------------------------------------------------");
		System.out.println(
				"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println(
				"---------------------------------------------------------------------------------------------------\n");
		aluno3.setNome("Fernando Rocha");
		aluno3.setIdade(30);
		aluno3.setDataNascimento("28/11/1990");
		aluno3.setRegistroGeral("588565566-2");
		aluno3.setNumeroCpf("138.658.759-98");
		aluno3.setNomeMae("Maria Silva");
		aluno3.setNomePai("Getulio Silva");
		aluno3.setDataMatricula("10/01/2021");
		aluno3.setSerieMatriculado("6");
		aluno3.setNomeEscola("Escola Municipal Rubens Berardo");

		System.out.println("\tO nome do aluno é " + aluno3.getNome() + " e nasceu em " + aluno3.getDataNascimento()
				+ "\n tem " + aluno3.getIdade() + " anos de idade, " + "possui RG nº " + aluno3.getRegistroGeral()
				+ " e CPF nº, " + aluno3.getNumeroCpf() + "\n Filho de " + aluno3.getNomePai() + " e "
				+ aluno3.getNomeMae() + ", foi matriculado no dia " + aluno3.getDataMatricula() + " \n na "
				+ aluno3.getSerieMatriculado() + "º Série do ensino fundamental " + "na " + aluno3.getNomeEscola()
				+ ".\n");
	}
}
