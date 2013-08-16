package principal;

import janela.Janela;

import javax.swing.SwingUtilities;

public class Executar {

	public static void main(String[] args) {
		SwingUtilities.invokeLater
		(
			new Runnable()
			{
				public void run() 
				{
					new Janela();
				};
			}
		);
	}
}