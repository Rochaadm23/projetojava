package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	public static void main(String[] args) {

		/* Criação do aluno */
		Aluno aluno = new Aluno();
		aluno.setNome("fernando Ribeiro");
		aluno.setNomeEscola("JDEV");

		/* ciação da disciplina */
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		double notas[] = { 8.8, 9.7, 7.6, 6.8 };
		disciplina.setNota(notas);

		aluno.getDisciplina().add(disciplina);
		//////////////////////////////////////
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Curso de Python");
		double notasPython[] = { 7.1, 5.7, 9.6, 7.8 };
		disciplina2.setNota(notasPython);

		aluno.getDisciplina().add(disciplina2);

		Aluno[] arrayAlunos = new Aluno[1];

		arrayAlunos[0] = aluno;

		for (int i = 0; i < arrayAlunos.length; i++) {

			System.out.println("Nome do aluno é " + arrayAlunos[i].getNome());

			for (Disciplina d : arrayAlunos[i].getDisciplina()) {
				System.out.println("Disciplina " + d.getDisciplina());

				for (int j = 0; j < d.getNota().length; j++) {
					System.out.println("A nota numero " + (j + 1) + d.getNota()[j]);
				}

			}

		}

	}
}
