package gui.action;

import gui.AdministrarClientePanel;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import pojo.Cliente;
import dao.ClienteDAOImpl;

/**
 * Action para cadastro de cliente.
 * @author Ândrei
 */
public class CadastrarClienteAction extends AbstractAction {

	private static final long serialVersionUID = 1L;

	private AdministrarClientePanel panel;

	public CadastrarClienteAction(AdministrarClientePanel panel) {
		super("Cadastrar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Cliente cli = panel.getCliente();
		ClienteDAOImpl dao = new ClienteDAOImpl();
		dao.inserirCliente(cli);
	}
}