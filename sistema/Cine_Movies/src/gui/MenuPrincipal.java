package gui;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MenuPrincipal extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PainelCadastro pc;
	private AdministrarClientes adm_c;
	private JTabbedPane jtp_cp;
	private JFrame j;
	
	public MenuPrincipal(JFrame j) {
		this.j = j;
		setLayout(new FlowLayout(FlowLayout.CENTER));
		pc = new PainelCadastro();
		jtp_cp = new JTabbedPane();
		jtp_cp.setFocusable(false);
		jtp_cp.add(pc);
		jtp_cp.setTitleAt(0,"ADMINISTRAR");
		add(jtp_cp);
		setFocusable(false);
	}
	/** Botões da aba cadastro. */
	private class PainelCadastro extends JPanel
	{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JButton[] botoes =
		{
			new JButton("Clientes")
		};
		
		public PainelCadastro() {
			super();
			setLayout(new FlowLayout());
			for (JButton botao : botoes)
			{
				botao.setFont(new Font("SansSerif",Font.PLAIN,18));
				botao.setFocusable(false);
				botao.setCursor(new Cursor(Cursor.HAND_CURSOR));
				add(botao);
			}

			botoes[0].addActionListener(new AdmClienteAction());
		}
	}
	
	private class AdmClienteAction extends AbstractAction {
		
		public AdmClienteAction() {
			super("Administrar Cliente");
		}
		
	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	EventQueue.invokeLater(new Runnable() {
				@Override
				public void run() {
					if (adm_c == null) adm_c = new AdministrarClientes(j,MenuPrincipal.this);
						j.setContentPane(adm_c);
						j.pack();
						j.setLocationRelativeTo(null);
					}
			});
	    }
	}
}