package gui;

import gui.action.CadastrarAction;
import gui.action.SairAction;
import gui.action.SobreAction;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class JCineMoviesGerenteApp {

		private Janela frame;
		private AdministrarClientePanel acp;
		private CadastrarAction cadastrarAction;
		// private final Action action_1 = new SwingAction_1();
		private CardLayout card;

		/**
		 * Create the application.
		 */
		public JCineMoviesGerenteApp() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new Janela();
			frame.setIconImage(Toolkit.getDefaultToolkit().getImage("Imagens/cinemovies.jpg"));
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			card = new CardLayout(0, 0);
			
			frame.getContentPane().setLayout(card);
			
			acp = new AdministrarClientePanel(frame, card);
			
									
			ImageIcon img_icone = new ImageIcon("Imagens\\icone.gif");
			frame.setIconImage(img_icone.getImage());
			JMenuBar m_b = new JMenuBar();
			JMenu m_arquivo = new JMenu("Arquivo");
			m_arquivo.setFont(new Font("SansSerif",Font.PLAIN,15));
			m_arquivo.setMnemonic(KeyEvent.VK_F1);
			cadastrarAction = new CadastrarAction(frame,card);
			JMenuItem cadastrarCliente = new JMenuItem(cadastrarAction);
			m_arquivo.add(cadastrarCliente);
			JMenuItem oVazio = new JMenuItem(new MyAction(frame,card));
			m_arquivo.add(oVazio);
			JMenu m_ajuda = new JMenu("Ajuda");
			m_ajuda.setFont(m_arquivo.getFont());
			m_ajuda.setMnemonic(KeyEvent.VK_F2);
			JMenuItem mi_fechar = new JMenuItem("Fechar");
			mi_fechar.setMnemonic(KeyEvent.VK_F);
			mi_fechar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
			mi_fechar.setFont(m_arquivo.getFont());
			mi_fechar.addActionListener(new SairAction());
			JMenuItem mi_sobre = new JMenuItem("Sobre");
			mi_sobre.setFont(m_arquivo.getFont());
			mi_sobre.addActionListener(new SobreAction(frame));
			m_ajuda.add(mi_sobre);
			m_arquivo.add(mi_fechar);
			m_b.add(m_arquivo);
			m_b.add(m_ajuda);
			
			JPanel painel = new JPanel();
			Label lbl = new Label("oVazio");
			painel.add(lbl);
			
			frame.getContentPane().add(painel,"oVazio");
			frame.getContentPane().add(acp, "TelaCadastroCliente");
			
			frame.setJMenuBar(m_b);
			
			frame.pack();
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
		}

		private class MyAction extends AbstractAction {
			private JFrame frame;
			private CardLayout card;
			
			public MyAction(JFrame frame, CardLayout card) {
				this.frame = frame;
				this.card = card;
				
				putValue(NAME, "Painel");
				putValue(SHORT_DESCRIPTION, "Some short description");
			}
			public void actionPerformed(ActionEvent e) {
				this.card.show(this.frame.getContentPane(), "oVazio" );
				this.frame.pack();
				this.frame.setLocationRelativeTo(null);
			}
		}
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
						JCineMoviesGerenteApp window = new JCineMoviesGerenteApp();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
}