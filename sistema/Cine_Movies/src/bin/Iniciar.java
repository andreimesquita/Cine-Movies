package bin;
import gui.JCineMoviesGerenteApp;
import java.awt.EventQueue;
import javax.swing.UIManager;

public class Iniciar {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					JCineMoviesGerenteApp window = new JCineMoviesGerenteApp();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}