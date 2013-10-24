package gui.action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
public class PesquisaCliAction extends AbstractAction {

	private static final long serialVersionUID = 1L;

	private JFrame frame;
	private CardLayout card;

	public PesquisaCliAction(JFrame frame, CardLayout card) {
		super("Pesquisar Cliente");
		this.frame = frame;
		this.card = card;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		card.show(frame.getContentPane(), "pesquisaCli");
		frame.pack();
		frame.setLocationRelativeTo(null);
	}
}