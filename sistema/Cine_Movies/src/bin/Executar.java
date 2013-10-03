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
				} catch (Exception e) {JOptionPane.showMessageDialog(null, "Não foi possível encontrar o LAF Graphite.");};
				new Janela();
			}
		});
	}
}