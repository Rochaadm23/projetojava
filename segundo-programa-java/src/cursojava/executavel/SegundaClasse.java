package cursojava.executavel;

/* condições lógicas com IF e ELSE*/

/*if (media >= 70) {
System.out.println("Aluno aprovado com a media " + media);

} else if (media >= 40 && media <= 69) {
System.out.println("Aluno em recuperação com media " + media);
} else {
System.out.println("Aluno reprovado com a media " + media);
}

**Operadores ternários/

String saidaResultado;

saidaResultado = media >= 70 ? "Aluno Aprovado": (media >= 40 && media <= 69)? "Aluno em recuperação": "Aluno Reprovado";
System.out.println(saidaResultado);

* Operações aninhadas: São operações dentro de operações *
		if (media >= 50) {
			if (media >= 70) {
				if (media >= 90) {
					System.out.println("O Aluno está aprovado direto - Parabéns " + media);
				} else {
					System.out.println("Aluno Aprovado " + media);
				}

			}
		} else {
			System.out.println("Aluno reprovado direto " + media);
		}

*
/SWITCH CASE: OPERAÇÕES EXATAS/
		
		int dia = 1;
		switch (dia) {
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda");
			break;
		case 3:
			System.out.println("terça");			
			break;

		default: System.out.println("Outro dia");
			break;
		}

*
*/

public class SegundaClasse {
	public static void main(String[] args) {

		double nota1 = 80;
		double nota2 = 05;
		double nota3 = 50;
		double nota4 = 9;

		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println(media);
	}
}