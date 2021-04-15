package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class App {
	public static void main(String[] args) throws Exception {

		try {

			lerArquivo();

			String login = JOptionPane.showInputDialog("Informe o login ");
			String senha = JOptionPane.showInputDialog("Informe a senha");

			/* Modificação para implemetanção de interface */
			/* PermitirAcesso permitirAcesso = new Secretario(login, senha); */

			if (new FuncaoAutenticacao(new Diretor(login, senha))
					.autenticar()) {/*
									 * Vou travar o contrato para autorizar somente quem realmente tem o contrato
									 * 100% legítimo
									 */
				List<Aluno> alunos = new ArrayList<Aluno>();
				/*
				 * É Uma lista que dentro dela temos uma chave que identifica uma lista ou uma
				 * sequencia de valores
				 */
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				/* Quantidade de aluno a ser inserido na lista */
				for (int qtd = 1; qtd <= 1; qtd++) {
					/* Objeto na memória */
					/* new Aluno(); é uma Instancia, ((criação de Objeto)) */
					/* aluno1 é uma referência para o objeto Aluno() */

					/* SET inserindo o dado no objeto */
					/*---------------------------------------------------------------------------*/
					String nome = JOptionPane.showInputDialog("Nome do aluno: " + qtd + " ?");
					String idade = JOptionPane.showInputDialog("Idade: ");
					/*
					 * String dataNascimento = JOptionPane.showInputDialog(" Data de nascimento: ");
					 * String rg = JOptionPane.showInputDialog("Registro geral: "); String cpf =
					 * JOptionPane.showInputDialog("CPF: "); String mae =
					 * JOptionPane.showInputDialog(" Nome da maẽ: "); String pai =
					 * JOptionPane.showInputDialog(" Nome do pai: "); String matricula =
					 * JOptionPane.showInputDialog("Data da matricula: "); String serie =
					 * JOptionPane.showInputDialog("Qual série: "); String escola =
					 * JOptionPane.showInputDialog(" Nome da escola: ");
					 * 
					 * /
					 ***************************************************************/

					Aluno aluno1 = new Aluno();/* João */
					/* Dados pessoais do Aluno */
					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));

					/*
					 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
					 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai); /*
					 * Dados escolares / aluno1.setDataMatricula(matricula);
					 * aluno1.setSerieMatriculado(serie); aluno1.setNomeEscola(escola); /* Insere
					 * dados nos objetos Aluno e Disciplina
					 */

					/* for percorre as 4 disciplinas e as 4 notas */

					for (int pos = 1; pos <= 1; pos++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + " ?");
						String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + " ?");
						Disciplina disciplina = new Disciplina();

						disciplina.setDisciplina(nomeDisciplina);
//						disciplina.setNota(Double.valueOf(notaDisciplina));
						aluno1.getDisciplina().add(disciplina);

					}
					/* vERIFICA SE DESEJA REMOVER ALGUMA MATÉRIA */
					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

					if (escolha == 0) {/* OPÇÂO SIM é Zero */

						int continuarRemover = 0;
						int pos = 1;
						while (continuarRemover == 0) {
							String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4 ?");
							aluno1.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - pos);
							pos++;
							continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover? ");

						}

					}
					alunos.add(aluno1);
				}

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {
					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno);/* REPROVADO */
					}
				}

				System.out.println(
						"---------------------------------------------------------------------------------------------------");

				System.out.println(
						"-----------------------------------Lista dos aprovados---------------------------------");
 				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println(" Aluno(a) " + aluno.getNome() + " está " + aluno.getAlunoAprovado2()
							+ " Com média de " + aluno.getMediaNota());

				}

				System.out.println(
						"-----------------------------------Lista dos recuperandos---------------------------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println(" Aluno(a) " + aluno.getNome() + " está em " + aluno.getAlunoAprovado2()
							+ " Com média de " + aluno.getMediaNota());

				}

				System.out.println(
						"-----------------------------------Lista dos rerovados---------------------------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println(" Aluno(a) " + aluno.getNome() + " está " + aluno.getAlunoAprovado2()
							+ " Com média de " + aluno.getMediaNota());

				}

				System.out.println(
						"---------------------------------------------------------------------------------------------------\n");
			} else {
				JOptionPane.showMessageDialog(null, "Acesso não permitido LOGIN ou SENHA inválidos");
			}

		} catch (Exception e) {

			StringBuilder saida = new StringBuilder();

			e.printStackTrace();/* Imprime erro no console Java */
			System.out.println("Mensagem: " + e.getMessage());
			
			for (int pos = 0; pos <= e.getStackTrace().length; pos++) {

				saida.append("\n Classe de classe " + e.getStackTrace()[pos].getClassName());
				saida.append("\n Classe de classe " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n Classe de classe " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\n Class : " + e.getClass().getName());

			}

			JOptionPane.showMessageDialog(null, "Erro " + saida.toString());
			

		} finally {
			/*
			 * Sempre é executado ocorrendo erros ou não Sempre é usado quando se precisa
			 * executar um processo acontecendo erro ou não no sistema
			 */
			JOptionPane.showMessageDialog(null, "Obrigado!! você está aprendendo");
		}

	}

	public static void lerArquivo() throws FileNotFoundException {

		File file = new File("/home/rocha/arquivo.txt");
		Scanner scanner = new Scanner(file);
	}

}
