/**     int maiorIdade = 18;
        int idosoIdade = 60;
        int jovemIdade = 16;
        int criancaIdade = 7;

        String cpf = "123.456.587-69";

        System.out.println("Maior idade é " + maiorIdade);
        System.out.println("Idoso idade é " + idosoIdade);
        System.out.println("Jovem idade é " + jovemIdade);
        System.out.println("Criança idade é " + criancaIdade);
        ----------------------------------------------------------------------------------
        /** Variável Global é acessível a todos e o seu valor é compartilhado. /
        static int maiorIdadeGlobal = 40;
        /**Main é um método auto executável em Java /
         public static void main(String[]args) {
         
            /*variavel local, porque pertence a esse método, só pode ser usado neste método/
            int maiorIdade = 18;
            System.out.println("Valor da variavel Local " + maiorIdade);
            metodo2();
        }

        public static void metodo2() {
            System.out.println("Valor da variável Global " + maiorIdadeGlobal);
        }  
        -----------------------------------------------------------------------------------------
         /**tipo de dado double *
         double nota1 = 90;
         double nota2 = 70;
         double nota3 = 50;
         double nota4 = 88;
         
         double mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
         
         System.out.println("Média das notas = " + mediaFinal);
        ----------------------------------------------------------------------------------

         /**CHAR representa uma letra ou caractere *

        char pessoaFeminino ='F';
        
        if(pessoaFeminino == 'F'){
            System.out.println("Feminino");
        }else{
            System.out.println("Maculino");
        }
        
        */

package Cursojava.executavel;

public class PrimeiraClasseJava {

/**Main é um método auto executável em Java */
    public static void main(String[]args) {
       
        /**String no java sempre será texto de qualquer tamanho */
        /**Concatenação = Unir ou juntar dados */
        String nome = "Fernando";
        String cpf = "488.789.789-85";
        String telefone = "21 99589-1029";
        String endereco = "Rio de Janeiro - RJ";
        String saida = "Olá me chamo " + nome + " meu CPF é " + cpf +
        " meu contato é " + telefone + " eu moro em " + endereco;
        
        System.out.println(saida);

    }     
}
