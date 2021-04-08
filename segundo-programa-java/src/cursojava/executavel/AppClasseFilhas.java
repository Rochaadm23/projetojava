package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class AppClasseFilhas {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setNome("Fernando");
		aluno.setIdade(15);
		
		
		Diretor diretor = new Diretor();
		
		diretor.setNome("Marcio");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Maria"); 
		secretario.setIdade(45);
		
		System.out.println(aluno.getNome());
		System.out.println(diretor.getNome());
		System.out.println(secretario.getNome());
		
		
		System.out.println(aluno.pessoaMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario aluno " + aluno.salario());
		System.out.println("Salario diretor " + diretor.salario());
		System.out.println("Salario secretário " + secretario.salario());
		
	
	}

}
