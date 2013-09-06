package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Janela extends JFrame implements WindowListener, KeyListener
{
	
	private MenuPrincipal mp;
	private JMenuBar m_b;
	private JMenu m_arquivo;
	private JMenuItem mi_fechar;
	
	public Janela() {
		super("CINE-MOVIES");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		ImageIcon img_icone = new ImageIcon("Imagens\\icone.gif");
		setIconImage(img_icone.getImage());
		addWindowListener(this);
		addKeyListener(this);
		m_b = new JMenuBar();
		m_arquivo = new JMenu("Arquivo");
		m_arquivo.setFont(new Font("SansSerif",Font.PLAIN,15));
		mi_fechar = new JMenuItem("Fechar");
		mi_fechar.setFont(m_arquivo.getFont());
		mi_fechar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (fechar()) System.exit(0);
			}
		});
		m_arquivo.add(mi_fechar);
		m_b.add(m_arquivo);
		setJMenuBar(m_b);
		// 
		mp = new MenuPrincipal(this);
//		mp.setFocusable(false);
		setContentPane(mp);
		// 
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	/** Pergunta para o usuário se ele quer mesmo fechar a janela. Se a escolha for SIM, true é retornado. */
	private boolean fechar() {
		if (JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair da aplicação?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null) == 0) return true;
		return false;
	}
	
	private void menuArquivo() {
		m_arquivo.doClick();
	}
	
	@Override
	public void windowOpened(WindowEvent arg0) {}
	@Override
	public void windowIconified(WindowEvent arg0) {}
	@Override
	public void windowDeiconified(WindowEvent arg0) {}
	@Override
	public void windowDeactivated(WindowEvent arg0) {}
	@Override
	public void windowClosing(WindowEvent arg0) {
		if (fechar()) System.exit(0);				
	}
	@Override
	public void windowClosed(WindowEvent arg0) {}
	@Override
	public void windowActivated(WindowEvent arg0) {}
	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyCode() == KeyEvent.VK_F1)
		{
	        menuArquivo();
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {}
	@Override
	public void keyTyped(KeyEvent arg0) {}
}