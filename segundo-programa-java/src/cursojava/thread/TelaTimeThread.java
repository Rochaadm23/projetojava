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

	private JLabel descricaoHora = new JLabel("Time Thread 1 ");
	private JTextField mostraTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel("Time Thread 2 ");
	private JTextField mostraTempo2 = new JTextField();

	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");

	
	/*PRIMEIRA THREAD*/
	private Runnable thread = new Runnable() {

		@Override
		public void run() {
			while (true) { /* fica sempre rodando */

				mostraTempo
						.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}

		}

	};

	private Thread thread1Time;
	
	/*---------------------THREAD2-------------------*/
	
		/*CRIANDO A SEGUNDA THREAD*/
	Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				mostraTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private Thread thread2Time;
	
	
	
	
	
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
		mostraTempo.setEditable(false);
		jpanel.add(mostraTempo, gridBagConstraints);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jpanel.add(descricaoHora2, gridBagConstraints);

		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo2.setEditable(false);
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
				// EXECUTA O CLIC DO BOTÃO START
				thread1Time = new Thread(thread);
				thread1Time.start();
				
				
				thread2Time = new Thread(thread2);
				thread2Time.start();
		
				/*Habilita o stop ao clicar no Start*/
				jButton.setEnabled(false);
				jButton2.setEnabled(true);
			
			}
		});
		
		
		
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// EXECUTA O CLIC DO BOTÃO STOP
				thread1Time.stop();
				thread2Time.stop();
				
				/*Habilita o start ao clicar no Stop*/
				jButton.setEnabled(true);
				jButton2.setEnabled(false);
				
			}
		});
		
		
		
		
		jButton2.setEnabled(false);
		
		
		
		
		add(jpanel, BorderLayout.WEST);
		/* Sempre será o ultimo comando */
		setVisible(true);/* Torna a tela vísivel para o usuário */

	}

}
