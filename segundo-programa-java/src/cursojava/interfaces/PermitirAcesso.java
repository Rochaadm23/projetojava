package cursojava.interfaces;

/*Essa interface será nosso contrato de autenticação*/
public interface PermitirAcesso {

		/*Apenas declaração do método*/
		public boolean autenticar(String login, String senha);
}
