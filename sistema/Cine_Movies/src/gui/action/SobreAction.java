package gui.action;

import gui.Sobre;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

/**
 * A��o que abre a janela 'Sobre'.
 * @author �ndrei
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