package janela;

import janela.cliente.TestAdministrarClientes;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Janela extends JFrame 
{
	private Container cp;
	private PainelCadastro pc;
	private Painel2 p2;
	private Painel3 p3;
	private JTabbedPane jtp_cp;
	private JTabbedPane jtp_c2;
	private JTabbedPane jtp_c3;
	private JMenuBar m_b;
	private JMenu m_arquivo;
	private JMenuItem mi_fechar;
	
	public Janela() {
		super("CINE-MOVIES");
		getContentPane().setFocusable(false);
		m_b = new JMenuBar();
		m_arquivo = new JMenu("Arquivo");
		mi_fechar = new JMenuItem("Fechar");
		m_arquivo.add(mi_fechar);
		m_b.add(m_arquivo);
		setJMenuBar(m_b);
		cp = getContentPane();
		cp.setLayout(new GridLayout(3, 1));
		pc = new PainelCadastro();
		p2 = new Painel2();
		p3 = new Painel3();
		jtp_cp = new JTabbedPane();
		jtp_cp.setFocusable(false);
		jtp_c2 = new JTabbedPane();
		jtp_c2.setFocusable(false);
		jtp_c3 = new JTabbedPane();
		jtp_c3.setFocusable(false);
		jtp_cp.add(pc);
		jtp_cp.setTitleAt(0,"CADASTRO");		
		jtp_c2.add(p2);
		jtp_c2.setTitleAt(0,"CADASTRO");
		jtp_c3.add(p3);
		jtp_c3.setTitleAt(0,"CADASTRO");
		cp.add(jtp_cp);
		cp.add(jtp_c2);
		cp.add(jtp_c3);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private class PainelCadastro extends JPanel
	{
		private JButton[] botoes =
		{
			new JButton("Clientes"),
			new JButton("Filmes"),
			new JButton("Generos"),
			new JButton("Categorias"),
			new JButton("Usuários")
		};
		
		public PainelCadastro() {
			super();
			setLayout(new GridLayout(1, 5));
			for (JButton botao : botoes)
			{
				botao.setPreferredSize(new Dimension(50,50));
				botao.setFocusable(false);
				add(botao);
			}
			botoes[0].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					new TestAdministrarClientes(Janela.this);
				}
			});
		}
	}
	
	private class Painel2 extends JPanel
	{
		private JButton[] botoes =
		{
			new JButton("Clientes"),
			new JButton("Filmes"),
			new JButton("Generos"),
			new JButton("Categorias"),
			new JButton("Usuários")
		};
		
		public Painel2() {
			super();
			setLayout(new GridLayout(1, 5));
			for (JButton botao : botoes)
			{
				add(botao);
			}
		}
	}
	
	private class Painel3 extends JPanel
	{
		private JButton[] botoes =
		{
			new JButton("Clientes"),
			new JButton("Filmes"),
			new JButton("Generos"),
			new JButton("Categorias"),
			new JButton("Usuários")
		};
		
		public Painel3() {
			super();
			setLayout(new GridLayout(1, 5));
			for (JButton botao : botoes)
			{
				add(botao);
			}
		}
	}
}