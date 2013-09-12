package gui;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class Sobre extends JDialog {
	
	private ImageIcon icone;
	private JLabel lblNomePrograma;
	private JLabel lblicone;
	private JLabel lblautor;
	private JPanel painelNome;
	private JPanel painelTexto;
	private JTextPane texto;
	private JButton btnOK;
	
	public Sobre(Frame j) {
		super(j);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setAlwaysOnTop(true);
		initAtributos();
		initDialog();
		addAtributos();
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void initDialog() {
		getContentPane().setLayout(new GridLayout(4, 1));
	}
	
	private void initAtributos() {
		icone = new ImageIcon("Imagens\\icone.gif");
		lblicone = new JLabel(icone);
		lblNomePrograma = new JLabel("Cine-Movies v0.0.1   (BETA)");
		lblNomePrograma.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomePrograma.setLabelFor(lblicone);
		painelNome = new JPanel();
		painelNome.setLayout(new BorderLayout(0, 0));
		painelNome.add(lblicone, BorderLayout.WEST);
		painelNome.add(lblNomePrograma);
		lblautor = new JLabel("Autor: \u00C2ndrei d'Oliveira Mesquita Schuch");
		lblautor.setHorizontalAlignment(SwingConstants.CENTER);
		painelTexto = new JPanel();
		painelTexto.setLayout(new BorderLayout(0, 0));
		texto = new JTextPane();
		painelTexto.add(texto);
		btnOK = new JButton("OK");
		btnOK.addActionListener(new OKAction());
	}
	
	private void addAtributos() {
		getContentPane().add(painelNome);
		getContentPane().add(lblautor);
		getContentPane().add(painelTexto);
	}
	
	private class OKAction extends AbstractAction {
		public OKAction() {
			super("OK");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Sobre.this.dispose();
		}
	}
}