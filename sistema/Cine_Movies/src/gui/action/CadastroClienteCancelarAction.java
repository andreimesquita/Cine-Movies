package gui.action;

import gui.AdministrarClientePanel;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
/**
 * Action para cancelar o cadastro de cliente.
 * @author Ândrei
 */
public class CadastroClienteCancelarAction extends AbstractAction {
	private static final long serialVersionUID = 1L;
		
	private AdministrarClientePanel panel;

	public CadastroClienteCancelarAction(AdministrarClientePanel panel) {
		super("Cancelar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		panel.reset();
		CardLayout card = panel.getCard();
		JFrame frame = panel.getFrame();
		card.show(frame.getContentPane(), "Vazio");
		frame.pack();
		frame.setLocationRelativeTo(null);
	}
}