package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MenuPrincipal extends JPanel {

	private PainelCadastro pc;
	private AdministrarClientes adm_c;
	private Painel2 p2;
	private Painel3 p3;
	private JTabbedPane jtp_cp;
	private JTabbedPane jtp_c2;
	private JTabbedPane jtp_c3;
	private JFrame j;
	
	public MenuPrincipal(JFrame j) {
		this.j = j;
		setLayout(new GridLayout(3, 1));
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
		jtp_c2.setTitleAt(0,"?");
		jtp_c3.add(p3);
		jtp_c3.setTitleAt(0,"?");
		add(jtp_cp);
		add(jtp_c2);
		add(jtp_c3);
		setFocusable(false);
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
				botao.setFont(new Font("SansSerif",Font.PLAIN,18));
				botao.setFocusable(false);
				add(botao);
			}
			botoes[0].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					EventQueue.invokeLater(new Runnable() {
						@Override
						public void run() {
							if (adm_c == null) adm_c = new AdministrarClientes(j);
							j.setContentPane(adm_c);
//							adm_c.updateUI();
							j.pack();
							j.setLocationRelativeTo(null);
							}
					});
				}
			});
		}
	}
	
	private class Painel2 extends JPanel
	{
		private JButton[] botoes =
		{
			new JButton("?"),
			new JButton("?"),
			new JButton("?"),
			new JButton("?"),
			new JButton("?")
		};
		
		public Painel2() {
			super();
			setLayout(new GridLayout(1, 5));
			for (JButton botao : botoes)
			{
				botao.setFocusable(false);
				add(botao);
			}
		}
	}
	
	private class Painel3 extends JPanel
	{
		private JButton[] botoes =
		{
			new JButton("?"),
			new JButton("?"),
			new JButton("?"),
			new JButton("?"),
			new JButton("?")
		};
		
		public Painel3() {
			super();
			setLayout(new GridLayout(1, 5));
			for (JButton botao : botoes)
			{
				botao.setFocusable(false);
				add(botao);
			}
		}
	}
}