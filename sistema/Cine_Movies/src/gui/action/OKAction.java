package gui.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JDialog;
/**
 * Ação do botão OKAction
 * @author Ândrei
 *
 */
public class OKAction extends AbstractAction {
	private static final long serialVersionUID = 1L;

	private JDialog d;
	
	public OKAction(JDialog d) {
		super("OK");
	    this.d = d;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		d.dispose();
		
	}
}