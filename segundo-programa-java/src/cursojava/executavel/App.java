package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class App {
	public static void main(String[] args) throws Exception {

		List<Aluno> alunos = new ArrayList<Aluno>();

		/* Quantidade de aluno a ser inserido na lista */
		for (int qtd = 1; qtd <= 5; qtd++) {
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
				disciplina.setNota(Double.valueOf(notaDisciplina));
				aluno1.getDisciplina().add(disciplina);

			}

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

		
		System.out.println(
				"---------------------------------------------------------------------------------------------------");
		System.out.println(
				"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println(
				"---------------------------------------------------------------------------------------------------\n");

	}
}
