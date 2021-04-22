package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TelaTimeThread extends JDialog {

	private JPanel jpanel = new JPanel(new GridBagLayout());/* Painel de copmponentes */

	private JLabel descricaoHora = new JLabel("Nome ");
	private JTextField mostraTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel("E-mail ");
	private JTextField mostraTempo2 = new JTextField();

	private JButton jButton = new JButton("Add Lista");
	private JButton jButton2 = new JButton("Stop");

	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	/* PRIMEIRA THREAD */

	public TelaTimeThread() {
		/* Executa o que estiver dentro no momento da abertura ou execução */

		setTitle("TIME THREAD");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);

		/**//* Controlador de posicionamento de componentes */
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jpanel.add(descricaoHora, gridBagConstraints);

		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;

		jpanel.add(mostraTempo, gridBagConstraints);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jpanel.add(descricaoHora2, gridBagConstraints);

		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;

		jpanel.add(mostraTempo2, gridBagConstraints);

		/* Retornando o espaço para um */

		gridBagConstraints.gridwidth = 1;

		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jpanel.add(jButton, gridBagConstraints);

		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jpanel.add(jButton2, gridBagConstraints);

		/*--------------------THREAD1----------------------*/
		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				for (int qtd = 0; qtd < 100; qtd++) {/*Simulando 100 envios*/
					ObjetoFilaThread filaThread = new ObjetoFilaThread();
					filaThread.setNome(mostraTempo.getText());
					filaThread.setEmail(mostraTempo2.getText() + " - " + qtd);

					fila.add(filaThread);
				}
			}
		});

		jButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// EXECUTA O CLIC DO BOTÃO STOP
				fila.stop();
				fila = null;
			}
		});

		fila.start();

		add(jpanel, BorderLayout.WEST);
		/* Sempre será o ultimo comando */
		setVisible(true);/* Torna a tela vísivel para o usuário */

	}

}
