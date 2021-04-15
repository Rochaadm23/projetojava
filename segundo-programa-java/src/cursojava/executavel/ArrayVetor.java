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

		System.out.println("Nome do aluno é " + aluno.getNome() + " Inscrito no curso " + aluno.getNomeEscola());
		for (Disciplina d : aluno.getDisciplina()) {
			System.out.println("---------- Disciplina do Aluno ----------\n");
			System.out.println("Discplina: " + d.getDisciplina());
			System.out.println("As notas da disciplina são: ");
			
			double notaMaxima = 0;
			for (int i = 0; i < d.getNota().length; i++) {
				System.out.println("Nota do bimestre " + (i + 1) + " é igual " + d.getNota()[i]);
				if(i == 0 ) {
					notaMaxima = d.getNota()[i];
				}else {
					if (d.getNota()[i] < notaMaxima) {
						notaMaxima = d.getNota()[i];
						
					}
				}
				
			}
			System.out.println("\nA menor nota da Disciplina = " + d.getDisciplina() + " e de valor : " + notaMaxima);
		}
		

	}
}
