package gui.action;

import gui.Sobre;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

/**
 * Ação que abre a janela 'Sobre'.
 * @author Ândrei
 */
public class SobreAction extends AbstractAction {

	private static final long serialVersionUID = 1L;
	private JFrame frame;

	public SobreAction(JFrame frame) {
		super("Sobre");
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new Sobre(frame);
	}
}