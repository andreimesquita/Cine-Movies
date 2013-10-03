package gui.action;

import gui.AdministrarClientePanel;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class CancelarCadastroClienteAction extends AbstractAction {
	private static final long serialVersionUID = 1L;
		
	private AdministrarClientePanel panel;

	public CancelarCadastroClienteAction(AdministrarClientePanel panel) {
		super("Cancelar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		panel.reset();
	}
}