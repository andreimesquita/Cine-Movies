package gui.action;

import gui.AdministrarClientePanel;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
    	try {
			Cliente cli = panel.getCliente();
			ClienteDAOImpl dao = new ClienteDAOImpl();
			dao.inserirCliente(cli);
			JOptionPane.showConfirmDialog(panel, "Cliente cadastrado com sucesso!", "Cadastrar", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(panel.getFrame(), "O cliente não foi cadastrado com sucesso.");
		} finally {
			panel.reset();
			CardLayout card = panel.getCard();
			JFrame frame = panel.getFrame();
			card.show(frame.getContentPane(), "Vazio");

		}
	}
}