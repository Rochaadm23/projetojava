package cursojava.classes;

import java.util.Arrays;

public class Disciplina {
	/* Notas e disciplinas */
	/*Essa classe DiscIplina servirá para todos os objetos e instancias de notas e materiais*/
	/*Cada disciplina terá quatro notas durante o ano inteiro*/
	private double []nota = new double[4];
	private String disciplina;
	
	
	
	
	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
	public double getMediaNotas() {
		
		double somaTotal = 0;
		
		for (int i = 0; i < nota.length; i++) {
			somaTotal += nota[i];
		}
		
		return somaTotal / 4;
	}	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
		result = prime * result + Arrays.hashCode(nota);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		if (!Arrays.equals(nota, other.nota))
			return false;
		return true;
	}

	
}
