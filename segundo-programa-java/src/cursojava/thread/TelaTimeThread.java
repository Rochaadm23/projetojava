package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog{

	public TelaTimeThread() {
	/*Executa o que estiver dentro no momento da abertura ou execução*/
		
		setTitle("TIME THREAD");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		
		
		
		
		/*Sempre será o ultimo comando*/
		setVisible(true);/*Torna a tela vísivel para o usuário*/
		
	}
	
}
