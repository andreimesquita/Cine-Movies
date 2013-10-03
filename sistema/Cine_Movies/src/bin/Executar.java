package bin;

import gui.Janela;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


public class Executar {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
				} catch (Exception e) {JOptionPane.showMessageDialog(null, "N�o foi poss�vel encontrar o LAF Graphite.");};
				new Janela();
			}
		});
	}
}